package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class bevactivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bevactivity);
        CardView c1=findViewById(R.id.id7);
        CardView c2=findViewById(R.id.id8);
        CardView c3=findViewById(R.id.id9);
        Intent bev = getIntent();

        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "coke ordered", Toast.LENGTH_SHORT).show();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "thumpsup ordered", Toast.LENGTH_SHORT).show();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "sprite ordered", Toast.LENGTH_SHORT).show();
            }
        });

    }
}