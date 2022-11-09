package com.example.resturantmariam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class frameLayoutMaincoustumer extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frame_layout_maincoustumer);
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.framelayoutcoustumer,new Loginfragmentcoustumer());
        ft.commit();
    }
}