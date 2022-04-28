package com.detroitlabs.GroceryShopperApp.service;

import com.detroitlabs.GroceryShopperApp.model.StoreData;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;


public class ProductApiService {
    public StoreData accessStoreData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
       // RestTemplate restTemplate = new RestTemplate();
        return objectMapper.readValue(new File("src/main/resources/static/dataFiles/vegetables1.json"), StoreData.class);

    }

}
