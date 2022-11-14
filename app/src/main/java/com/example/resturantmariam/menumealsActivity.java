package com.example.resturantmariam;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;

public class menumealsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menumeals);

    }

    public void breakfastbtn(View view) {
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        //ft.replace(R.id.menuframelayout,new employeesignin());
        ft.commit();
    }

    public void lunchbtn(View view) {
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        //ft.replace(R.id.menuframelayout,new employeesignin());
        ft.commit();
    }

    public void dinnerbtn(View view) {
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        //ft.replace(R.id.menuframelayout,new employeesignin());
        ft.commit();
    }

    public void drinkbtn(View view) {
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        //ft.replace(R.id.employeeframelayout,new employeesignin());
        ft.commit();
    }

    public void dessertbtn(View view) {
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        //ft.replace(R.id.employeeframelayout,new employeesignin());
        ft.commit();
    }
}