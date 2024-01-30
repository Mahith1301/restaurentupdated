package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

public class vegactivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegactivity);
        Intent veg = getIntent();

        CardView c1=findViewById(R.id.id1);
        CardView c2=findViewById(R.id.id2);
        CardView c3=findViewById(R.id.id3);

        Log.i("vegggggggggg", "onCreate: ");
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(vegactivity.this, "paneer butter masala ordered", Toast.LENGTH_SHORT).show();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(vegactivity.this, "dosa ordered", Toast.LENGTH_SHORT).show();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(vegactivity.this, "Veg Pulav ordered", Toast.LENGTH_SHORT).show();
            }
        });


    }
}