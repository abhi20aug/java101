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
import java.time.Period;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.*;


class Test07_ThrowingExceptions {

    private BookingService bookingService;
    private PaymentService paymentServiceMock;
    private RoomService roomServiceMock;
    private BookingDAO bookingDAOMock;
    private MailSender mailSenderMock;

    @BeforeEach
    void setup() {
        this.paymentServiceMock = mock(PaymentService.class);
        this.roomServiceMock = mock(RoomService.class);
        this.bookingDAOMock = mock(BookingDAO.class);
        this.mailSenderMock = mock(MailSender.class);

        this.bookingService = new BookingService(paymentServiceMock, roomServiceMock, bookingDAOMock, mailSenderMock);

    }


    @Test
    public void should_invokePayment_when_Prepaid() {
        //given
        LocalDate fromDt = LocalDate.of(2020,01,01);
        LocalDate toDt = LocalDate.of(2020,01,06);
        int guests = 3;
        BookingRequest bookingRequest = new BookingRequest("01",fromDt,toDt, guests,true);
        //when
        bookingService.makeBooking((bookingRequest));
        //How to verify if all inside method were executed
        //Then
        double price = 50.0* Period.between(fromDt,toDt).getDays()*guests;
        verify(paymentServiceMock, times(1)).pay(bookingRequest,price);
        verifyNoMoreInteractions(paymentServiceMock);

    }

    @Test
    public void should_invokePayment_when_NotPrepaid() {
        //given
        LocalDate fromDt = LocalDate.of(2020,01,01);
        LocalDate toDt = LocalDate.of(2020,01,06);
        int guests = 3;
        boolean prePaid = false;
        BookingRequest bookingRequest = new BookingRequest("01",fromDt,toDt, guests,prePaid);
        //when
        bookingService.makeBooking((bookingRequest));
        verify(paymentServiceMock, never()).pay(any(),anyDouble());
    }


}