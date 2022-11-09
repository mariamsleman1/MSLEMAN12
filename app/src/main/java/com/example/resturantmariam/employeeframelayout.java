package com.example.resturantmariam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class employeeframelayout extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_employeeframelayout);
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.employeeframelayout,new employeesignin());
        ft.commit();
    }
}