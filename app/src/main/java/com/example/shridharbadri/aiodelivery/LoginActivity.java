package com.example.shridharbadri.aiodelivery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
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