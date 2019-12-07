package com.example.fp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class Flashcards extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.flashcards);
        // Now i'll make the Buttons
        questions();
        Button next = findViewById(R.id.menu);
        next.setOnClickListener(new View.OnClickListener() {
            // brings you to the rules/instruction page
            @Override
            public void onClick(View v) {
                Intent menuIntent = new Intent(Flashcards.this, MainActivity.class);
                startActivity(menuIntent);
            }
        });
    }
    String a = "             x + 5 = 10";
    public void questions() {
        final Switch flashcard1 = findViewById(R.id.switch1);
        flashcard1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    flashcard1.setText("             5");
                } else {
                    flashcard1.setText(a);
                }
            }
        });

        // Below: switch for the second flashcard
        // x * 6 = 600
        final String b = ("             x * 6 = 600");
        final Switch flashcard2 = findViewById(R.id.switch2);
        flashcard2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    flashcard2.setText("             100");
                } else {
                    flashcard2.setText(b);
                }
            }
        });

        // Below: switch for the third flashcard
        // x + 71 = 100
        final String c = ("             x + 71 = 100");
        final Switch flashcard3 = findViewById(R.id.switch3);
        flashcard3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    flashcard3.setText("             29");
                } else {
                    flashcard3.setText(c);
                }
            }
        });

        // Below: switch for the fourth flashcard
        // x / 8 = 15
        final String d = ("             x / 8 = 15");
        final Switch flashcard4 = findViewById(R.id.switch4);
        flashcard4.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    flashcard4.setText("              90");
                } else {
                    flashcard4.setText(d);
                }
            }
        });

        // Below: switch for the fifth flashcard
        // x + 9 = 10
        final String e = ("             x + 9 =10");
        final Switch flashcard5 = findViewById(R.id.switch5);
        flashcard5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    flashcard5.setText("             1");
                } else {
                    flashcard5.setText(e);
                }
            }
        });

        // Below: switch for the sixth flashcard
        // x - 24 = 10
        final String f = ("             x - 24 = 10");
        final Switch flashcard6 = findViewById(R.id.switch6);
        flashcard6.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    flashcard6.setText("             34");
                } else {
                    flashcard6.setText(f);
                }
            }
        });

        // Below: switch for the seventh flashcard
        // x + 41 = 30
        final String g = ("             x + 41 = 30");
        final Switch flashcard7 = findViewById(R.id.switch7);
        flashcard7.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    flashcard7.setText("             -11");
                } else {
                    flashcard7.setText(g);
                }
            }
        });

        // Below: switch for the eighth flashcard
        // x * 3 = 42
        final String h = ("             x * 3 = 42");
        final Switch flashcard8 = findViewById(R.id.switch8);
        flashcard8.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    flashcard8.setText("             14");
                } else {
                    flashcard8.setText(h);
                }
            }
        });

        // Below: switch for the ninth flashcard (x + 4 = 10)
        final String k = ("             x + 4 = 10");
        final Switch flashcard9 = findViewById(R.id.switch9);
        flashcard9.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked == true) {
                    flashcard9.setText("             6");
                } else {
                    flashcard9.setText(k);
                }
            }
        });
    }

    //then on another method or where you want
}
