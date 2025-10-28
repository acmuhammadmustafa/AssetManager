package com.pluralsight;

public class Vehicle extends Asset {

    private String makeModel;
    private int year;
    private int odometer;

    public Vehicle(String description, String dateAcquired, double originalCost, String makeModel, int year, int odometer) {
        super(description, dateAcquired, originalCost);
        this.makeModel = makeModel;
        this.year = year;
        this.odometer = odometer;
    }

    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getOdometer() {
        return odometer;
    }

    public void setOdometer(int odometer) {
        this.odometer = odometer;
    }

    @Override

    public double getValue() {
        double carValuePrice = getOriginalCost();
        int age = 2025 - year;

        if (age <= 3) {
            carValuePrice = carValuePrice * Math.pow(.97, age);
        } else if (age <= 6) {
            carValuePrice = carValuePrice * Math.pow(.94, age);
        } else if (age <= 10) {
            carValuePrice = carValuePrice * Math.pow(.92, age);
        } else {
            carValuePrice = 1000.00;
        }
        if (odometer > 100000 && !(makeModel.toLowerCase().contains("toyota") || makeModel.toLowerCase().contains("hondoa"))) {
            carValuePrice = carValuePrice *0.75;
        }
    return carValuePrice;
    }

    @Override
    public String toString() {
        return "Vehicle Info: [" +
                " Make and Model: " + makeModel +
                " || Year: " + year +
                " || Odometer: " + odometer +
                " ]";
    }
}