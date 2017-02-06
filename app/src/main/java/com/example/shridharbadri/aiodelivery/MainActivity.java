package com.example.shridharbadri.aiodelivery;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import static java.lang.Thread.sleep;

public class MainActivity extends AppCompatActivity {
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        final Intent it=new Intent(MainActivity.this,LoginActivity.class);
        Thread td=new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    startActivity(it);
                    finish();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        td.start();
    }
}
