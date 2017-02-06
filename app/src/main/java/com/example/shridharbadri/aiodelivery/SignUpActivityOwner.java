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

        edtName.getRootView().findViewById(R.id.owner_name);
        edtEmail.getRootView().findViewById(R.id.owner_email);
        edtuserName.getRootView().findViewById(R.id.owner_user);
        edtAdd1.getRootView().findViewById(R.id.owner_add_line1);
        edtAdd2.getRootView().findViewById(R.id.owner_add_line2);
        edtAdd3.getRootView().findViewById(R.id.owner_add_line3);
        edtPass.getRootView().findViewById(R.id.owner_pass);
        edtRePass.getRootView().findViewById(R.id.owner_re_password);
        btnCancel.getRootView().findViewById(R.id.cancel_owner_signup);
        btnSave.getRootView().findViewById(R.id.signuo_owner_submit);
        View rootView = inflater.inflate(R.layout.activity_sign_up_owner, container, false);

        return rootView;
    }
}
