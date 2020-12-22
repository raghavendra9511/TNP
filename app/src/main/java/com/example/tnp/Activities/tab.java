package com.example.tnp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tnp.R;

public class tab extends AppCompatActivity {

    Button myop;
    Button myappl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);
        myop = findViewById(R.id.buttonopp);

        myop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               startActivity(new Intent(tab.this, opportunities.class));
            }
        });
        myappl = findViewById(R.id.myappl);

        myappl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(tab.this, myapplication.class));
            }
        });
    }
}