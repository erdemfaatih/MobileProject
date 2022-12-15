package com.fatiherdem.finalproject1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

public class Restautant extends AppCompatActivity {
    private Button menuButton,reservationButton,locationButton;
     ImageButton imageButton2;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restautant);
        imageButton2=findViewById(R.id.imageButton2);
        menuButton = findViewById(R.id.menuButton);
        reservationButton = findViewById(R.id.reservationButton);
        locationButton = findViewById(R.id.locationButton);

        reservationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent reservation = new Intent(Restautant.this,Reservation.class);
                startActivity(reservation);
            }
        });
        menuButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(Restautant.this,Menu.class);
                startActivity(menu);
            }
        });
        locationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(Restautant.this,Location.class);
                startActivity(menu);
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent menu = new Intent(Restautant.this,MainActivity.class);
                startActivity(menu);
            }
        });
    }

}