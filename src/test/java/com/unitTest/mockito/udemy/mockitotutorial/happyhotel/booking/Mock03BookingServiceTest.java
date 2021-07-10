package com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking;

import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.exception.BusinessException;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.BookingDAO;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.MailSender;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.PaymentService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.RoomService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.model.BookingRequest;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.function.Executable;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Mock03BookingServiceTest {

    private BookingService bookingService;

    private PaymentService paymentServiceMock;
    private MailSender mailSenderMock;
    private BookingDAO bookingDAOMock;
    private RoomService roomServiceMock;


    @BeforeEach
    void setup() {
        paymentServiceMock = mock(PaymentService.class);
        mailSenderMock = mock(MailSender.class);
        bookingDAOMock = mock(BookingDAO.class);
        roomServiceMock = mock(RoomService.class);
        this.bookingService = new BookingService(paymentServiceMock, roomServiceMock, bookingDAOMock, mailSenderMock);

    }

/*
    method-> param 1 pojo ->
    calls
        roomService.findAvailableRoomId(bookingRequest); -> gives room Id -> bookingRequest.setRoomId(roomId)-> roomService.bookRoom(roomId);
        paymentService.pay(bookingRequest, price);
        bookingDAO.save(bookingRequest);
        mailSender.sendBookingConfirmation(bookingId);

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
*/
    @Test
    void check_if_roomService_findAvailableRoomId_throws_exception() {
        //given
            //String roomId = roomService.findAvailableRoomId(bookingRequest);
            // we call roomService.findAvailableRoomId
            // we need to call above with actual bookingRequest
            // roomService is mocked, but data needs to be passed of booking Request actaul
            // prepare input request param pojo
            //
        String userId = "101";
        int guestCount = 2;
        boolean prepaid = false;
        BookingRequest bookingRequest =
                new BookingRequest(userId,
                        LocalDate.of(2020, 01, 01),
                        LocalDate.of(2020, 01, 05),
                        guestCount,
                        prepaid );

        when(roomServiceMock.findAvailableRoomId(bookingRequest)).thenThrow(BusinessException.class);

        //when
        Executable executable = () -> {bookingService.makeBooking(bookingRequest);};

        //then
        Assertions.assertThrows(BusinessException.class, executable);
    }

}