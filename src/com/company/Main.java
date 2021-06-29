package com.company;

public class Main {

    public static void main(String[] args) {

        Human human = new Human();
        Car fiat1 = new Car("126", "fiat", 3000.0);

        human.getSalary();
        human.setSalary(2000.0);

        human.setCar(fiat1);


    }

}