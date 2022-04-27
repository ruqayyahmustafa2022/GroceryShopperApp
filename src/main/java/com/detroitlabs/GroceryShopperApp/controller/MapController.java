package com.detroitlabs.GroceryShopperApp.controller;

import com.detroitlabs.GroceryShopperApp.model.MapData;
import com.detroitlabs.GroceryShopperApp.service.MapApiService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.UnsupportedEncodingException;

@Controller
public class MapController {
    //this class retrieve the virtual shopper's address from repository or database
    @RequestMapping("/")
    @ResponseBody

   // public String retrieveMapData(String originAddress, String destinationAddress) throws UnsupportedEncodingException {
     //   MapData mapData = mapApiService.accessMapData(originAddress, destinationAddress);

    public String retrieveMapData() throws UnsupportedEncodingException {
        MapApiService mapService = new MapApiService();
        MapData mapData = mapService.accessMapData();
        String originAddress = mapData.getOriginAddresses().get(0);
        String distance = mapData.getRows().get(0).getElements().get(0).getDistance().getText();
        String duration = mapData.getRows().get(0).getElements().get(0).getDuration().getText();




        return "DISTANCE =  " + distance + " DURATION = " + duration;
    }
}
