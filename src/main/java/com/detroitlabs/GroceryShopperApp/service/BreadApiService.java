package com.detroitlabs.GroceryShopperApp.service;

import com.detroitlabs.GroceryShopperApp.model.StoreData;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;


public class BreadApiService {
    public StoreData accessStoreData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
       // RestTemplate restTemplate = new RestTemplate();

        String categoryString = "bread1";
        String encodedCategory =  URLEncoder.encode(categoryString, "UTF-8");
        return objectMapper.readValue(new File("src/main/resources/static/dataFiles/" + encodedCategory +".json"), StoreData.class);

    }

}
