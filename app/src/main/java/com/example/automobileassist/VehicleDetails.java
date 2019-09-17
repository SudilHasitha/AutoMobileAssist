package com.example.automobileassist;

public class VehicleDetails {

    private String name;
    private int regNo;
    private String Address;
    private String MarkersClass;
    private String VehicleClass;
    private String fueluse;


    public VehicleDetails() {
    }

    public String getName() {
        return name;
    }

    public int getRegNo() {
        return regNo;
    }

    public String getAddress() {
        return Address;
    }

    public String getMarkersClass() {
        return MarkersClass;
    }

    public String getVehicleClass() {
        return VehicleClass;
    }

    public String getFueluse() {
        return fueluse;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRegNo(int regNo) {
        this.regNo = regNo;
    }

    public void setAddress(String address) {
        Address = address;
    }

    public void setMarkersClass(String markersClass) {
        MarkersClass = markersClass;
    }

    public void setVehicleClass(String vehicleClass) {
        VehicleClass = vehicleClass;
    }

    public void setFueluse(String fueluse) {
        this.fueluse = fueluse;
    }
}
