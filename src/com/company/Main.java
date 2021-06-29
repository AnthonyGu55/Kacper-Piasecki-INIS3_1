package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {


        Car fiat1 = new Car("126", "fiat", 3000.0);
        Car fiat2 = new Car("126", "fiat", 3000.0);

        Animal dog = new Animal("dog");
        Human human = new Human(dog, fiat1, 2000.0);

        System.out.println(fiat1 == fiat2);
        System.out.println(fiat1.equals(fiat2));

        System.out.println(human);
        System.out.println(dog);
        System.out.println(fiat1);



    }

}