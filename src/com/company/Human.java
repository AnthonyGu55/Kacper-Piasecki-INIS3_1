package com.company;

import java.util.Date;

public class Human {
    private Animal pet;
    private Car car;
    private Double salary;

    static final public double DEFAULT_SALARY = 2000.0;

    public Human() {
        this.salary = DEFAULT_SALARY;
    }

    public void setPet(Animal pet) {
        this.pet = pet;
    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        if (this.salary > car.getValue()) {
            System.out.println("You purchased a car with cash");
            this.car = car;
            return;
        } else if (salary > car.getValue()/12) {
            System.out.println("You purchased a car in installments");
            this.car = car;
            return;
        }
        System.out.println("You can't buy this car. Go to a university, find a new job or ask for a promotion.");
    }

    public Double getSalary() {
        Date date = new Date();

        System.out.println("Current date and time: " + date) ;
        System.out.println("The salary is: " + salary);

        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Error: salary can't be lower than zero");
        } else {

            System.out.println("New salary has been registered. The salary is : " + salary);
            System.out.println("Please take the 'aneks' from 'pani Hania z kadr'.");
            System.out.println("ZUS and US already know about the new salary, don't try to hide it");
            this.salary = salary;
        }
    }
}