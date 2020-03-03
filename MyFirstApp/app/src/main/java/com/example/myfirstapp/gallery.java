package com.example.myfirstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class gallery extends AppCompatActivity {

    private Object button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);

        button = findViewById(R.id.backButton);
        ((View) button).setOnClickListener(v -> backButton());

    }

    public void backButton() {
        Intent intent = new Intent(gallery.this, MainActivity.class);
        startActivity(intent);
    }
}

