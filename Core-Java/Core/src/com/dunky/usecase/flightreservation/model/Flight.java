package com.dunky.usecase.flightreservation.model;

public class Flight extends AbstractModel{
    private String flightNumber;
    private String operatingAirlines;
    private String departureCity;
    private String arrivalCity;
    private String dateAndTimeDeparture;

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOperatingAirlines() {
        return operatingAirlines;
    }

    public void setOperatingAirlines(String operatingAirlines) {
        this.operatingAirlines = operatingAirlines;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public String getDateAndTimeDeparture() {
        return dateAndTimeDeparture;
    }

    public void setDateAndTimeDeparture(String dateAndTimeDeparture) {
        this.dateAndTimeDeparture = dateAndTimeDeparture;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightNumber='" + flightNumber + '\'' +
                ", operatingAirlines='" + operatingAirlines + '\'' +
                ", departureCity='" + departureCity + '\'' +
                ", arrivalCity='" + arrivalCity + '\'' +
                ", dateAndTimeDeparture='" + dateAndTimeDeparture + '\'' +
                '}';
    }
}
