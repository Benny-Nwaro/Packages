package com.benbackend.automobile;

public class ManualCar extends Cars implements Vehicle, ManualTransmission{

    public ManualCar(String engineType, String carColour, String carType, int numberOfSeats) {
        super(engineType, carColour, carType, numberOfSeats);
    }

    @Override
    public void setGear(ManualGear gear) {
        System.out.println("Gear set to "+ gear);
    }

    @Override
    public void parkVehicle(boolean park) {
        if(park){
            setGear(ManualGear.GEAR1);
            stopEngine();
            setHandBreak(true);
            System.out.println("Vehicle parked and Engine turned off");
        }
    }

    @Override
    public void setHandBreak(boolean handBreak) {
        if(handBreak){
            System.out.println("Handbreak is enabled");
        }
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
        System.out.println("Turning left at radius "+ radius);
    }

    @Override
    public void turnRight(int radius) {
        System.out.println("Turning right at radius "+ radius);
    }

    @Override
    public void accelerate(int increase) {
        System.out.println("Accelerating with speed " + increase);
    }

    @Override
    public void decelerate(int decrease) {
        System.out.println("Decelerating with speed " + decrease);
    }
}
