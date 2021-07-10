package com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.unused;

import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.BookingService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.BookingDAO;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.MailSender;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.PaymentService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.RoomService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test21Mock {

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
        System.out.println("List returns "+roomServiceMock.getAvailableRooms());
        System.out.println("Object returns "+roomServiceMock.findAvailableRoomId(null));
        System.out.println("primitive returns "+roomServiceMock.getRoomCount());
    }

/*
@Test
public void mock01(){
    int expected = 0;
    List list = new ArrayList<>();
    list.add("room 1");
    list.add("room 2");
    when(bookingService.getAvailablePlaceCount()).thenReturn(list);
    Assertions.assertEquals(expected, bookingService.getAvailablePlaceCount());
}*/

}
