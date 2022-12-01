package com.example.resturantmariam;


import android.widget.ImageButton;

import org.w3c.dom.NodeList;
import java.util.ArrayList;

public class breakfast {
    private ArrayList<ImageButton> mealsofbreakfast;

    public breakfast(ArrayList<ImageButton> mealsofbreakfast) {
        this.mealsofbreakfast = mealsofbreakfast;
    }


    public void addbreakfastmeal(ImageButton mealsofbreakfast) {
        this.mealsofbreakfast.add(mealsofbreakfast);}



    public ArrayList<ImageButton> getMealsofbreakfast() {
        return mealsofbreakfast;
    }

    public void setMealsofbreakfast(ArrayList<ImageButton> mealsofbreakfast) {
        this.mealsofbreakfast = mealsofbreakfast;
    }
}
