package com.example.tnp.Activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tnp.R;
import com.google.firebase.auth.FirebaseAuth;

public class Home_activity extends AppCompatActivity {


private FirebaseAuth mAuth;
    Button profile1;
    Button events;
    Button placement;
    Button recruters;
    Button tpo;
    Button Logout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_activity);
        mAuth = FirebaseAuth.getInstance();

        profile1 = findViewById(R.id.buttonprofile);

        profile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, selectchangeview.class));
            }
        });

        events = findViewById(R.id.buttonevents);

        events.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this,calender.class));
            }
        });

        placement = findViewById(R.id.buttonPlacements);

        placement.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {
                startActivity(new Intent(Home_activity.this,tab.class));
            }
        });

        recruters = findViewById(R.id.buttonOurRecruiters);

        recruters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this,recruters.class));
            }
        });

        tpo = findViewById(R.id.buttonStaff);

        tpo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(Home_activity.this, top.class));
            }
        });


        Logout = findViewById(R.id.buttonlogout);

        Logout.setOnClickListener(new View.OnClickListener() {
                                      @Override
                                      public void onClick(View view) {
                                          Logout();

                                      }
                                  }
        );
    };

private void Logout(){
        mAuth.signOut();
        finish();
        startActivity(new Intent(Home_activity.this, Register_activity.class));
        }


}