package com.company;

import com.company.creatures.Animal;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Diesel;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        Animal dog = new Pet("dog");

        Car car0 = new Diesel("scion", "xd", 2011, 15000.00);
        Car car1 = new Diesel("saturn", "sl1", 2001, 6000.00);
        Car car2 = new Diesel("jeep", "grand cherokee", 2015, 40000.00);
        Car car3 = new Diesel("polaris", "xplorer 400l", 2002, 5000.00);

        Human human1 = new Human(dog, 2000.0);
        human1.setCash(100000.0);
        Human human2 = new Human(dog, 3000.0);
        human2.setCash(150000.0);

        human1.setCar(car0, 0);
        human1.setCar(car1, 1);

        human2.setCar(car2, 0);
        human2.setCar(car3, 1);

        System.out.println(human1);
        System.out.println(human2);

        car1.sell(human1, human2, 1.0);
        car1.sell(human2, human1, 1.0);
        car1.sell(human1, human2, 1.0);

        System.out.println(Arrays.toString(human1.getGarage()));
        System.out.println(Arrays.toString(human2.getGarage()));

        human2.sortGarage();
        System.out.println(Arrays.toString(human2.getGarage()));

        System.out.println(car2.wasItSold(human1, human2));

        System.out.println(car1.timesSold());
    }

}