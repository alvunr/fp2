package com.example.fp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Equation equationLibrary = new Equation();
    TextView equations; // Question / equation text view
    Button option1; // button A
    Button option2; // Button B
    Button option3; // Button C


    private int numberOfQuestions = 0;
    private String answers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        equations = findViewById(R.id.equationInViews);
        option1 = findViewById(R.id.button8);
        option2 = findViewById(R.id.button9);
        option3 = findViewById(R.id.button10);

        equations = findViewById(R.id.equationInViews);


        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option1.getText() == answers) {
                    updateQuestions();
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option2.getText() == answers) {
                    updateQuestions();
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option3.getText() == answers) {
                    updateQuestions();
                }
            }
        });

    }
    private void updateQuestions() {
        equations.setText(equationLibrary.getQuestions(numberOfQuestions)); //updates the question in the textview
        option1.setText(equationLibrary.getOption1(numberOfQuestions)); // updates the button text for Button A
        option2.setText(equationLibrary.getOption2(numberOfQuestions)); // updates the button text for Button B
        option3.setText(equationLibrary.getOption3(numberOfQuestions)); // updates the button text for Button C

        answers = equationLibrary.getAnswers(numberOfQuestions); // updates the answers
        numberOfQuestions++; // adds more questions to the game
    }
}
