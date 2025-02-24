package com.dunky.usecase.flightreservation.dao;

import com.dunky.usecase.flightreservation.model.Reservation;

public interface ReservationDao {
    Reservation bookFlight(Reservation reservation);
}
