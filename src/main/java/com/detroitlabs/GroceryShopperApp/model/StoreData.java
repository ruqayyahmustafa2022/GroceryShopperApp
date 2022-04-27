package com.detroitlabs.GroceryShopperApp.model;
import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)

public class StoreData {
    //this is product data from Kroger API json response
    private Meta meta;
    private List<DataProducts> data;


    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    public List<DataProducts> getData() {
        return data;
    }

    public void setData(List<DataProducts> data) {
        this.data = data;
    }
}
