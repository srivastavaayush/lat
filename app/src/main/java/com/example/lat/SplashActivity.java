package com.example.lat;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class SplashActivity extends AppCompatActivity {

    TextView slogan;
    LottieAnimationView lottie;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        slogan = findViewById(R.id.slogan);
        lottie = findViewById(R.id.lottie);

        slogan.animate().translationY(-1400).setDuration(10000).setStartDelay(0);
        lottie.animate().translationY(2000).setDuration(2000).setStartDelay(2900);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(getApplicationContext(),SignupActivity.class);
                startActivity(intent);
                SplashActivity.this.finish();
            }
        },5000);
    }
}
