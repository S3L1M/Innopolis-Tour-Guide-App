package com.example.tourguideapp;

public class Item {
    private int imgSrc;
    private int titleSrc;

    public Item(int imageSource, int imageTitle) {
        imgSrc = imageSource;
        titleSrc = imageTitle;
    }

    public int getImgSrc() {
        return imgSrc;
    }

    public int getTitleSrc() {
        return titleSrc;
    }
}
