package com.company.devices;

import java.util.ArrayList;

public class Phone extends Device {

    public Phone(String producer, String model, Integer yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    static final String DEFAULT_SERVER_ADDRESS = "www.google.com";
    static final String DEFAULT_PROTOCOL = "HTTP";


    @Override
    public void turnOn() {
        System.out.println("This phone is now on");
    }

    public void installAnApp(String name) {
        System.out.println("Installed " + name);
    }

    public void installAnApp(String name, String version) {
        System.out.println("Installed: " + name + ", version: " + version);
    }

    public void installAnApp(String name, String version, String server) {
        System.out.println("Installed: " + name + ", version: " + version + ", server: " + server);
    }
    public void installAnApp(ArrayList<String> applicationNames) {
        System.out.print("Installing: " + applicationNames.toString());

    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
                ", model='" + model + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                '}';
    }
}