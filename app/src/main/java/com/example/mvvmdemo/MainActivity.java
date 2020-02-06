package com.example.mvvmdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void userText() {
        TextView userInput = (TextView) findViewById(R.id.userInput);
        TextView info = (TextView) findViewById(R.id.userInputText);
        userInput.setText((CharSequence) info);
    }
}
