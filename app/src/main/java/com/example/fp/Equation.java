package com.example.fp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class Equation extends AppCompatActivity {


//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.equations);
//
//        // Button pressed: brings you to the previous page:
//        Button previous = findViewById(R.id.Previous);
//        previous.setOnClickListener(unused -> startActivity(new Intent(this, Rules.class)));
//        // Button pressed: brings to you the Next page:
//        //Button next = findViewById(R.id.Next);
//       // next.setOnClickListener(unused -> startActivity(new Intent(this, Endgame.class)));
//        //System.out.println(test.qui);
//
//
//    }


//    public String quizQuestions() { // main set of questions for the game.
//        String a = "x + 5 = 10"; // 5
//        String b = ; // 100
//        String c = "x + 71 = 100"; // 29
//        String d = "x / 8 = 15"; // 90
//        String e = "x + 9 = 10"; // 1
//        String f = "x - 24 = 10"; // 34
//        String g = "x + 41 = 30"; // -11
//        String h = "x * 3 = 42"; // 14
//        String k = "x + 4 = 10"; // 6
//        // String[] array = {a, b, c, d, e, f, g, h, k};
//        return " ";
//    }
    private String questions [] = {
            "x + 5 = 10", "", "", "x * 6 = 600", "", "",  "x + 71 = 100", "", "",  "x / 8 = 15", "", "",  "x + 9 = 10", "", "",
            "x - 24 = 10", "", "",  "x + 41 = 30", "", "",  "x * 3 = 42", "", "",  "x + 4 = 10"
    };


    private String answerz [] = { // stored in an array
            "5","", "",  "100", "", "",  "29", "", "", "90", "", "",  "1", "", "",  "34", "", "",  "-11", "", "",  "14", "", "", "6"
    };

//    private String choices[][] = {
//            {"-5, 5, 15"},
//            {"100, 99, 10"},
//            {"39, 21, 29"},
//            {"120, 80, 70"},
//            {"-1, 1, 0"},
//            {"14, 24, 34"},
//            {"11, -11, 31"},
//            {"18, 14, 16"},
//            {"-6, 16, 6"}
//    };

    private String choices[] = {
            "-5",
            "5",
            "15",
            "100",
            "99",
            "10",
            "39",
            "21",
            "29",
            "120",
            "80",
            "70",
            "-1",
            "1",
            "0",
            "14",
            "24",
            "34",
            "11",
            "-11",
            "31",
            "18",
            "14",
            "16",
            "-6",
            "16",
            "6"
};



    public String getQuestions(int i) {
        String que = questions[i];
        return que;
    }
    // Sets up a getter for the questions.
    // Gets the questions
    // returns a question from the array

    public String getAnswers(int i) { // returns the correct answer from the array
        String ans = answerz[i];
        return ans;
    }
    // Sets up a getter for the answers
    // Gets the answers
    // returns an answer from the array'

    //Below: getter for each option
    public String getOption1(int i) {
        String option1 = choices[i];
        if (i % 3 == 0) {
            return option1;
        }

        return null;
        // row of the array is being set to i and changing the index every time being updated
        // the coloumn is being set to a constant
    }
    public String getOption2(int i) {
        String option2 = choices[i];
        if (i % 3 == 1) {
            return option2;
        }
        return null;

       // System.out.println("kkkdf");
    }
    public String getOption3(int i) {
        String option3 = choices[i];
        if (i % 3 == 2) {
            return option3;
        }
        return null;
    }
}