package com.example.instantproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button go = (Button) findViewById(R.id.button);

        final EditText num01 = (EditText) findViewById(R.id.numer01);
        final EditText num02 = (EditText) findViewById(R.id.number02);



        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FirstActivity.this,SecondActivity.class);

                String n1 = num01.getText().toString();
                String n2 = num02.getText().toString();

                intent.putExtra("EXTRA1",n1);
                intent.putExtra("EXTRA2",n2);

                Context context = getApplicationContext();
                CharSequence message = "Data received";
                int duration  = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context,message,duration);
                toast.show();


                startActivity(intent);
            }
        });
    }
}
