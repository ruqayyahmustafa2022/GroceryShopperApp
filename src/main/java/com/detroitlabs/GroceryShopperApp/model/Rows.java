package com.detroitlabs.GroceryShopperApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Rows {
    private List<Elements> elements;

    public List<Elements> getElements() {
        return elements;
    }

    public void setElements(List<Elements> elements) {
        this.elements = elements;
    }
}
