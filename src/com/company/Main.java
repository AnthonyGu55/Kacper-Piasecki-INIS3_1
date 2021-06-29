package com.company;

public class Main {

    public static void main(String[] args) {

        Car fiat1 = new Car("126", "Fiat");
        Animal dog1 = new Animal("dog");

        Human human = new Human();
        human.setCar(fiat1);
        human.setPet(dog1);


    }

}