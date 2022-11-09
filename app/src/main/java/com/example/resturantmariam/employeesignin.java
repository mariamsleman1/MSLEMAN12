package com.example.resturantmariam;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link employeesignin#newInstance} factory method to
 * create an instance of this fragment.
 */
public class employeesignin extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";

    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;
    private Button etbtnlogin;
    private EditText etemailemployee;
    private EditText etpasswordemployee;

    public employeesignin() {
        // Required empty public constructor
    }
    public void initilize(){
        etemailemployee=getView().findViewById(R.id.emailloginemployee);
        etpasswordemployee=getView().findViewById(R.id.passwordemployeelogin);
        etbtnlogin=getView().findViewById(R.id.btnemployee);


        etbtnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String etmail,etpassword;
                etmail=etemailemployee.getText().toString();
                etpassword=etpasswordemployee.getText().toString();
            if ( etmail.trim().isEmpty()||etpassword.trim().isEmpty()) {
                Toast.makeText(getContext(), "SOMTHING FAILED ! " + "", Toast.LENGTH_SHORT).show();
                return;}
                //check if the employee at thedata.

            }
        });
    }


    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment employeesignin.
     */
    // TODO: Rename and change types and number of parameters
    public static employeesignin newInstance(String param1, String param2) {
        employeesignin fragment = new employeesignin();
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
        return inflater.inflate(R.layout.fragment_employeesignin, container, false);
    }

}