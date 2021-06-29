package com.company;

import com.company.devices.Phone;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Phone phone = new Phone("Apple", "IPhone 8", 2019);
        System.out.println(phone);
        ArrayList<String> apps = new ArrayList<>();
        apps.add("Instagram");
        apps.add("Spotify");
        apps.add("Reddit");

        phone.installAnApp("Facebook", "1.02");
        phone.installAnApp(apps);



    }

}