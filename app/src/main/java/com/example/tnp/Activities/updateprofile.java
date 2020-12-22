package com.example.tnp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.tnp.R;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class updateprofile extends AppCompatActivity {
    EditText Fullname,per10th,per12th,perer;
    Button Savechanges;
    DatabaseReference reff;
    Member member;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_updateprofile);

        Fullname=(EditText)findViewById(R.id.Fullname);
        per10th=(EditText)findViewById(R.id.per10th);
        per12th=(EditText)findViewById(R.id.per12th);
        perer=(EditText)findViewById(R.id.perer);
        Savechanges=(Button)findViewById(R.id.Savechanges);
        member=new Member();
        reff= FirebaseDatabase.getInstance().getReference().child("Member");
        Savechanges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                float per10=Float.parseFloat(per10th.getText().toString().trim());
                float per12=Float.parseFloat(per12th.getText().toString().trim());
                float perER=Float.parseFloat(perer.getText().toString().trim());

                member.setName(Fullname.getText().toString().trim());
                member.setPer10(per10);
                member.setPer12(per12);
                member.setPerER(perER);
                reff.child("member1").setValue(member);
                Toast.makeText(updateprofile.this,"data inserted sucessfully",Toast.LENGTH_SHORT).show();


            }
        });
    }
}