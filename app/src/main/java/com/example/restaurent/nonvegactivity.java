package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class nonvegactivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nonvegactivity);

        CardView c1=findViewById(R.id.id4);
        CardView c2=findViewById(R.id.id5);
        CardView c3=findViewById(R.id.id6);

        Intent nonveg = getIntent();
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "chicken biryani ordered", Toast.LENGTH_SHORT).show();
            }
        });
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "mutton biryani ordered", Toast.LENGTH_SHORT).show();
            }
        });
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "prawns biryani ordered", Toast.LENGTH_SHORT).show();
            }
        });

    }
}