package com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.unused;

import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.BookingService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.BookingDAO;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.MailSender;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.PaymentService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.RoomService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.model.BookingRequest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


class Test08_Spies {

    private BookingService bookingService;
    private PaymentService paymentServiceMock;
    private RoomService roomServiceMock;
    private BookingDAO bookingDAOMock;
    private MailSender mailSenderMock;

    @BeforeEach
    void setup() {
        this.paymentServiceMock = mock(PaymentService.class);
        this.roomServiceMock = mock(RoomService.class);
        this.bookingDAOMock = spy(BookingDAO.class);
        this.mailSenderMock = mock(MailSender.class);

        this.bookingService = new BookingService(paymentServiceMock, roomServiceMock, bookingDAOMock, mailSenderMock);

    }


    @Test
    public void should_makeBooking_whenInputOk() {
        //given
        LocalDate fromDt = LocalDate.of(2020,01,01);
        LocalDate toDt = LocalDate.of(2020,01,06);
        int guests = 3;
        BookingRequest bookingRequest = new BookingRequest("01",fromDt,toDt, guests,true);
        //when
        String bookingId = bookingService.makeBooking((bookingRequest));
        //Then
        verify(bookingDAOMock).save(bookingRequest);
        System.out.println("Booking Id: "+bookingId);
    }

    @Test
    public void should_cancelBooking_whenInputOk() {
        //given
        LocalDate fromDt = LocalDate.of(2020,01,01);
        LocalDate toDt = LocalDate.of(2020,01,06);
        int guests = 3;
        BookingRequest bookingRequest = new BookingRequest("01",fromDt,toDt, guests,true);
        bookingRequest.setRoomId("1.3");
        String bookingId = "1";
        doReturn(bookingRequest).when(bookingDAOMock).get(bookingId);
        //when
        bookingService.cancelBooking(bookingId);
        //Then
        //verify(bookingDAOMock).save(bookingRequest);
        //System.out.println("Booking Id: "+bookingId);
    }

}