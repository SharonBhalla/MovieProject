package com.project.booking.dto;

import java.io.Serializable;
import java.util.Set;


public class BookingDTO implements Serializable{
	private long bookingID;
	private String phoneNum;
	private long theatreId;
	private long movieId;
	private long showId;	
	
	private Set<Long> seatIds;
	
	
	public BookingDTO(long bookingID, String phoneNum, long theatreId, long movieId, long showId, Set<Long> seatIds) {
		super();
		this.bookingID = bookingID;
		this.phoneNum = phoneNum;
		this.theatreId = theatreId;
		this.movieId = movieId;
		this.showId = showId;
		this.seatIds = seatIds;
	}
	
	
	public BookingDTO() {
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
	public Set<Long> getSeatIds() {
		return seatIds;
	}
	public void setSeatIds(Set<Long> seatIds) {
		this.seatIds = seatIds;
	}
	
	

}
