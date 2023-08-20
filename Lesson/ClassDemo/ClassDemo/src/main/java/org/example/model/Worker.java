package org.example.model;

import java.time.LocalDate;

// шаблон
public class Worker {
    // поле
    public String lastName;
    public String firstName;
    public int age;
    public double salary;
    public LocalDate dateOfBirth;

    // метод
    public void setAge(int value) {
        age = value;
    }
    public void myCar(){
        Car audi = new Car();
        audi.model = "q7";
        System.out.println("car: "+ audi.model);
    }

    public void run() {
        System.out.println("run...");
    }

    public void sleep() {
        System.out.println("sleep...");
    }

    public void setSalary(double salary) {
        //this.salary = newSalary;
        this.salary = salary;
    }

    // System.out.println(w.getSalary());
    public double getSalary() {
        return this.salary;
    }
}
