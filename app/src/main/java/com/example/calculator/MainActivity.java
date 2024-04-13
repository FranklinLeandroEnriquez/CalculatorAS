package com.example.calculator;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    EditText aVal, bVal;
    Double a,b;
    TextView result;
    Button add, sub, div, mul;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        aVal = findViewById(R.id.num1);
        bVal = findViewById(R.id.num2);
        result = findViewById(R.id.ans);
        add = findViewById(R.id.addBtn);
        sub = findViewById(R.id.subBtn);
        mul = findViewById(R.id.mulBtn);
        div = findViewById(R.id.DivBtn);

        add.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (aVal.getText().toString().isEmpty() || bVal.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(aVal.getText().toString());
                    b = Double.parseDouble(bVal.getText().toString());
                    result.setText(" = "+ (a + b));
                }

            }
        });

        sub.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (aVal.getText().toString().isEmpty() || bVal.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(aVal.getText().toString());
                    b = Double.parseDouble(bVal.getText().toString());
                    result.setText(" = "+ (a - b));
                }

            }
        });

        mul.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(aVal.getText().toString().isEmpty() || bVal.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(aVal.getText().toString());
                    b = Double.parseDouble(bVal.getText().toString());
                    result.setText(" = "+ (a * b));
                }

            }
        });

        div.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if(aVal.getText().toString().isEmpty() || bVal.getText().toString().isEmpty()){
                    Toast.makeText(MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                }
                else {
                    a = Double.parseDouble(aVal.getText().toString());
                    b = Double.parseDouble(bVal.getText().toString());
                    result.setText(" = " + (a / b) + " (approx)");
                }

            }
        });
    }
}