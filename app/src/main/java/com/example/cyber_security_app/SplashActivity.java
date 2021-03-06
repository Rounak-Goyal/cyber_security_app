package com.example.cyber_security_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        int SPLASH_TIME = 2000;
        new Handler().postDelayed(() -> {
            Intent intent = new Intent(getApplicationContext(), HomeSlider.class);
            startActivity(intent);
            finish();
        }, SPLASH_TIME);
    }
}