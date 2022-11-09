package com.example.resturantmariam;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link forgotpasswordfragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class forgotpasswordfragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private EditText etemail;
    private ImageButton email;
    private FirebaseAuth mAuth;

    private void instalize() {
        String emaill, phone;
        etemail = getView().findViewById(R.id.Emailforgorpass);

        email = getView().findViewById(R.id.btnimagerforgotpass);
        emaill = etemail.getText().toString();
        mAuth = FirebaseAuth.getInstance();

        // if the user have acount //if he has no acount send toast and go to sign up
         email.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (emaill.trim().isEmpty()) {
                    Toast.makeText(getContext(), "SOMTHING FAILED ! " + "", Toast.LENGTH_SHORT).show();
                    return;}
                if (!isValidEmail(etemail.getText().toString().trim())) {
                    email.requestFocus();
                    Toast.makeText(getContext(), "EMAIL NOT VALID " + "", Toast.LENGTH_SHORT).show();
                    return;
                }
                mAuth.sendPasswordResetEmail(etemail.getText().toString());
            }


         });


    }


        //go to the menu



    public forgotpasswordfragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment forgotpasswordfragment.
     */
    // TODO: Rename and change types and number of parameters
    public static forgotpasswordfragment newInstance(String param1, String param2) {
        forgotpasswordfragment fragment = new forgotpasswordfragment();
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
        return inflater.inflate(R.layout.fragment_forgotpasswordfragment, container, false);
    }

    public static boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }


}