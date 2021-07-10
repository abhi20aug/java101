package com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.unused;

import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.BookingService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.exception.BusinessException;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.BookingDAO;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.MailSender;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.PaymentService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.RoomService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.model.BookingRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.junit.jupiter.api.function.Executable;
import java.time.LocalDate;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.ArgumentMatchers.*;


class Test05_ThrowingExceptions {

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
    public void should_ThrowExceptions_WhenNoRoomAvailable() {
        //given
        BookingRequest bookingRequest = new BookingRequest("01",LocalDate.of(2020,01,01),LocalDate.of(2020,01,05),2,false);
        when(this.roomServiceMock.findAvailableRoomId(bookingRequest))
                //.thenThrow(new RuntimeException("Cannot process"));
                .thenThrow(BusinessException.class);
        //when
        Executable executable = () -> bookingService.makeBooking(bookingRequest);
        /*
        try {
            bookingService.makeBooking(bookingRequest);
            Assertions.fail();
        }catch (Exception e){
            System.out.println("-- exception thrown --"+e);
            Assertions.assertTrue(e instanceof RuntimeException);
            Assertions.assertEquals(e.getMessage(), "Cannot process");
        }
        */
       //then
        Assertions.assertThrows(BusinessException.class, executable);
    }

    @Test
    public void should_Not_CompleteBookingWhen_priceTooHigh() {
        //given
        BookingRequest bookingRequest = new BookingRequest("01",LocalDate.of(2020,01,01),LocalDate.of(2020,01,05),2,true);

        when(this.paymentServiceMock.pay(any(),anyDouble())).thenThrow(BusinessException.class);

        //when
        Executable executable = () -> bookingService.makeBooking(bookingRequest);
        Assertions.assertThrows(BusinessException.class, executable);
    }

}