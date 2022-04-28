package com.detroitlabs.GroceryShopperApp.model;

import java.util.List;

public class PersonalShopper {
    private String firstName;
    private String lastName;
    private List<String> schedule;
    private String imageUrl;
    private String storeAddress;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public List<String> getSchedule() {
        return schedule;
    }

    public void setSchedule(List<String> schedule) {
        this.schedule = schedule;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public String getStoreAddress() {
        return storeAddress;
    }

    public void setStoreAddress(String storeAddress) {
        this.storeAddress = storeAddress;
    }

    public PersonalShopper(String firstName, String lastName, List<String> schedule, String imageUrl, String storeAddress) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.schedule = schedule;
        this.imageUrl = imageUrl;
        this.storeAddress = storeAddress;
    }
}
