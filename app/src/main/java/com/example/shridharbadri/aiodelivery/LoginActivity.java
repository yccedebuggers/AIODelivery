package com.example.shridharbadri.aiodelivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView ForgetText;
    Button btnLogIn,btnCancel;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ForgetText=(TextView)findViewById(R.id.textView3);
        btnLogIn=(Button)findViewById(R.id.button2);
        btnCancel=(Button)findViewById(R.id.button);
        ForgetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ForgetText.setClickable(false);
            }
        });
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnLogIn.setEnabled(false);
                btnCancel.setEnabled(true);

            }
        });
        btnCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}
