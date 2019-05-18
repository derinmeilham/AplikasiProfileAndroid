package com.njos.tugasmvp.activity;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Window;

import com.njos.tugasmvp.R;
import com.njos.tugasmvp.activity.OnBoardingActivity;


//tanggal 18/05/2019
//NIM : 10116040
//NAMA : Anjas Kurnia Sandy
//Kelas : IF 1
public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_splash_screen);




            final Handler handler = new Handler();
            handler.postDelayed(new Runnable() {
                @Override
                public void run() {
                    startActivity(new Intent(getApplicationContext(), OnBoardingActivity.class));
                    finish();
                }
            }, 3000L); //3000 L = 3 detik
        }
    }
