package org.example.model;

public class Car {
    public  Worker driver;
    public String mark;
    public String model;
    String vin;
    double vEngine;

    public void startEngine( ){
        System.out.println("startEngine ...");
    }

    public void stopEngine(){
        System.out.println("stopEngine ...");
    }

    public Worker getDriver() {
    return this.driver;
    }

}
