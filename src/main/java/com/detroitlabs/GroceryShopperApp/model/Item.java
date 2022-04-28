package com.detroitlabs.GroceryShopperApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Item {
    private List<Fulfillments> fulfillment;
    private List<Prices> price;

    public List<Fulfillments> getFulfillment() {
        return fulfillment;
    }

    public void setFulfillment(List<Fulfillments> fulfillment) {
        this.fulfillment = fulfillment;
    }

    public List<Prices> getPrice() {
        return price;
    }

    public void setPrice(List<Prices> price) {
        this.price = price;
    }
}
