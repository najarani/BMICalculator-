package com.androidnirajan.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText weghtfield, heightfield,heightfield2;
        Button bmibutton;
        TextView result;
        weghtfield = findViewById(R.id.weightField);
        heightfield = findViewById(R.id.heightField);
        heightfield2 = findViewById(R.id.heightfield2);
        bmibutton = findViewById(R.id.bmiButton);
        result =findViewById(R.id.result);
        bmibutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             int wt = Integer.parseInt(weghtfield.getText().toString());
             int heft = Integer.parseInt(heightfield.getText().toString());
             int heInch = Integer.parseInt(heightfield2.getText().toString());
                LinearLayout llmain = findViewById(R.id.linmain);
             int totalInc = heft*12+ heInch;
             double totalCent = totalInc*2.53;
             double totalMeter = totalCent/100;
             double bmi = wt/(totalMeter*totalMeter);
                if(bmi>25){
                    result.setText("You are overweight");
                    llmain.setBackgroundColor(getResources().getColor(R.color.ColorOw));
                }
                else if(bmi<18){
                  result.setText("You're UnderWeight");
                    llmain.setBackgroundColor(getResources().getColor(R.color.ColorUw));
                }
                else{
                    result.setText("You are healthy");
                    llmain.setBackgroundColor(getResources().getColor(R.color.ColorH));
                }
            }
        });


    }
}