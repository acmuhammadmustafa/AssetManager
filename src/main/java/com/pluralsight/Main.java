package com.pluralsight;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Asset> assets = new ArrayList<>();
        Asset jewel = new Asset("Diamond", "June", 10000);
        House myHouse = new House ("Muhammad's Home", "2007-05-09", 10000, "123 Magical Lane", 2, 2400, 2);
        Vehicle myCar = new Vehicle("Muhammad's Car", "2020-05-09", 49000, "Lexus IS-350 F Sport", 2023, 12000);

        assets.add(myHouse);
        assets.add(jewel);
        assets.add(myCar);

        for (Asset a : assets){
            System.out.println(a);
//            System.out.println("=============================");
//            System.out.println("Description: " + a.getDescription());
//            System.out.println("Date Acquired: " + a.getDateAcquired());
//            System.out.println("Original Cost: $" + a.getOriginalCost());
//            System.out.println("Current Value: $" + a.getValue());
//            if(a instanceof House h){
//                System.out.println("Address: " + h.getAddress() );
//                System.out.println();
//            }
//            if(a instanceof Vehicle v){
//                System.out.println("Make/Model: " + v.getMakeModel() );
//                System.out.println();
//            }
        }

    }
}
