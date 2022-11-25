package com.example.resturantmariam;

import java.util.ArrayList;

public class meals {
    private ArrayList<breakfast>  mealbraekfast;
    private ArrayList< lunch >meaklunch;
    private ArrayList< dinner> mealdinner;
    private ArrayList<dessert> mealdessert;
    private ArrayList<drinks> drink;

    public ArrayList<breakfast> getMealbraekfast() {
        return mealbraekfast;
    }

    public ArrayList<lunch> getMeaklunch() {
        return meaklunch;
    }

    public ArrayList<dinner> getMealdinner() {
        return mealdinner;
    }

    public ArrayList<dessert> getMealdessert() {
        return mealdessert;
    }

    public ArrayList<drinks> getDrink() {
        return drink;
    }

    public meals(ArrayList<breakfast> mealbraekfast, ArrayList<lunch> meaklunch,
                 ArrayList<dinner> mealdinner, ArrayList<dessert> mealdessert, ArrayList<drinks> drink) {
        this.mealbraekfast = mealbraekfast;
        this.meaklunch = meaklunch;
        this.mealdinner = mealdinner;
        this.mealdessert = mealdessert;
        this.drink = drink;
    }

    public void setMealbraekfast(ArrayList<breakfast> mealbraekfast) {
        this.mealbraekfast = mealbraekfast;
    }

    public void setMeaklunch(ArrayList<lunch> meaklunch) {
        this.meaklunch = meaklunch;
    }

    public void setMealdinner(ArrayList<dinner> mealdinner) {
        this.mealdinner = mealdinner;
    }

    public void setMealdessert(ArrayList<dessert> mealdessert) {
        this.mealdessert = mealdessert;
    }

    public void setDrink(ArrayList<drinks> drink) {
        this.drink = drink;
    }


}

