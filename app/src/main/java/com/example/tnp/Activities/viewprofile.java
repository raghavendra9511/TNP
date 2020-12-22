package com.example.tnp.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.tnp.R;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class viewprofile extends AppCompatActivity {

    TextView a,b,c,d;
    Button sh;
    DatabaseReference reff;
    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_viewprofile);

        setContentView(R.layout.activity_viewprofile);
        a=(TextView)findViewById(R.id.rfullname);
        b=(TextView)findViewById(R.id.rper10th);
        c=(TextView)findViewById(R.id.rper12th);
        d=(TextView)findViewById(R.id.rperer);
        sh=(Button)findViewById(R.id.show);

        sh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reff= FirebaseDatabase.getInstance().getReference().child("Member").child("member1");
                reff.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                        String name=dataSnapshot.child("name").getValue().toString();
                        String per10=dataSnapshot.child("per10").getValue().toString();
                        String per12=dataSnapshot.child("per12").getValue().toString();
                        String perER=dataSnapshot.child("perER").getValue().toString();
                        a.setText(name);
                        b.setText(per10);
                        c.setText(per12);
                        d.setText(perER);
                    }

                    @Override
                    public void onCancelled(@NonNull DatabaseError databaseError) {

                    }
                });
            }
        });
    }
}