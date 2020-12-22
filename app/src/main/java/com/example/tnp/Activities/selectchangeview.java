package com.example.tnp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tnp.R;

public class selectchangeview extends AppCompatActivity {

    Button profile1;
    Button viewprofile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_selectchangeview);

        profile1 = findViewById(R.id.buttonUP);

        profile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(selectchangeview.this, updateprofile.class));
            }
        });

        viewprofile = findViewById(R.id.buttonVP);

        viewprofile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(selectchangeview.this, viewprofile.class));
            }
        });
    }
}