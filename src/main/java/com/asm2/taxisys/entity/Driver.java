package com.asm2.taxisys.entity;

import java.time.ZonedDateTime;

public class Driver extends User {
    private Long licenseNumber;
    private Double rating;
    private Car car;

    public Driver() {};
    public Driver(Long id, String name, String phone, String address, ZonedDateTime date, Long licenseNumber, Double rating) {
        super(id, name, phone, address, date);
        this.licenseNumber = licenseNumber;
        this.rating = rating;
        this.car = null;
    }

    public Driver(Long id, String name, String phone, String address, ZonedDateTime date, Long licenseNumber, Double rating, Car car) {
        super(id, name, phone, address, date);
        this.licenseNumber = licenseNumber;
        this.rating = rating;
        this.car = car;
    }

    public Long getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(Long licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}

