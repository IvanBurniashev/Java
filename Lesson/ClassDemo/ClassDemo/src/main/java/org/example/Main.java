package org.example;

import org.example.model.Car;
import org.example.model.Worker;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html#:~:text=int%3A%20By%20default%2C%20the%20int,value%20of%20232%2D1.
        // double, int, boolean, char
        // String
        // Примитивные

        int a1 = 123456;
        int a2 = 123456;

        boolean flag = a1 == a2;
        System.out.println(flag);

        Integer a3 = 123456;
        Integer a4 = 123456;
        flag = a3 == a4;
        System.out.println(flag);
        System.out.println(a3.equals(a4));

        System.out.println("==========");


        byte myByte = 1; // Byte (whole number from -128 to 127)

        short myShort = 3;// Short (whole number from -32768 to 32767)
        int myNum = 5;// Integer (whole number) // 4 bytes

        float myFloatNum = 132.1234567890123456789001234567890f;// Floating point number
        System.out.println(myFloatNum);
        double d = 1234567.1234567890123456789001234567890;
        System.out.println(d);
        char myLetter = 'D';// Character
        boolean myBool = true;// Boolean


        // не примитивные типы данных
        Worker w = new Worker();
        w.age = 23;
        w.firstName = "John";
        w.lastName = "lastName";
        w.salary = 200.45;
        w.dateOfBirth = LocalDate.of(2000, 2, 22);

        System.out.println("age: " + w.age);
        w.setAge(100);
        System.out.println("age: " + w.age);
        System.out.println("Name: " + w.firstName);
        System.out.println("Name: " + w.firstName);

        w.run();
        w.sleep();
        w.setSalary(10000);
        w.myCar();

        System.out.println(w.getSalary());
        Car car = new Car();
        car.driver=w;
        System.out.println(car.getDriver().firstName);
    }
}