package com.example.resturantmariam;

import static androidx.constraintlayout.helper.widget.MotionEffect.TAG;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;
import com.google.firebase.storage.FirebaseStorage;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link arabianbreakfastfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class arabianbreakfastfragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private ImageButton breakfastarabian1;
    private ImageButton breakfastarabian2;
    private ImageButton breakfastarabian3;
    private ImageButton breakfastarabian4;
    private ImageButton breakfastarabian5;
    private ImageButton breakfastarabian6;
    private ImageButton foolbreakfast;
    private ImageButton hummosbreakfast;
    private ImageButton kakealqudsbreakfast;
    private ImageButton manakesh;
    private ImageButton labanehbrakfast;
    private ImageButton shkshoukabreakfast;
    private ArrayList<ImageButton> mealsofbreakfast;


public void connect(){
    breakfastarabian1=getView().findViewById(R.id.breakfastmeal1);
    breakfastarabian2=getView().findViewById(R.id.breakfastmeal2);
    breakfastarabian3=getView().findViewById(R.id.breakfastmeal3);
    breakfastarabian4=getView().findViewById(R.id.breakfastmeal4);
    breakfastarabian5=getView().findViewById(R.id.breakfastmeal5);
    breakfastarabian6=getView().findViewById(R.id.breakfastmeal6);
    foolbreakfast=getView().findViewById(R.id.foolbreakfast);
    hummosbreakfast=getView().findViewById(R.id.hummosbreakfast);
    kakealqudsbreakfast=getView().findViewById(R.id.kaakalqudsbreakfast);
    manakesh=getView().findViewById(R.id.manakeshbreakfast);
    labanehbrakfast=getView().findViewById(R.id.labanehbreakfast);
    shkshoukabreakfast=getView().findViewById(R.id.shakshkabreakfast);

}
public void constuctur(){
    //make array list
    mealsofbreakfast.add(breakfastarabian1);
    mealsofbreakfast.add(breakfastarabian2);
    mealsofbreakfast.add(breakfastarabian3);
    mealsofbreakfast.add(breakfastarabian4);
    mealsofbreakfast.add(breakfastarabian5);
    mealsofbreakfast.add(breakfastarabian6);
    mealsofbreakfast.add( foolbreakfast);
    mealsofbreakfast.add( hummosbreakfast);
    mealsofbreakfast.add( kakealqudsbreakfast);
    mealsofbreakfast.add( manakesh);
    mealsofbreakfast.add( labanehbrakfast);
    mealsofbreakfast.add( shkshoukabreakfast);

}
    private void activity() {
    //???????? ???????????? ?????????? ???? ?????????? ????????
    }

public void startactivity(){
    connect();
    constuctur();
    activity();
    //?????????? ???????? ???????? ?????????????? ?? ?????? ??????????????

}




    public arabianbreakfastfragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment arabianbreakfastfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static arabianbreakfastfragment newInstance(String param1, String param2) {
        arabianbreakfastfragment fragment = new arabianbreakfastfragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_arabianbreakfastfragment, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        startactivity();
    }
}