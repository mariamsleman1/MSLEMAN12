package com.example.resturantmariam;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link Signupfragmentcoustumer#newInstance} factory method to
 * create an instance of this fragment.
 */
public class Signupfragmentcoustumer extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private EditText etpassword;
    private EditText etemail;
    private EditText etconfirmpassword;
    private Button btnsignup;
    private FirebaseAuth mAuth;
    public Signupfragmentcoustumer() {
        // Required empty public constructor
    }
    public void createUser(){
        try{
            etpassword=getView().findViewById(R.id.passwordsignuocoustumer);
            etconfirmpassword=getView().findViewById(R.id.confirmpasscoustumersignup);
            etemail=getView().findViewById(R.id.emailsignuooustumer);
            btnsignup=getView().findViewById(R.id.sigtupbt);
            mAuth=FirebaseAuth.getInstance();

            if(!etemail.getText().toString().isEmpty()&&!etpassword.getText().toString().isEmpty()&&!etconfirmpassword.getText().toString().isEmpty()){
                if(etpassword.getText().toString().equals(etconfirmpassword.getText().toString())){
                    mAuth.createUserWithEmailAndPassword(etemail.getText().toString(),etpassword.getText().toString())
                .addOnSuccessListener(new OnSuccessListener<AuthResult>() {
                    @Override
                  public void onSuccess(AuthResult authResult) {
                   Toast.makeText(getContext(), "Account created.", Toast.LENGTH_SHORT).show();
                     if(mAuth.getCurrentUser()!=null){
                      mAuth.signOut();
                       }
                       }
                   })
              .addOnFailureListener(new OnFailureListener() {
              @Override
            public void onFailure(@NonNull Exception e) {
           Toast.makeText(getContext(),e.getMessage(), Toast.LENGTH_SHORT).show();
            }
           });
                }
                else{
                    Toast.makeText(getContext(), "Passwords do not match.", Toast.LENGTH_SHORT).show();
                }
            }
            else{
                Toast.makeText(getContext(), "Missing fields identified.", Toast.LENGTH_SHORT).show();
            }
        }
        catch (Exception e){
            Toast.makeText(getContext(),e.getMessage(),Toast.LENGTH_SHORT).show();
        }}

        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Signupfragmentcoustumer.
         */
    // TODO: Rename and change types and number of parameters
    public static Signupfragmentcoustumer newInstance(String param1, String param2) {
        Signupfragmentcoustumer fragment = new Signupfragmentcoustumer();
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
        return inflater.inflate(R.layout.fragment_signupfragmentcoustumer, container, false);
    }

    @Override
    public void startActivity(Intent intent) {
        super.startActivity(intent);
        instalize();
    }
    private  void instalize(){

        etpassword=getView().findViewById(R.id.passwordsignuocoustumer);
        etconfirmpassword=getView().findViewById(R.id.confirmpasscoustumersignup);
        etemail=getView().findViewById(R.id.emailsignuooustumer);
        btnsignup=getView().findViewById(R.id.btnsignup);
        mAuth=FirebaseAuth.getInstance();
        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email,  password, confirmpassword;
                email = etemail.getText().toString();
                password = etpassword.getText().toString();
                confirmpassword = etconfirmpassword.getText().toString();
                if (email.trim().isEmpty()  ||  password.trim().isEmpty() || confirmpassword.trim().isEmpty()) {
                    Toast.makeText(getContext(), "SOMTHING FAILED ! " + "", Toast.LENGTH_SHORT).show();

                    return;
                }
                if (!isValidEmail(email)) {

                    Toast.makeText(getContext(), "SOMTHING FAILED ! " + "", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (password.equals(confirmpassword)) {
                    Toast.makeText(getContext(), "SOMTHING FAILED ! " + "", Toast.LENGTH_SHORT).show();
                    return;
                }
                createUser();

            }
        });


    }
    public static boolean isValidEmail(CharSequence target) {
        if (target == null) {
            return false;
        } else {
            return android.util.Patterns.EMAIL_ADDRESS.matcher(target).matches();
        }
    }

    public static boolean isValidPhoneNumber(CharSequence target) {
        if (target == null || target.length() != 10) {
            return false;
        } else {
            return android.util.Patterns.PHONE.matcher(target).matches();
        }
    }}


