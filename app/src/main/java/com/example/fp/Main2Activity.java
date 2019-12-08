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
    int max = 9;

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
                    //Code for web API should be added here
                    //make correct sound
                    //add else statement and make worng sound
                } else {
                    updateQuestions();
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option2.getText() == answers) {
                    updateQuestions();
                } else {
                    updateQuestions();
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option3.getText() == answers) {
                    updateQuestions();
                } else {
                    updateQuestions();
                }
            }
        });

    }
    private void updateQuestions() {
        System.out.println("hi");
        equations.setText(equationLibrary.getQuestions(numberOfQuestions)); //updates the question in the textview
        option1.setText(equationLibrary.getOption1(numberOfQuestions)); // updates the button text for Button A
        option2.setText(equationLibrary.getOption2(numberOfQuestions  + 1)); // updates the button text for Button B
        option3.setText(equationLibrary.getOption3(numberOfQuestions + 2)); // updates the button text for Button C
        //equation library is the object from Equation class
        //getQuestion, and getOption are methods from the Equation class

        answers = equationLibrary.getAnswers(numberOfQuestions); // updates the answers
        numberOfQuestions++; // adds more questions to the game
        if (numberOfQuestions == max) {
            numberOfQuestions = 0;
        }

    }
}
