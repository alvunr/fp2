package com.example.fp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class GoodJob extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.goodjob);
        Button menu;
        menu = findViewById(R.id.mm);
        menu.setOnClickListener((v -> {
            Intent menuintent = new Intent(GoodJob.this, MainActivity.class);
            startActivity(menuintent);
        }));
    }
}
