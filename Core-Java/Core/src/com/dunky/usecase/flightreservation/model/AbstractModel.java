package com.dunky.usecase.flightreservation.model;

public abstract class AbstractModel {
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
