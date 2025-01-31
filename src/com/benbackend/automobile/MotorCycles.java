package com.benbackend.automobile;

public interface MotorCycles {
    void startEngine();
    void stopEngine();
    void turnLeft(int radius);
    void turnRight(int radius);
    void accelerate(int increase);
    void decelerate(int decrease);
}
