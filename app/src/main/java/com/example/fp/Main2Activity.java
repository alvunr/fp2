package com.example.fp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {
    Equation equationLibrary = new Equation();
    TextView equations; // Question / equation text view
    TextView scoreTextBox;
    Button option1; // button A
    Button option2; // Button B
    Button option3; // Button C.
    Button mainMenu; // Main menu button
    int max = 9;


    private int numberOfQuestions = 0;
    private int score = 0;
    private String answers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        equations = findViewById(R.id.equationInViews);
        scoreTextBox = findViewById(R.id.scoreId);
        option1 = findViewById(R.id.button8);
        option2 = findViewById(R.id.button9);
        option3 = findViewById(R.id.button10);
        mainMenu = findViewById(R.id.mainMenu);



        equations = findViewById(R.id.equationInViews);
        //final MediaPlayer soundzz = MediaPlayer.create(this, R.raw.ycndi);
        SoundPlayer soundz = new SoundPlayer(this);

        updateQuestions();


        option1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option1.getText() == answers) {
                    score = score + 1;
                    updateScore(score);
                    soundz.playRightSound();
                    updateQuestions();
                    //Code for web API should be added here
                    //make correct sound
                    //add else statement and make wrong sound
                }
                else {
                    soundz.playWrongSound();
                    //wrong sound affect
                    //System.out.println("hi");
                }
            }
        });

        option2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option2.getText() == answers) {
                    score = score + 1;
                    updateScore(score);
                    soundz.playRightSound();
                    updateQuestions();
                }
                else {
                    soundz.playWrongSound();
                    // sound wrong affect
                }
            }
        });

        option3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (option3.getText() == answers) {
                    score = score + 1;
                    updateScore(score);
                    soundz.playRightSound();
                    updateQuestions();
                }
                else {
                    soundz.playWrongSound();
                    //sound wrong affect
                }
            }
        });

        mainMenu.setOnClickListener(view -> {
            Intent intent = new Intent(Main2Activity.this, MainActivity.class);
            startActivity(intent);
        });




    }

    private void updateScore(int a) {
        scoreTextBox.setText("Score: " + score);
    }



    private void updateQuestions() {
        //System.out.println("hi");
        equations.setText(equationLibrary.getQuestions(numberOfQuestions)); //updates the question in the textview
        option1.setText(equationLibrary.getOption1(numberOfQuestions)); // updates the button text for Button A
        option2.setText(equationLibrary.getOption2(numberOfQuestions)); // updates the button text for Button B
        option3.setText(equationLibrary.getOption3(numberOfQuestions)); // updates the button text for Button C
        //scoreTextBox.setText(score);
        //equation library is the object from Equation class
        //getQuestion, and getOption are methods from the Equation class

        answers = equationLibrary.getAnswers(numberOfQuestions); // updates the answers
        numberOfQuestions++; // adds more questions to the game
        if (numberOfQuestions == max) {
            numberOfQuestions = 0;
        }

    }
}
