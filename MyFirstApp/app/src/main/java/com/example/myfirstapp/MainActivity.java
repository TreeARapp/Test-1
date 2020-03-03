package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button button;
//https://www.coursera.org/specializations/android-app-development
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = findViewById(R.id.galleryButton);
        button.setOnClickListener(v -> opengallery());

    }

    public void opengallery() {
        Intent intent = new Intent(MainActivity.this, gallery.class );
        startActivity(intent);
    }





    public void cameraButton(View View) {

        TextView output = findViewById(R.id.bruhMoment);

        output.setText("This button works");

    }


    }




