package com.detroitlabs.GroceryShopperApp.model;

import java.util.List;

public class PersonalShopper {
    private String name;
    private String schedule;
    private String image;
    private String storeAddress;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public PersonalShopper(String name, String schedule, String image, String storeAddress) {
        this.name = name;
        this.schedule = schedule;
        this.image = image;
        this.storeAddress = storeAddress;
    }
}
