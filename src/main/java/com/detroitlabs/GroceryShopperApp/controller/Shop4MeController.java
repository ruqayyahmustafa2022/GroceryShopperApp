package com.detroitlabs.GroceryShopperApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Shop4MeController {

//TODO: CORRECT REQUEST MAPPING FOR EACH PAGE
   //Stencil 1: login page TODO: MAKE LOGIN MORE REALISTIC
    @RequestMapping( "/")
    public String loginPage()
    {
        return "login";
    }
    /*Test home page ---- THIS PAGE IS NOT RELEVANT, JUST FOR TESTING
    @RequestMapping( "/")
    public String homePage()
    {
        return "home";
    }
    */

    /*
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
    public String virtualShopperCategoriesPage()
    {
        return "vsCategories";
    }


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
    /*
    @RequestMapping( "/")
    public String virtualShopperProductsPage()
    {
        return "virtualShopperProducts";
    }

    @RequestMapping( "/")
    public String vsRatingsPage()
    {
        return "vsRatings";
    }

     */
}
