package com.example.instantproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SecondActivity extends AppCompatActivity {

    String takeExtra1;
    String takeExtra2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button addbutton = (Button) findViewById(R.id.button3);
        Button mine      = (Button) findViewById(R.id.button4);
        Button multiple  =  (Button)findViewById(R.id.button5);
        Button devide    = (Button)  findViewById(R.id.button6);

        Intent getIntent  = getIntent();

        EditText numer01 = (EditText) findViewById(R.id.numer01);
        EditText number02 = (EditText) findViewById(R.id.number02);

        takeExtra1 = getIntent.getStringExtra("EXTRA1");
        takeExtra2 = getIntent.getStringExtra("EXTRA2");


        numer01.setText(takeExtra1);
        number02.setText(takeExtra2);

        String n1 = numer01.getText().toString();
        String n2 = number02.getText().toString();

        addbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               Add();
            }
        });
        mine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                substract();
            }
        });
        multiple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                multiple();
            }
        });
        devide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                devide();
            }
        });


    }

    public void Add(){
        EditText txt1 = findViewById(R.id.numer01);
        EditText txt2= findViewById(R.id.number02);
        EditText txt = findViewById(R.id.txt);

        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int result = num1 + num2;
        txt.setText("Answer ="+String.valueOf(result));
    }
    public void substract(){

        EditText txt1 = findViewById(R.id.numer01);
        EditText txt2 = findViewById(R.id.number02);
        EditText txt3 = findViewById(R.id.txt);

        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int result = num1 - num2;
        txt3.setText("Answer ="+String.valueOf(result));
    }
    public void multiple(){

        EditText txt1 = findViewById(R.id.numer01);
        EditText txt2 = findViewById(R.id.number02);
        EditText txt3 = findViewById(R.id.txt);

        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int result = num1 * num2;
        txt3.setText("Answer ="+String.valueOf(result));
    }

    public void devide(){

        EditText txt1 = findViewById(R.id.numer01);
        EditText txt2 = findViewById(R.id.number02);
        EditText txt3 = findViewById(R.id.txt);

        int num1 = Integer.parseInt(txt1.getText().toString());
        int num2 = Integer.parseInt(txt2.getText().toString());
        int result = num1 / num2;
        txt3.setText("Answer ="+String.valueOf(result));
    }

}
