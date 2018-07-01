package com.example.chiboy.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int correct = 0;
    int wrong = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCheckboxClicked(View view) {
        // Is the view now checked?
        boolean checked = ((CheckBox) view).isChecked();

        // Check which checkbox was clicked
        switch(view.getId()) {
            case R.id.correctAnswer1:
                if (checked)
                correct += 1; // update the number of correct answer
            else
                wrong += 1;// update the number of wrong answer
                break;
            case R.id.correctAnswer2:
                if (checked)
                    correct += 1; // update the number of correct answer
            else
                    wrong += 1; // update the number of wrong answer
                break;
            case R.id.correctAnswer3:
                if (checked)
                    correct += 1; // update the number of correct answer
                else
                    wrong += 1;// update the number of wrong answer
                break;
            case R.id.correctAnswer4:
                if (checked)
                    correct += 1; // update the number of correct answer
                else
                    wrong += 1; // update the number of wrong answer
                break;
            case R.id.correctAnswer5:
                if (checked)
                    correct += 1; // update the number of correct answer
                else
                    wrong += 1; // update the number of wrong answer
                break;



        }

    }
    public void submit(View view) {


        //figure out if the user wants chocolate toppings
//        CheckBox questionOne = (CheckBox) findViewById(R.id.correctAnswer1);
//        Boolean hasCorrectAnswerOne = questionOne.isChecked();

//        //figure out if the user wants chocolate toppings
//        CheckBox questionOneW = (CheckBox) findViewById(R.id.wrongAnswer1);
//        Boolean hasWrongAnswerOne = questionOneW.isChecked();

        
        Toast.makeText(this, "you have " + correct + " correct answers and " + wrong + " wrong answers.", Toast.LENGTH_SHORT).show();
//      Toast.makeText(this, "you have " + hasCorrectAnswerOne + " and " + hasWrongAnswerOne, Toast.LENGTH_SHORT).show();
    }


    }
