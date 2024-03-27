package com.project.booking.entity;

import java.io.Serializable;
import java.util.Set;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "booking")
public class BookingEntity implements Serializable{
	@Id
	//@GeneratedValue(strategy = GenerationType.AUTO)
	private long bookingID;	
	private String phoneNum;
	private long theatreId;
	private long movieId;
	private long showId;		
	private String seatIds;
	
	
	public BookingEntity(long bookingID, String phoneNum, long theatreId, long movieId, long showId,String seatIds) {
		super();
		this.bookingID = bookingID;
		this.phoneNum = phoneNum;
		this.theatreId = theatreId;
		this.movieId = movieId;
		this.showId = showId;
		this.seatIds = seatIds;
	}
	
	
	public BookingEntity() {
		super();
	}


	public long getBookingID() {
		return bookingID;
	}
	public void setBookingID(long bookingID) {
		this.bookingID = bookingID;
	}
	public String getPhoneNum() {
		return phoneNum;
	}
	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}
	public long getTheatreId() {
		return theatreId;
	}
	public void setTheatreId(long theatreId) {
		this.theatreId = theatreId;
	}
	public long getMovieId() {
		return movieId;
	}
	public void setMovieId(long movieId) {
		this.movieId = movieId;
	}
	public long getShowId() {
		return showId;
	}
	public void setShowId(long showId) {
		this.showId = showId;
	}
	public String getSeatIds() {
		return seatIds;
	}
	public void setSeatIds(String seatIds) {
		this.seatIds = seatIds;
	}
	
	

}
