package com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external;

import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.model.BookingRequest;

import java.util.*;

public class BookingDAO {

	private final Map<String, BookingRequest> bookings = new HashMap<>();

	public String save(BookingRequest bookingRequest) {
		String id = UUID.randomUUID().toString();
		bookings.put(id, bookingRequest);
		return id;
	}
	
	public BookingRequest get(String id) {
		return bookings.get(id);
	}
	
	public void delete(String bookingId) {
		bookings.remove(bookingId);
	}

}
