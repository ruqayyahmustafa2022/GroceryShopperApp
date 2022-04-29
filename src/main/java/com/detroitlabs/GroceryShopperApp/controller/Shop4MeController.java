package com.detroitlabs.GroceryShopperApp.controller;

import com.detroitlabs.GroceryShopperApp.model.DataProducts;
import com.detroitlabs.GroceryShopperApp.model.StoreData;
import com.detroitlabs.GroceryShopperApp.service.ProductApiService;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@Controller
public class Shop4MeController {

//TODO: CORRECT REQUEST MAPPING FOR EACH PAGE
   //Stencil 1: login page TODO: MAKE LOGIN MORE REALISTIC

    @RequestMapping( "/login")
    public String loginPage()
    {
        return "login";
    }
    //Test home page ---- THIS PAGE IS NOT RELEVANT, JUST FOR TESTING

/*
    //Contains stencil with login right now
    @RequestMapping( "/test")
    public String homePage()
    {
        return "test";
    }



    @RequestMapping( "/")
    public String psCartPage()
    {
        return "psCart";
    }

    @RequestMapping( "/")
    public String psConfirmationPage()
    {
        return "psConfirmation";
    }

    @RequestMapping( "/")
    public String psMainPage()
    {
        return "psMain";
    }

    @RequestMapping( "/")
    public String virtualShopperCartPage()
    {
        return "virtualShopperCart";
    }
    */
    @RequestMapping( "/main")
    public String virtualShopperCategoriesPage(@RequestParam("category") String category,
                                               ModelMap modelMap)
    {
       int selection;

        if(category.equals("vegetables"))
            selection = 1;
        else if(category.equals("bread"))
            selection = 2;
        else if(category.equals("dairy"))
            selection = 1;
        else if(category.equals("dessert"))
            selection = 2;
        else if(category.equals("fruit"))
            selection = 1;
        else if(category.equals("meat"))
            selection = 2;


        return "vsCategories";
    }

/*
    @RequestMapping( "/payment")
    public String virtualShopperCheckoutPage()
    {
        return "vsCheckout";
    }

    @RequestMapping( "/confirmation")
    public String virtualShopperConfirmationPage()
    {
        return "vsConfirmation";
    }

    @RequestMapping( "/select_delivery")
    public String virtualShopperDeliveryTimePage()
    {
        return "vsDeliveryTime";
    }
*/
    @RequestMapping( "/products")
    public String virtualShopperProductsPage(ModelMap modelMap) throws IOException {
        ProductApiService storeApi = new ProductApiService();
        List<DataProducts> products = storeApi.accessStoreData().getData();
        String url = products.get(0).getImages().get(0).getSizes().get(0).getUrl();
        List<DataProducts> leftColumnProds = new ArrayList<>();
        List<DataProducts> rightColumnProds = new ArrayList<>();

        for(int i=0; i< products.size();i++)
        {

            if(i< products.size()/2){
                leftColumnProds.add(products.get(i));
            }
            else
                rightColumnProds.add(products.get(i));
        }//end for i


        modelMap.put("leftColumnProds", leftColumnProds);
        modelMap.put("rightColumnProds", rightColumnProds);
        return "vsProducts";
    }
/*
    @RequestMapping( "/")
    public String vsRatingsPage()
    {
        return "vsRatings";
    }

     */
}
