package com.example.android.aswanapp;

public class AswanData {

    private String name;

    private String describtion;

    private int imageResource;

    public AswanData(String aName,String aDescribtion,int aImageResource){

        name=aName;
        describtion=aDescribtion;
        imageResource=aImageResource;
    }

    public String getName() {
        return name;
    }

    public String getDescribtion() {
        return describtion;
    }

    public int getImageResource() {
        return imageResource;
    }
}

