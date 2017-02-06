package com.example.shridharbadri.aiodelivery;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivityOwner extends Fragment {
    EditText edtName,edtuserName,edtEmail,edtPass,edtRePass,edtAdd1,edtAdd2,edtAdd3;
    Button btnCancel,btnSave;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        edtName= (EditText) getActivity().findViewById(R.id.owner_name);
        edtEmail= (EditText) getActivity().findViewById(R.id.owner_email);
        edtuserName= (EditText) getActivity().findViewById(R.id.owner_user);
        edtAdd1= (EditText) getActivity().findViewById(R.id.owner_add_line1);
        edtAdd2= (EditText) getActivity().findViewById(R.id.owner_add_line2);
        edtAdd3= (EditText) getActivity().findViewById(R.id.owner_add_line3);
        edtPass= (EditText) getActivity().findViewById(R.id.owner_pass);
        edtRePass= (EditText) getActivity().findViewById(R.id.owner_re_password);
        btnCancel= (Button) getActivity().findViewById(R.id.cancel_owner_signup);
        btnSave= (Button) getActivity().findViewById(R.id.signuo_owner_submit);
//        btnSave.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
        View rootView = inflater.inflate(R.layout.activity_sign_up_owner, container, false);

        return rootView;
    }
}
