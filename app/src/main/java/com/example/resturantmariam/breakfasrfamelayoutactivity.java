package com.example.resturantmariam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class breakfasrfamelayoutactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_breakfasrfamelayoutactivity);

        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.breakfastmenuframelayout,new arabianbreakfastfragment());
        ft.commit();

    }
}