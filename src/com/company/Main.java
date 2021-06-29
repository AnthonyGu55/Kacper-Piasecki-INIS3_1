
package com.company;

import com.company.devices.Car;

public class Main {

    public static void main(String[] args) {


        Car fiat1 = new Car("126", "fiat", 1975, 2000.0);
        Car opel = new Car("123k", "opel", 2002, 5000.0);
        Animal dog = new Animal("dog");
        Animal cat = new Animal("cat");

        Human human1 = new Human(dog, fiat1, 2000.0);
        Human human2 = new Human(cat, opel, 3000.0);

        human1.setCash(5000.0);
        human2.setCash(6000.0);

        human1.getPet().sell(human1, human2, 100.0);

        System.out.println(human1);
        System.out.println(human2);


    }

}