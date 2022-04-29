package com.detroitlabs.GroceryShopperApp.service;

import com.detroitlabs.GroceryShopperApp.model.StoreData;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URLEncoder;


public class ProductApiService {
    public StoreData accessStoreData() throws IOException {
        ObjectMapper objectMapper = new ObjectMapper();
       // RestTemplate restTemplate = new RestTemplate();
        int category = 1;
        String categoryString;
        switch (category){
            case 1: categoryString = "bread1";
                    break;

            case 2: categoryString = "dairy1";
                break;

            case 3: categoryString = "dessert1";
                break;

            case 4: categoryString = "fruit1";
                break;

            case 5: categoryString = "meat1";
                break;

            case 6: categoryString = "vegetables1";
                break;
        }

        categoryString = "vegetables1";
        String encodedCategory =  URLEncoder.encode(categoryString, "UTF-8");
        return objectMapper.readValue(new File("src/main/resources/static/dataFiles/" + encodedCategory +".json"), StoreData.class);

    }

}
