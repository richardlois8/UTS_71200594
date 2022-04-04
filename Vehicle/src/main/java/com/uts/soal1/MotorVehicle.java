package com.uts.soal1;

public class MotorVehicle implements Vehicle{
    private String vehicleName;
    private Engine engine;
    private Tire tire;
    private Wheel wheel;
    private Transmision transmission;

    public MotorVehicle(Engine engine, Transmision transmission, Tire tire, Wheel wheel) {
        this.engine = engine;
        this.tire = tire;
        this.wheel = wheel;
        this.transmission = transmission;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Wheel getWheel() {
        return wheel;
    }

    public void setWheel(Wheel wheel) {
        this.wheel = wheel;
    }

    public void setTransmission(Transmision transmission) {
        this.transmission = transmission;
    }

    public Transmision getTransmition() {
        return this.transmission;
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
