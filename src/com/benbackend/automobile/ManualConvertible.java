package com.benbackend.automobile;

public class ManualConvertible extends ManualCar implements Convertible{
    public ManualConvertible(String engineType, String carColour, String carType, int numberOfSeats) {
        super(engineType, carColour, carType, numberOfSeats);
    }

    @Override
    public void openRoof(boolean open) {
        if(open){
            closeRoof(false);
            System.out.println("Roof opening");
        }
    }

    @Override
    public void closeRoof(boolean close) {
        if(close){
            openRoof(false);
            System.out.println("Roof closing");
        }
    }
}
