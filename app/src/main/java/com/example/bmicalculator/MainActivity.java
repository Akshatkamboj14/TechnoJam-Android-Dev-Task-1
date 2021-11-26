package com.example.bmicalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Button;

import java.text.BreakIterator;

public class MainActivity extends AppCompatActivity {
    String bmiResult;
    private EditText name;
    private EditText editTextHeight;
    private EditText editTextweight;
    private Button button;
    private TextView resulttext;

    public MainActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        name = findViewById(R.id.name);
        editTextHeight= findViewById(R.id.editTextHeight);
        editTextweight=findViewById(R.id.editTextWeight);
        button = findViewById(R.id.button);
        resulttext = findViewById(R.id.resulttext);
    }
    public void Bmi(View view){
        String n =name.getText().toString();
        String h = editTextHeight.getText().toString();
        String w = editTextweight.getText().toString();
        float hValue=Float.parseFloat(h);
        float wValue=Float.parseFloat(w);
        float bmi = wValue/(hValue*hValue);
        String bmi1 = String.format("%.01f",bmi);
        if (bmi < 18.5) {
            System.out.println("less than 18.5");
            bmiResult = "Are Underweight.";
        }
        else if ((bmi) >= 18.5 && (bmi) <= 24.9) {
            System.out.println("between 18.5 and 24.9");
            bmiResult = "Have Normal weight.";
        }
        else if (bmi >= 25 && bmi <= 29.9) {
            System.out.println("between 25 and 29.9");
            bmiResult = "Are Overweight.";
        }
        else {
            System.out.println("greater than 30");
            bmiResult = "Are Obese.";
        }

        resulttext.setText("Hello! "+n+", Your BMI is: "+bmi1+"\n"+"And You "+ bmiResult);


    }
}







