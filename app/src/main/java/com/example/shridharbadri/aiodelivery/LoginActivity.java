package com.example.shridharbadri.aiodelivery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    private TextView ForgetText;
    private EditText UserName,Password;
    private Button btnLogIn,btnCancel;
    TextView NewAccounttext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        ForgetText=(TextView)findViewById(R.id.textView3);
        btnLogIn=(Button)findViewById(R.id.button2);
        UserName=(EditText)findViewById(R.id.userName);
        Password=(EditText)findViewById(R.id.Password);
        NewAccounttext=(TextView)findViewById(R.id.textView);
        NewAccounttext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(LoginActivity.this,TabPagerActivity.class);
                startActivity(intent);
            }
        });
        //btnCancel=(Button)findViewById(R.id.button);
        ForgetText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //ForgetText.setClickable(false);
            }
        });
        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Animation bounce= AnimationUtils.loadAnimation(getApplication(),R.anim.bounce);
                MyBounceInterpolator interpolator = new MyBounceInterpolator(0.2, 20);
                bounce.setInterpolator(interpolator);
                btnLogIn.startAnimation(bounce);

                //btnLogIn.setEnabled(false);

                //Getting data from EditText & Passing it to AsyncTask
                String l_UserName=UserName.getText().toString().trim();
                String l_Password=Password.getText().toString().trim();
                BackgroundTask backgroundTask=new BackgroundTask(LoginActivity.this,l_UserName,l_Password);
                backgroundTask.execute("login");
            }
        });

    }
}
class MyBounceInterpolator implements android.view.animation.Interpolator {
    double mAmplitude = 1;
    double mFrequency = 10;

    MyBounceInterpolator(double amplitude, double frequency) {
        mAmplitude = amplitude;
        mFrequency = frequency;
    }

    public float getInterpolation(float time) {
        return (float) (-1 * Math.pow(Math.E, -time/ mAmplitude) *
                Math.cos(mFrequency * time) + 1);
    }
}