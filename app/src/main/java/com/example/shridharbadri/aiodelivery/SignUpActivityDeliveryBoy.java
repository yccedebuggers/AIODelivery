package com.example.shridharbadri.aiodelivery;

import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivityDeliveryBoy extends Fragment {
    EditText edtName,edtuserName,edtEmail,edtPass,edtRePass,edtAdd1,edtAdd2,edtAdd3;
    Button btnCancel,btnSave;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        edtName= (EditText) getActivity().findViewById(R.id.deliceryboy_name);
        edtEmail= (EditText) getActivity().findViewById(R.id.deliveryboy_email);
        edtuserName= (EditText) getActivity().findViewById(R.id.deliveryboy_username);
        edtAdd1= (EditText) getActivity().findViewById(R.id.deliveryboy_add1);
        edtAdd2= (EditText) getActivity().findViewById(R.id.deliveryboy_add2);
        edtAdd3= (EditText) getActivity().findViewById(R.id.deliveryboy_add3);
        edtPass= (EditText) getActivity().findViewById(R.id.deliveryboy_pass);
        edtRePass= (EditText) getActivity().findViewById(R.id.deliveryboy_re_password);
        btnCancel= (Button) getActivity().findViewById(R.id.cancel_deliveryboy_signup);
        btnSave= (Button) getActivity().findViewById(R.id.signup_deliveryboy_submit);
//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        View rootView = inflater.inflate(R.layout.activity_sign_up_delivery_boy, container, false);

        return rootView;
    }


}
