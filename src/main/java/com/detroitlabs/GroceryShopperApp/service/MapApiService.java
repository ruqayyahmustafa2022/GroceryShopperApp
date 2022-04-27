package com.detroitlabs.GroceryShopperApp.service;
import com.detroitlabs.GroceryShopperApp.model.MapData;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;


@Component

public class MapApiService {
    public MapData accessMapData() throws UnsupportedEncodingException {
        RestTemplate restTemplate = new RestTemplate();
        String storeAddress = "1115 Government St, Mobile, AL";
        String deliveryAddress = "3843 Airport Blvd, Mobile, AL 36608, USA";

        String encodedOriginAddress =  URLEncoder.encode(storeAddress, "UTF-8");
        String encodedDestinationAddress = URLEncoder.encode(deliveryAddress, "UTF-8");


        return restTemplate.getForObject("https://maps.googleapis.com/maps/api/distancematrix/json?origins=" + encodedOriginAddress +
                "&destinations=" + encodedDestinationAddress + "&units=imperial&key=AIzaSyBCMR71f6_sdczp5XRjT2foRD6hbEE9dOs", MapData.class);

    }//end accessMapData

}
