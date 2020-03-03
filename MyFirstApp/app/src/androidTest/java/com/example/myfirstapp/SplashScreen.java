package com.example.myfirstapp;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.annotation.Nullable;

public class SplashScreen extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstancesStates) {
        super.onCreate(savedInstancesStates);

        startActivity(new Intent(this,MainActivity.class));




    }


}
