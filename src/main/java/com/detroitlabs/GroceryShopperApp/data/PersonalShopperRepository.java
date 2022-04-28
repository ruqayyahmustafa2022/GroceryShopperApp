package com.detroitlabs.GroceryShopperApp.data;

import com.detroitlabs.GroceryShopperApp.model.PersonalShopper;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PersonalShopperRepository {

    private static final List<PersonalShopper> ALL_PERSONALSHOPPERS = Arrays.asList(
            new PersonalShopper("Ayah", "8", "static/images/jenbloomer.jpg",
                    "800 Glenwood Ave SE., Atlanta, GA 30316"),

            new PersonalShopper("Jason", "8", "static/images/dannewport.jpg",
                    "800 Glenwood Ave SE., Atlanta, GA 30316"));

    private List<PersonalShopper> getAllPersonalshoppers() {return ALL_PERSONALSHOPPERS}

    public PersonalShopper findByName(String name){
        for(PersonalShopper personalShopper: ALL_PERSONALSHOPPERS){

            if(personalShopper.getName().equals(name)){
                return personalShopper;
            }
        }
        return  null;
    }//end findByName
}//end shopper
