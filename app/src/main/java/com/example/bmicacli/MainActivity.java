package com.example.bmicacli;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        EditText edtW, edthFt, edthIn;
        Button btnCalci;
        TextView txtR;

        edtW = findViewById(R.id.edtW);
        edthFt =  findViewById(R.id.edthFt);
        edthIn = findViewById(R.id.edthIn);
        btnCalci = findViewById(R.id.btnCalci);
        txtR = findViewById(R.id.txtR);


        btnCalci.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                int wt = Integer.parseInt(edtW.getText().toString());
                int ft = Integer.parseInt(edthFt.getText().toString());
                int in = Integer.parseInt(edthIn.getText().toString());

                int totalIn = ft * 12 + in;

                double totalCm = totalIn * 2.53;

                double totalM = totalCm / 100;

                double bmi = totalM / (totalM * totalM);

                if(bmi < 18){
                    txtR.setText("You are UnderWeight!!");
                }
                else if(bmi > 25){
                    txtR.setText("You are OverWeight!!");
                }
                else {
                   txtR.setText("You are Healthy!!");
                }

            }
        });

    }
}