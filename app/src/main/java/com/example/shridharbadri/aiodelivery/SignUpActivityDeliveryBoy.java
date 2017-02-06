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
        View rootView = inflater.inflate(R.layout.activity_sign_up_delivery_boy, container, false);

        return rootView;
    }


}
