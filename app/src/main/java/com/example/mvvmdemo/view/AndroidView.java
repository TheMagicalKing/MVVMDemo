package com.example.mvvmdemo.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.mvvmdemo.R;

public class AndroidView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }



    public void userText(View view) {
        TextView userInput = (TextView) findViewById(R.id.userInput);
        EditText info = (EditText) findViewById(R.id.userInputText);
        userInput.setText(info.getText());
    }

}