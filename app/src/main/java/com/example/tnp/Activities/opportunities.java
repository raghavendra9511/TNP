package com.example.tnp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.tnp.R;

public class opportunities extends AppCompatActivity {

    private View Capgemini;
  //  private Object infosys;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_opportunities);

        Capgemini = findViewById(R.id.buttonCapgemini);

        Capgemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(opportunities.this, capgemini.class);
                startActivity(intent);
            }
        });
        View tcs = findViewById(R.id.buttontcs);

        tcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(opportunities.this,tcsinfo.class);
                startActivity(intent);
            }
        });
        View virtusa = findViewById(R.id.buttonvirtusa);

        virtusa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(opportunities.this,virtusainfo.class) ;
                startActivity(intent);
            }
        });
        View infosys = findViewById(R.id.Buttoninfosys);

        infosys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(opportunities.this,infosyss.class) ;
                startActivity(intent);
            }
        });
        View mahindra = findViewById(R.id.buttonmahindra);

        mahindra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(opportunities.this,mahi.class) ;
                startActivity(intent);
            }
        });
        View infos = findViewById(R.id.Buttoninfos);

        infos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(opportunities.this,infostretch.class);
                startActivity(intent);
            }
        });
        View cognizant = findViewById(R.id.buttoncognizant);

        cognizant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(opportunities.this,cogniz.class);
                startActivity(intent);
            }
        });
        View lti = findViewById(R.id.buttonlti);

        lti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(opportunities.this,ltiinfo.class);
                startActivity(intent);
            }
        });
    }
}