package com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking;

import com.sun.prism.shader.AlphaOne_Color_AlphaTest_Loader;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.BookingDAO;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.MailSender;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.PaymentService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.external.RoomService;
import com.unitTest.mockito.udemy.mockitotutorial.happyhotel.booking.model.BookingRequest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.mockito.Mockito.mock;

public class Mock01BookingServiceTest {

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

    @Test
    void should_calculate_correct_price_when_correct_input() {
        //given
            // prepare input request param pojo
            String userId = "101";
            int guestCount = 2;
            boolean prepaid = false;
            BookingRequest bookingRequest =
                    new BookingRequest(userId,
                            LocalDate.of(2020, 01, 01),
                            LocalDate.of(2020, 01, 05),
                            guestCount,
                            prepaid );

            double expected = 4*2*50.0;

        //when
            //bookingService is injected with mock dependencies already.
            //calculate price does not have any external dependency
            double actual = bookingService.calculatePrice(bookingRequest);

        //then
        Assertions.assertEquals(expected, actual);

    }


}