package com.example.android.design;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    String letter = " " ;
    int  [] n = new int[11];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void one (View v) {
        display(1);

    }
    public void four (View v) {
        display(4);

    }
    public void seven (View v) {
        display(7);

    }
    public void star (View v) {
        letter = "*";
        displayLetter(letter);

    }
    public void two (View v) {
        display(2);

    }
    public void five (View v) {
        display(5);

    }
    public void eight (View v) {
        display(8);

    }
    public void zero (View v) {
        display(0);

    }
    public void three (View v) {
        display(3);

    }
    public void six (View v) {
        display(6);

    }
    public void nine (View v) {
        display(9);

    }
    public void delete (View v) {
        int number =0;
        display(number);

    }






    public void display(int number) {
        TextView numberView = (TextView) findViewById(R.id.show_text_view);
        numberView.setText(String.valueOf(number));
    }
    public void displayLetter(String letter) {
        TextView scoreView = (TextView) findViewById(R.id.show_text_view);
        scoreView.setText(String.valueOf(letter));
    }

}
