package com.example.resturantmariam;


import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.util.Log;
import android.widget.ImageButton;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;

import org.w3c.dom.NodeList;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class breakfast {
    private ArrayList<ImageButton> mealsofbreakfast;
    private FirebaseFirestore Mstor;

    public breakfast(ArrayList<ImageButton> mealsofbreakfast) {
        this.mealsofbreakfast = mealsofbreakfast;

    }
public void fbsstore(){
    breakfast meal1=new breakfast(mealsofbreakfast);
    Map<String, Object> breakfast = new HashMap<>();
    breakfast.put("NAME", "sofra1");
    //breakfast.put("PHOTO", );
    breakfast.put("PRICE", "500");

    Mstor.collection("breakfastmeals").document("bf")
            .set(breakfast)
            .addOnSuccessListener(new OnSuccessListener<Void>() {
                @Override
                public void onSuccess(Void aVoid) {
                    Log.d(TAG, "DocumentSnapshot successfully written!");
                }
            })
            .addOnFailureListener(new OnFailureListener() {
                @Override
                public void onFailure(@NonNull Exception e) {
                    Log.w(TAG, "Error writing document", e);
                }
            });
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
