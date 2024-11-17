package main.java.Car;

import main.java.Car.model.Car;

public class CarApp {
    public static void main(String[] args) {
        Car car = new Car();
        System.out.println(car.getFuelLevel());
        car.refilling(10);
        car.trip(50);
        System.out.println(car.getFuelLevel());


    }
}
