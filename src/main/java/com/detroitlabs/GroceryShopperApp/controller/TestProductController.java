package com.detroitlabs.GroceryShopperApp.controller;

import com.detroitlabs.GroceryShopperApp.model.StoreData;
import com.detroitlabs.GroceryShopperApp.service.ProductApiService;
import org.apache.catalina.Store;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

@Controller
public class TestProductController {
    //this class retrieve the virtual shopper's address from repository or database
    @RequestMapping("/test")
    @ResponseBody

   // public String retrieveMapData(String originAddress, String destinationAddress) throws UnsupportedEncodingException {
     //   MapData mapData = mapApiService.accessMapData(originAddress, destinationAddress);

    public String accessStoreData() throws IOException {
        ProductApiService productAPI = new ProductApiService();
        StoreData storeData = productAPI.accessStoreData();
        int numProduct = storeData.getMeta().getPagination().getLimit();
        String imageFile = storeData.getData().get(0).getImages().get(0).getSizes().get(0).getUrl();

        return imageFile;
    }
}
