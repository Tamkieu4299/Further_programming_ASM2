package com.asm2.taxisys.entity;

import java.time.ZonedDateTime;

public class Car {
    private Long id;
    private String make;
    private String model;
    private String color;
    private Boolean convertible;
    private Double rating;
    private String licencePlate;
    private Double ratePerKm;
    private ZonedDateTime time;
    private Driver driver;

    public Car(){};

    public Car(Long id, String make, String model, String color, Boolean convertible, Double rating, String licencePlate, Double ratePerKm, ZonedDateTime time) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
        this.convertible = convertible;
        this.rating = rating;
        this.licencePlate = licencePlate;
        this.ratePerKm = ratePerKm;
        this.time = time;
        this.driver = null;
    }

    public Car(Long id, String make, String model, String color, Boolean convertible, Double rating, String licencePlate, Double ratePerKm, ZonedDateTime time, Driver driver) {
        this.id = id;
        this.make = make;
        this.model = model;
        this.color = color;
        this.convertible = convertible;
        this.rating = rating;
        this.licencePlate = licencePlate;
        this.ratePerKm = ratePerKm;
        this.time = time;
        this.driver = driver;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getConvertible() {
        return convertible;
    }

    public void setConvertible(Boolean convertible) {
        this.convertible = convertible;
    }

    public Double getRating() {
        return rating;
    }

    public void setRating(Double rating) {
        this.rating = rating;
    }

    public String getLicencePlate() {
        return licencePlate;
    }

    public void setLicencePlate(String licencePlate) {
        this.licencePlate = licencePlate;
    }

    public Double getRatePerKm() {
        return ratePerKm;
    }

    public void setRatePerKm(Double ratePerKm) {
        this.ratePerKm = ratePerKm;
    }

    public ZonedDateTime getTime() {
        return time;
    }

    public void setTime(ZonedDateTime time) {
        this.time = time;
    }

    public Driver getDriver() {
        return driver;
    }

    public void setDriver(Driver driver) {
        this.driver = driver;
    }
}
