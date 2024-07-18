package com.example.bmicalculator;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtWeight,edtHeightFt,edtHeightIn;
        Button btnCalculate;
        TextView txtResult;
        LinearLayout llmain;

        edtWeight = findViewById(R.id.edtWeight);
        edtHeightFt =  findViewById(R.id.edtHeightFt);
        edtHeightIn = findViewById(R.id.edtHeightIn);
        btnCalculate = findViewById(R.id.btnCalculate);
        txtResult = findViewById(R.id.txtResult);
        llmain = findViewById(R.id.llmain);

        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int wt = Integer.parseInt(edtWeight.getText().toString());
                int ft = Integer.parseInt(edtHeightFt.getText().toString());
                int in = Integer.parseInt(edtHeightIn.getText().toString());

                int totalIn = ft*12 +in;

                double totalCm = totalIn * 2.53;

                double totalM = totalCm/100;

                double bmi= wt/(totalM*totalM);

                if (bmi > 25){
                    txtResult.setText("You're OverWeight");
                    llmain.setBackgroundColor(getResources().getColor(R.color.colorOW));

                }else if (bmi<18){
                    txtResult.setText("You're UnderWeight");
                    llmain.setBackgroundColor(getResources().getColor(R.color.colorUW));
                }else {
                    txtResult.setText("You're Healthy");
                    llmain.setBackgroundColor(getResources().getColor(R.color.colorHealthy));
                }

                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        llmain.setBackgroundColor(getResources().getColor(R.color.white));
                    }
                }, 5000); // 5000 milliseconds = 5 seconds
            }
        });
    }
}