package com.example.resturantmariam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class manager extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_manager);
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.framelayoutmanager,new fragmentloginmanger());
        ft.commit();
    }
}