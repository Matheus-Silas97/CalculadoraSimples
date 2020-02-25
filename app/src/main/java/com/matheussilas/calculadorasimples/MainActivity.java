package com.matheussilas.calculadorasimples;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView txtNum1, txtNum2, txtResult;

    int num1, num2, result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtNum1 = findViewById(R.id.txtNum1);
        txtNum2 = findViewById(R.id.txtNum2);
        txtResult = findViewById(R.id.txtResult);

    }

    public void Percentage(View view) {

        num1 = Integer.valueOf(txtNum1.getText().toString());
        num2 = Integer.valueOf(txtNum2.getText().toString());

        result = num1 * num2 / 100;
        txtResult.setText(String.valueOf(result));
    }

    public void Multiplication(View view) {

        num1 = Integer.valueOf(txtNum1.getText().toString());
        num2 = Integer.valueOf(txtNum2.getText().toString());

        result = num1 * num2;
        txtResult.setText(String.valueOf(result));
    }

    public void Division(View view) {

        num1 = Integer.valueOf(txtNum1.getText().toString());
        num2 = Integer.valueOf(txtNum2.getText().toString());

        result = num1 / num2;
        txtResult.setText(String.valueOf(result));
    }

    public void Plus(View view) {

        num1 = Integer.valueOf(txtNum1.getText().toString());
        num2 = Integer.valueOf(txtNum2.getText().toString());

        result = num1 + num2;
        txtResult.setText(String.valueOf(result));
    }

    public void Minus(View view) {

        num1 = Integer.valueOf(txtNum1.getText().toString());
        num2 = Integer.valueOf(txtNum2.getText().toString());

        result = num1 - num2;
        txtResult.setText(String.valueOf(result));
    }

    public void Clean(View view) {

        txtResult.setText("");
        txtNum1.setText("");
        txtNum2.setText("");

    }
}