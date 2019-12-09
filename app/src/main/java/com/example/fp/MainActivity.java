package com.example.fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button start;
    Button flashcards;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        start = findViewById(R.id.Start);
        flashcards = findViewById(R.id.flashcards);


        start.setOnClickListener(new View.OnClickListener() {
            // brings you to the rules/instruction page
            @Override
            public void onClick(View v) {
                Intent rulesIntent = new Intent(MainActivity.this, Rules.class);
                startActivity(rulesIntent);
            }
        });


        flashcards.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent flashIntent = new Intent(MainActivity.this, Flashcards.class);
                startActivity(flashIntent);
            }
        });
    }
}

