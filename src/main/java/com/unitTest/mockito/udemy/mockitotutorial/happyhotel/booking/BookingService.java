package com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking;

import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.BookingDAO;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.MailSender;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.PaymentService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.RoomService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.model.BookingRequest;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.utis.CurrencyConverter;

import java.time.temporal.ChronoUnit;

public class BookingService {

	private final PaymentService paymentService;
	private final RoomService roomService;
	private final BookingDAO bookingDAO;
	private final MailSender mailSender;

	private final static double BASE_PRICE_USD = 50.0;

	//No Dependency
	public double calculatePrice(BookingRequest bookingRequest) {
		long nights = ChronoUnit.DAYS.between(bookingRequest.getDateFrom(), bookingRequest.getDateTo());
		return BASE_PRICE_USD * bookingRequest.getGuestCount() * nights;
	}

	//dependency on roomService
		// calls a method on dependency also
	public int getAvailablePlaceCount() {
		return roomService.getAvailableRooms()
				.stream()
				.map(room -> room.getCapacity())
				.reduce(0, Integer::sum);
	}
	

	public double calculatePriceEuro(BookingRequest bookingRequest) {
		long nights = ChronoUnit.DAYS.between(bookingRequest.getDateFrom(), bookingRequest.getDateTo());
		return CurrencyConverter.toEuro(BASE_PRICE_USD * bookingRequest.getGuestCount() * nights);
	}

	public String makeBooking(BookingRequest bookingRequest) {
		String roomId = roomService.findAvailableRoomId(bookingRequest);
		double price = calculatePrice(bookingRequest);

		if (bookingRequest.isPrepaid()) {
			paymentService.pay(bookingRequest, price);
		}

		bookingRequest.setRoomId(roomId);
		String bookingId = bookingDAO.save(bookingRequest);
		roomService.bookRoom(roomId);
		mailSender.sendBookingConfirmation(bookingId);
		return bookingId;
	}
	
	public void cancelBooking(String id) {
		BookingRequest request = bookingDAO.get(id);
		roomService.unbookRoom(request.getRoomId());
		bookingDAO.delete(id);
	}

	public BookingService(PaymentService paymentService, RoomService roomService, BookingDAO bookingDAO,
			MailSender mailSender) {
		super();
		this.paymentService = paymentService;
		this.roomService = roomService;
		this.bookingDAO = bookingDAO;
		this.mailSender = mailSender;
	}

}
