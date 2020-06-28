package mj.project.eatgo.application;

import jdk.nashorn.internal.objects.AccessorPropertyDescriptor;
import mj.project.eatgo.domain.Reservation;
import mj.project.eatgo.domain.ReservationRepository;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.Mockito.verify;

public class ReservationServiceTests {

    private ReservationService reservationService;

    @Mock
    private ReservationRepository reservationRepository;

    @Before
    public void setUp() {
        MockitoAnnotations.initMocks(this);
        reservationService = new ReservationService(reservationRepository);
    }

    @Test
    public void getReservations() {
        Long restaurantId = 1004L;
        List<Reservation> reservations = reservationService.getReservations(restaurantId);

        verify(reservationRepository).findAllByRestaurantId(restaurantId);
    }

}