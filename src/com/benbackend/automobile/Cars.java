package com.benbackend.automobile;

public abstract class Cars {
    private final int numberOfWheels = 4;
    private final int steeringWheel = 1;
    private String engineType;
    private String carColour;
    private String carType;
    private int numberOfSeats;


    public Cars() {
    }
    public Cars(String engineType, String carColour, String carType, int numberOfSeats) {
        this.engineType = engineType;
        this.carColour = carColour;
        this.carType = carType;
        this.numberOfSeats = numberOfSeats;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getSteeringWheel() {
        return steeringWheel;
    }

    public String getEngineType() {
        return engineType;
    }

    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }

    public String getCarColour() {
        return carColour;
    }

    public void setCarColour(String carColour) {
        this.carColour = carColour;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }
}
