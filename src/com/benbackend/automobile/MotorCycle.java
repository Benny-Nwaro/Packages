package com.benbackend.automobile;

public abstract class MotorCycle implements MotorCycles {
    private final int numberOfWheels = 2;
    private final int numberOfSeats = 1;
    private String motorcycleColour;
    private String brand;
    private String model;

    public MotorCycle() {
    }
    public MotorCycle(String motorcycleColour, String brand, String model) {
        this.motorcycleColour = motorcycleColour;
        this.brand = brand;
        this.model = model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getMotorcycleColour() {
        return motorcycleColour;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setMotorcycleColour(String motorcycleColour) {
        this.motorcycleColour = motorcycleColour;
    }
}
