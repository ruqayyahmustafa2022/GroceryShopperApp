package com.detroitlabs.GroceryShopperApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)

public class Fulfillments {
    private boolean shipToHome;

    public boolean isShipToHome() {
        return shipToHome;
    }

    public void setShipToHome(boolean shipToHome) {
        this.shipToHome = shipToHome;
    }
}
