package com.project.booking.service;

import java.util.Iterator;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.booking.dto.BookingDTO;
import com.project.booking.entity.BookingEntity;
import com.project.booking.jpa.BookingJpaRepositoryInterface;

@Service
public class BookingService {

	@Autowired
	BookingJpaRepositoryInterface bookingJpaRepositoryInterface ;
	
	//long bookingID, String phoneNum, long theatreId, long movieId, long showId, Set<Long> seatIds) {
	public void saveBooking(BookingDTO bookingDTO) {
		StringBuffer stringBuffer = new StringBuffer();
		for (Iterator iterator = bookingDTO.getSeatIds().iterator(); iterator.hasNext();) {
			Long type = (Long) iterator.next();
			stringBuffer.append(type).append("|");
		}
		
		stringBuffer.deleteCharAt(stringBuffer.lastIndexOf("|"));
		BookingEntity bookingEntity = new BookingEntity(bookingDTO.getBookingID(), bookingDTO.getPhoneNum(), 
				bookingDTO.getTheatreId(), bookingDTO.getMovieId(), bookingDTO.getShowId(), stringBuffer.toString());
		bookingJpaRepositoryInterface.save(bookingEntity);
		
	}
}
