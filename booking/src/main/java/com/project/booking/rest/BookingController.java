package com.project.booking.rest;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.booking.activemq.producer.ShowProducer;
import com.project.booking.dto.BookingDTO;
import com.project.booking.service.BookingService;




@RestController
@RequestMapping("/book")
public class BookingController {
	
	@Autowired
	ShowProducer producer;
	
	@Autowired
	BookingService bookingService; 
	
	@RequestMapping("/")
	public String book() {
		//fetch data from Project_Db for the data
		//create booking table
		//create sub-booking table for multiple entries
		//update show table - produce
		BookingDTO bookingDTO = new BookingDTO();
		bookingDTO.setBookingID(0);
		bookingDTO.setMovieId(1);
		bookingDTO.setPhoneNum("setPhoneNum");
		bookingDTO.setShowId(4);
		bookingDTO.setTheatreId(5);
		Set<Long> seatIds = new HashSet<Long>();
		seatIds.add(9l);
		seatIds.add(10l);
		bookingDTO.setSeatIds(seatIds);
		
		bookingService.saveBooking(bookingDTO);
		producer.sendShowData(bookingDTO);
		System.out.println("BookingController.book() message going"+bookingDTO.getPhoneNum());
		return "Welcome to Rest Booking";
	}

}

