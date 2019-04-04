package com.example.dell.kidzee;

import android.graphics.Bitmap;

/**
 * Created by DELL on 19-07-2016.
 */
public class Category {
    String name;

    public Bitmap getFruitimg() {
        return fruitimg;
    }

    public void setFruitimg(Bitmap fruitimg) {
        this.fruitimg = fruitimg;
    }

    Bitmap fruitimg;

    public Category(String name, Bitmap img){
        this.name = name;
        this.fruitimg = img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
