package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();

        House myHouse = new House ("Muhammads Home", "2007-05-09", 10000, "123 Magical Lane", 2, 2400, 2);

        Asset.add(myHouse);
    }
}
