package com.uts.soal1;

public class Car extends MotorVehicle{
    private int numPassenger;

    public Car(Engine engine, Transmision transmision, Tire tire, Wheel wheel) {
        super(engine, transmision, tire, wheel);
    }

    public int getNumPassenger() {
        return numPassenger;
    }

    public void setNumPassenger(int numPassenger) {
        this.numPassenger = numPassenger;
    }

    public void backward(){

    }

    public void brake(){

    }

    public void forward(){

    }

    public void turnLeft(){

    }

    public void turnRight(){

    }
}
