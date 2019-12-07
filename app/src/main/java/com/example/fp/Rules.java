package com.example.fp;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Rules extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.rules);
        Button next = findViewById(R.id.Next);
        next.setOnClickListener((v -> {
            Intent intent = new Intent(Rules.this, Main2Activity.class);
            startActivity(intent);

        }));
        Button back = findViewById(R.id.back);
        back.setOnClickListener((v -> {
            Intent thisintent = new Intent(Rules.this, MainActivity.class);
            startActivity(thisintent);
        }));
    }
}
