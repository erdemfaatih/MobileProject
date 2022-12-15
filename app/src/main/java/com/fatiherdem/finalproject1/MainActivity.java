package com.fatiherdem.finalproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonRestaurant,buttonCafe,buttonBar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonRestaurant = findViewById(R.id.buttonRestaurant);
        buttonCafe = findViewById(R.id.buttonCafe);
        buttonBar = findViewById(R.id.buttonBar);
        buttonRestaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurant=new Intent(MainActivity.this, Restautant.class);
                startActivity(restaurant);
            }
        });
        buttonCafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent cafe=new Intent(MainActivity.this, Cafe.class);
                startActivity(cafe);
            }
        });
        buttonBar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent bar=new Intent(MainActivity.this, Bar.class);
                startActivity(bar);
            }
        });
    }
}