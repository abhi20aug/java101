package com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking;

import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.BookingService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.BookingDAO;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.MailSender;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.PaymentService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.RoomService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.model.BookingRequest;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.model.Room;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Mock02BookingServiceTest {

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

        //testing what all mock returns
            //below returns a List , empty List
            System.out.println(roomServiceMock.getAvailableRooms());

            //below return String Object, take a Booking Request as param, we pass null
            System.out.println(roomServiceMock.findAvailableRoomId(null));

            //primitive type return
            System.out.println(roomServiceMock.getRoomCount());

    }

/*
    		return roomService.getAvailableRooms()
                    .stream()
				.map(room -> room.getCapacity())
            .reduce(0, Integer::sum);
*/
    @Test
    void should_get_available_place_count() {
        //given
        int expected =0;
        //when
            //we have injected dependency of roomServiceMock which is called by roomService.getAvailableRooms()
            //check the return and method of roomService.getAvailableRooms(), that return a List
            //nice mocked class of roomService will return a Empty List
            //get getAvailableRooms does not have any param as such here.
        int actual = bookingService.getAvailablePlaceCount();
        //then
        Assertions.assertEquals(expected, actual);
    }

    @Test
    void should_get_available_place_count_custom() {
        when(roomServiceMock.getAvailableRooms()).thenReturn(Collections.singletonList(new Room("Room1",1)));
        System.out.println("id "+roomServiceMock.getAvailableRooms().get(0).getId());
        System.out.println("capacity "+roomServiceMock.getAvailableRooms().get(0).getCapacity());
    }

    @Test
    void should_get_available_place_count_MultipleRooms() {
        //given input Data
        List<Room> roomList = new ArrayList<>();
        roomList.add(new Room("room1", 1));
        roomList.add(new Room("room2", 2));
        roomList.add(new Room("room3", 3));

        when(roomServiceMock.getAvailableRooms()).thenReturn(roomList);

        System.out.println("id "+roomServiceMock.getAvailableRooms().get(0).getId());
        System.out.println("capacity "+roomServiceMock.getAvailableRooms().get(0).getCapacity());
        int expected = 6;

        //when
        int actual = bookingService.getAvailablePlaceCount();

        Assertions.assertEquals(expected, actual);

    }


}