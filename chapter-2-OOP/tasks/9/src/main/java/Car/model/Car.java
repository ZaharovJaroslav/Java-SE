package main.java.Car.model;

public class Car {
    private double x;
    private double fuelLevel;
    int fuelConsumption;

    public Car() {
        this.x = 0;
        this.fuelLevel = 0;
        this.fuelConsumption = 7;
    }



    public double getX() {
        return x;
    }

    public double getFuelLevel() {
        return fuelLevel;
    }


    public void trip(double km) {
        x += km;
        fuelLevel -= x * fuelConsumption / 100;


    }
    public void refilling(double galons) {
        fuelLevel += galons;
    }
}
