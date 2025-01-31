package com.benbackend.automobile;

public class AutomaticCar extends Cars implements Vehicle, AutomaticTransmission{
    public AutomaticCar(String engineType, String carColour, String carType, int numberOfSeats) {
        super(engineType, carColour, carType, numberOfSeats);
    }

    @Override
    public void startEngine() {
        System.out.println("Engine started");
    }

    @Override
    public void stopEngine() {
        System.out.println("Engine stopped");
    }

    @Override
    public void turnLeft(int radius) {
        System.out.println("Turning left at radius " + radius);
    }

    @Override
    public void turnRight(int radius) {
        System.out.println("Turning right at radius " + radius);

    }

    @Override
    public void accelerate(int increase) {
        System.out.println("Accelerating with speed " + increase);
    }

    @Override
    public void decelerate(int decrease) {
        System.out.println("Decelerating with speed " + decrease);
    }

    @Override
    public void setGear(AutomaticGear gear) {
        System.out.println("Gear set to " + gear);
    }

    @Override
    public void parkVehicle(boolean park) {
        if(park){
            setGear(AutomaticGear.PARK);
            setHandBreak(true);
            stopEngine();
            System.out.println("Vehicle parked and Engine stopped");
        }
    }

    @Override
    public void setHandBreak(boolean handBreak) {
        if(handBreak){
            System.out.println("Handbreak is active");
        }
    }
}
