package com.detroitlabs.GroceryShopperApp.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.List;
@JsonIgnoreProperties(ignoreUnknown = true)

public class Image {
    private String perspective;
    private List<Size> sizes;

    public String getPerspective() {
        return perspective;
    }

    public void setPerspective(String perspective) {
        this.perspective = perspective;
    }

    public List<Size> getSizes() {
        return sizes;
    }

    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }
/*
    public String getThumbnail(){
        String urlName= "";
        for(int i = 0; i < sizes.size(); i++){
        if(sizes.get(i).getSize().equals("small"))
           urlName = sizes.get(i).getUrl();
        }//end for
        return urlName;
    }//end getThumbnail
*/

}
