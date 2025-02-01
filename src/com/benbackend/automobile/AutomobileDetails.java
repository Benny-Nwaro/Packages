package com.benbackend.automobile;

public  class AutomobileDetails {
    public static void printCarDetails(Cars car){
        System.out.println("\nYour car details: \n" + "car colour: " + car.getCarColour() + "\ncar type: "+
                car.getCarType() + "\nEngine type: " + car.getEngineType() + "\nNumber of seats: " + car.getNumberOfSeats()
                +"\nNumber of wheels: " + car.getNumberOfWheels());
    }
    public static   void printMotorcycleDetails(MotorCycle motorCycle){
        System.out.println("\nYour motorCycle details: \n" + "motorCycle colour: "
                + motorCycle.getMotorcycleColour() + "\nmotorCycle brand: "+
                motorCycle.getBrand() + "\nmotorCycle model: "
                + motorCycle.getModel() + "\nNumber of seats: "
                + motorCycle.getNumberOfSeats()
                +"\nNumber of wheels: " + motorCycle.getNumberOfWheels());
    }
    public static void printTricycleDetails(TriCycle triCycle){
        System.out.println("\nYour motorCycle details: \n" + "motorCycle colour: "
                + triCycle.getColour() + "\nmotorCycle brand: "+
                triCycle.getBrand() + "\nmotorCycle model: "
                + triCycle.getModel() + "\nNumber of seats: "
                + triCycle.getNumberOfSeats()
                +"\nNumber of wheels: " + triCycle.getNumberOfWheels());
    }
}
