package com.example.restaurent;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button veg=findViewById(R.id.veg);
        Button nonveg=findViewById(R.id.nonveg);
        Button bev=findViewById(R.id.bev);

        veg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "veg option choosed", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),vegactivity.class);
                startActivity(intent);

            }
        });

        nonveg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "non veg option choosed", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),nonvegactivity.class);
                startActivity(intent);

            }
        });

        bev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(MainActivity.this, "bev option choosed", Toast.LENGTH_SHORT).show();
                Intent intent=new Intent(getApplicationContext(),bevactivity.class);
                startActivity(intent);

            }
        });


    }
}