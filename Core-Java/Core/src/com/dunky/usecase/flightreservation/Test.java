package com.dunky.usecase.flightreservation;

import com.dunky.usecase.flightreservation.dao.ReservationDao;
import com.dunky.usecase.flightreservation.dao.impl.ReservationDaoImpl;
import com.dunky.usecase.flightreservation.model.Passenger;
import com.dunky.usecase.flightreservation.model.Reservation;

public class Test {
    public static void main(String[] args){
        ReservationDao dao = new ReservationDaoImpl();
        Reservation  reservation = new Reservation();
        Passenger passenger1 = new Passenger();
        passenger1.setId(123L);
        passenger1.setFirstName("Geoffrey");
        passenger1.setLastName("Karl");
        passenger1.setEmail("test@mail.com");
        reservation.setPassenger(passenger1);
        reservation.setFlightId(1000L);
        // Display passenger's reservation details
        System.out.println(dao.bookFlight(reservation));

    }
}
