package com.example.resturantmariam;


import android.widget.ImageButton;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

import org.w3c.dom.NodeList;
import java.util.ArrayList;

public class breakfast {
    private ArrayList<ImageButton> mealsofbreakfast;
    private FirebaseFirestore Mstor;

    public breakfast(ArrayList<ImageButton> mealsofbreakfast) {
        this.mealsofbreakfast = mealsofbreakfast;

    }


    public void addbreakfastmeal(ImageButton mealsofbreakfast) {
        this.mealsofbreakfast.add(mealsofbreakfast);

    }



    public ArrayList<ImageButton> getMealsofbreakfast() {
        return mealsofbreakfast;
    }

    public void setMealsofbreakfast(ArrayList<ImageButton> mealsofbreakfast) {
        this.mealsofbreakfast = mealsofbreakfast;
    }
}
