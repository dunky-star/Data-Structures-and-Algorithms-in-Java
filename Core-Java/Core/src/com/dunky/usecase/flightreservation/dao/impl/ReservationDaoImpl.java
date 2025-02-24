package com.dunky.usecase.flightreservation.dao.impl;

import com.dunky.usecase.flightreservation.dao.ReservationDao;
import com.dunky.usecase.flightreservation.model.Flight;
import com.dunky.usecase.flightreservation.model.Reservation;

import java.util.HashMap;

public class ReservationDaoImpl implements ReservationDao {
    // HashMap Data structure to store the reservation details in memory
    HashMap<Long, Flight> flightData;
    HashMap<Long, Reservation> reservations;
    private long reservationId = 0;

    public ReservationDaoImpl(){
        flightData = new HashMap<>();
        reservations = new HashMap<>();
        //Creating instances of Flight
        Flight flight1 = new Flight();
        flight1.setId(1000L);
        flight1.setFlightNumber("1000x");
        flight1.setOperatingAirlines("American Airlines");
        flight1.setDepartureCity("New York");
        flight1.setArrivalCity("Austin, TX");
        flight1.setDateAndTimeDeparture("6/30/2024 9:30pm");

        Flight flight2 = new Flight();
        flight2.setId(2000L);
        flight2.setFlightNumber("2000x");
        flight2.setOperatingAirlines("South West Airlines");
        flight2.setDepartureCity("Denver");
        flight2.setArrivalCity("Washington");
        flight2.setDateAndTimeDeparture("8/01/2024 10:30pm");

        // Storing the flight information into the HashMap
        flightData.put(flight1.getId(), flight1);
        flightData.put(flight2.getId(), flight2);
    }

    @Override
    public Reservation bookFlight(Reservation reservation){
     Flight flight = flightData.get(reservation.getFlightId());
     reservation.setFlight(flight);
     reservationId++;
     reservation.setId(reservationId);
     reservations.put(reservationId, reservation);
     return reservation;
    }
}
