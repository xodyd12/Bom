package com.example.bom;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;

import java.util.Random;

public class quiz extends AppCompatActivity implements View.OnClickListener {

    Button answer1, answer2, answer3, answer4;

    TextView score, question;

    private Questionanswer mQuestions = new Questionanswer();


    private String mAnswer;

    private int mScore = 0;

    private int mQuestionsLength = mQuestions.mQuestions.length;

    Random r;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quiz);

        r = new Random();



        answer1 = findViewById(R.id.answer1);
        answer2 = findViewById(R.id.answer2);
        answer3 = findViewById(R.id.answer3);
        answer4 = findViewById(R.id.answer4);

        score = findViewById(R.id.score);
        question = findViewById(R.id.question);

        score.setText("Score: " + mScore);

        updateQuestion(r.nextInt(mQuestionsLength));

        answer1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer1.getText() == mAnswer) {
                    if(mScore == 10)
                    {
                        gameOver();
                    }
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });

        answer2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer2.getText() == mAnswer) {
                    if(mScore == 10)
                    {
                        gameOver();
                    }
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });

        answer3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer3.getText() == mAnswer) {
                    if(mScore == 10)
                    {
                        gameOver();
                    }
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });

        answer4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (answer4.getText() == mAnswer) {
                    if(mScore == 10)
                    {
                        gameOver();
                    }
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
            }
        });


    }

    private void updateQuestion(int num) {
        question.setText(mQuestions.getQuestion(num));
        answer1.setText(mQuestions.getChoice1(num));
        answer2.setText(mQuestions.getChoice2(num));
        answer3.setText(mQuestions.getChoice3(num));
        answer4.setText(mQuestions.getChoice4(num));

        mAnswer = mQuestions.getCorrectAnswer(num);
    }


    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.answer1:
                if (answer1.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
                break;

            case R.id.answer2:
                if (answer2.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
                break;

            case R.id.answer3:
                if (answer3.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
                break;

            case R.id.answer4:
                if (answer4.getText() == mAnswer) {
                    mScore++;
                    score.setText("Score: " + mScore);
                    updateQuestion(r.nextInt(mQuestionsLength));
                } else {
                    gameOver();
                }
                break;

        }
    }


    private void gameOver() {
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(quiz.this);
        alertDialogBuilder
                .setMessage("Game Over! 당신의 점수는 ! " + mScore + " points.")
                .setCancelable(false)
                .setPositiveButton("다시 퀴즈 풀기",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), quiz.class));
                            }
                        })
                .setNegativeButton("메인으로",
                        new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                startActivity(new Intent(getApplicationContext(), MainActivity.class));
                            }
                        });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }
}
