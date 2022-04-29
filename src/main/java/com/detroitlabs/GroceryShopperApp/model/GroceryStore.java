package com.detroitlabs.GroceryShopperApp.model;

public class GroceryStore {
    private String url;
    private String price;
    private String description;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public GroceryStore(String url, String price, String description) {
        this.url = url;
        this.price = price;
        this.description = description;
    }
}
