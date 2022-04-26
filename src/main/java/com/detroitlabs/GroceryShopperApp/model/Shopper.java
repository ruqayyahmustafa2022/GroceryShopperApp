package com.detroitlabs.GroceryShopperApp.model;

public class Shopper {
    private String firstName;
    private String lastName;
    private String creditCardNo;
    private String cardCVV;
    private String address;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCreditCardNo() {
        return creditCardNo;
    }

    public String getCardCVV() {
        return cardCVV;
    }

    public String getAddress() {
        return address;
    }

    public Shopper(String firstName, String lastName, String creditCardNo, String cardCVV, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.creditCardNo = creditCardNo;
        this.cardCVV = cardCVV;
        this.address = address;
    }
}
