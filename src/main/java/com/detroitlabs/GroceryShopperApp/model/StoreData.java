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
    //private List<Data> data;


}
