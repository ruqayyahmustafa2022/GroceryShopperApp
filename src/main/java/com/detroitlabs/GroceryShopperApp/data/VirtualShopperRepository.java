package com.detroitlabs.GroceryShopperApp.data;

import com.detroitlabs.GroceryShopperApp.model.MapData;
import com.detroitlabs.GroceryShopperApp.model.VirtualShopper;
import com.detroitlabs.GroceryShopperApp.service.MapApiService;
import org.springframework.stereotype.Component;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.List;

@Component
public class VirtualShopperRepository {

    static final List<VirtualShopper> ALL_VIRTUALSHOPPERS = Arrays.asList(
            new VirtualShopper("Jane", "Doe", "1234567898765432", "123",
                    "1231 Gracewood Ave., Atlanta, GA 30316"),

            new VirtualShopper("John", "Wayne", "2345678987654321", "234",
                    "2163 Forest Ridge Rd. SE, Atlanta, GA 30316"),

            new VirtualShopper("Jessica", "Simpson", "2345678987654321", "345",
                    "1862 Arkose Dr., Atlanta, GA 30316"));

    public static List<VirtualShopper> getAllVirtualshoppers() {
        return ALL_VIRTUALSHOPPERS;
    }//end getAllVirtualShoppers
    
    public VirtualShopper findByName(String name){
        for(VirtualShopper virtualShopper: ALL_VIRTUALSHOPPERS){
            if(virtualShopper.getFirstName().equals(name){
                return virtualShopper;
            }
        }
        return null;
    }//end findByName

    public String getDistance(String shopperAddress, String storeAddress) throws UnsupportedEncodingException {
        MapApiService getMapData = new MapApiService();
        MapData testDistance = getMapData.accessMapData(shopperAddress, storeAddress);
        String distance = testDistance.getRows().get(0).getElements().get(0).getDistance().getText();
        return distance;
    }//end getDistance

    public double calcFare(String distance) {
        double distanceAsNum = Double.parseDouble(distance.replaceAll("[^0-9\\.]", ""));
        double fare = distanceAsNum * 7.50;

        return fare;
    }//end getDistance
    
    
}//end repository
