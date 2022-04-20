package com.asm2.taxisys.entity;

import java.time.ZonedDateTime;

public class Booking {
    private Long id;
    private String startLocation;
    private String endLocation;
    private String pickTime;
    private String dropTime;
    private Long tripDistance;
    private ZonedDateTime time;

    public Booking() {}
    public Booking(Long id, String startLocation, String endLocation, String pickTime, String dropTime, Long tripDistance, ZonedDateTime time) {
        this.id = id;
        this.startLocation = startLocation;
        this.endLocation = endLocation;
        this.pickTime = pickTime;
        this.dropTime = dropTime;
        this.tripDistance = tripDistance;
        this.time = time;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getStartLocation() {
        return startLocation;
    }

    public void setStartLocation(String startLocation) {
        this.startLocation = startLocation;
    }

    public String getEndLocation() {
        return endLocation;
    }

    public void setEndLocation(String endLocation) {
        this.endLocation = endLocation;
    }

    public String getPickTime() {
        return pickTime;
    }

    public void setPickTime(String pickTime) {
        this.pickTime = pickTime;
    }

    public String getDropTime() {
        return dropTime;
    }

    public void setDropTime(String dropTime) {
        this.dropTime = dropTime;
    }

    public Long getTripDistance() {
        return tripDistance;
    }

    public void setTripDistance(Long tripDistance) {
        this.tripDistance = tripDistance;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }
}
