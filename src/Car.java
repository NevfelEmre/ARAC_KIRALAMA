/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nevfe
 */
public class Car extends Rentable {

    private Fuels fuelType;
    private Transmissions transmissionType;
    private String brand, model, year, color, user = "---", userID = "---";
    private boolean isAvailable = true;

    public Car(String brand, String model, String year, String color, Fuels fuelType, Transmissions transmission, String numberPlate) {
        super(numberPlate);
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.color = color;
        this.fuelType = fuelType;
        this.transmissionType = transmission;
    }

    public Fuels getFuelType() {
        return this.fuelType;
    }

    public void setFuelType(Transmissions transmissionType) {
        this.fuelType = fuelType;
    }

    public Transmissions getTransmissionType() {
        return this.transmissionType;
    }

    public void setTransmissionType(Transmissions transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getBrand() {
        return this.brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getYear() {
        return this.year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getUser() {
        return this.user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getUserID() {
        return this.userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public boolean isAvailable() {
        return this.isAvailable;
    }

    public void changeAvailability() {
        if (isAvailable) {
            this.isAvailable = false;
        } else {
            this.isAvailable = true;
        }
    }
}
