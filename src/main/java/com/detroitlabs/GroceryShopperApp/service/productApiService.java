package com.detroitlabs.GroceryShopperApp.service;

import com.detroitlabs.GroceryShopperApp.model.MapData;
import com.detroitlabs.GroceryShopperApp.model.StoreData;
import org.springframework.web.client.RestTemplate;


public class productApiService {
    public StoreData accessStoreData(){
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.getForObject("empty", StoreData.class);


    }

}
