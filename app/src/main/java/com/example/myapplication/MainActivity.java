package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private Button button;
    private EditText quantity;
    private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.button);
        quantity = findViewById(R.id.quantity);
        show = findViewById(R.id.show);
//        button.setOnClickListener(new View.OnClickListener() {
//            @SuppressLint("SetTextI18n")
//            @Override
//            public void onClick(View view) {
//                String s = quantity.getText().toString();
//                int a = Integer.parseInt(s);
//                double pound = a * 2.205;
//                show.setText("The corresponding value in pound is " + pound + " pounds");
//            }
//        });
        };

    @SuppressLint("SetTextI18n")
    public void calculate(View view){
        String s = quantity.getText().toString();
        int a = Integer.parseInt(s);
        double pound = a * 2.205;
        show.setText("The corresponding value in pound is " + pound + " pounds");
//        Toast.makeText(MainActivity.this,"hi there", Toast.LENGTH_SHORT).show();
    }

}
