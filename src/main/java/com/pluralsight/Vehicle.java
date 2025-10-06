package com.pluralsight;

public class Vehicle {
   private long vehicleID;
    private String makeModel;
    private String color;
    private int odometerReading;
    private float price;

    public Vehicle(long vehicleID, String makeModel, String color, int odometerReading, float price) {
        this.makeModel = makeModel;
        this.vehicleID = vehicleID;
        this.color = color;
        this.odometerReading = odometerReading;
        this.price = price;
    }


    public String getMakeModel() {
        return makeModel;
    }

    public void setMakeModel(String makeModel) {
        this.makeModel = makeModel;
    }

    public long getVehicleID() {
        return vehicleID;
    }

    public void setVehicleID(long vehicleID) {
        this.vehicleID = vehicleID;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getOdometerReading() {
        return odometerReading;
    }

    public void setOdometerReading(int odometerReading) {
        this.odometerReading = odometerReading;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }












}














