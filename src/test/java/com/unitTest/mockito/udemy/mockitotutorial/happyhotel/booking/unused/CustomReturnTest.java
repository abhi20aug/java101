package com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.unused;

import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.BookingService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.BookingDAO;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.MailSender;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.PaymentService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.RoomService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


class CustomReturnTest {

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

    @Test
    public void should_CountAvailablePlaces_When_OneRoomAvailable() {
        //given
        when(this.roomServiceMock.getAvailableRooms()).thenReturn(Collections.singletonList(new Room("Room 1",4)));
        int expected =4;
        //when
        int actual = bookingService.getAvailablePlaceCount();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void should_CountAvailablePlaces_When_MoreThanOneRoomAvailable() {
        //given
        List<Room> rooms = Arrays.asList(new Room("Room 1",4),new Room("Room2", 3));
        when(this.roomServiceMock.getAvailableRooms())
                .thenReturn(rooms);
        int expected =7;
        //when
        int actual = bookingService.getAvailablePlaceCount();
        //then
        Assertions.assertEquals(expected, actual);
    }


}