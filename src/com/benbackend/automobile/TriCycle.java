package com.benbackend.automobile;

public abstract class TriCycle implements MotorCycles {
    private final int numberOfWheels = 3;
    private final int numberOfSeats = 2;
    private String colour;
    private String brand;
    private String model;

    public TriCycle() {
    }
    public TriCycle(String colour, String brand, String model) {
        this.colour = colour;
        this.brand = brand;
        this.model = model;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
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
}
