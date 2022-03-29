package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
 Button button1;
TextView TextView1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.newlayout);
        button1 = findViewById(R.id.button);
        TextView1 = findViewById(R.id.textView3);

        button1.setText(R.string.button);
        button1.setTextColor(Color.YELLOW);
        button1.setBackgroundColor(Color.BLUE);
    }
public void clickmybutton(View view){

    TextView1.setBackgroundColor(Color.BLUE);
    TextView1.setText(R.string.textview);
    TextView1.setTextColor(Color.YELLOW);

    }
}