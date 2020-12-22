package com.example.tnp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.tnp.R;

public class recruters extends AppCompatActivity {

    Button Capgemini;
    Button tcs;
    Button virtusa;
    Button infosys;
    Button mahindra;
    Button infos;
    Button cognizant;
    Button lti;
    Button previous;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recruters);

        Capgemini = findViewById(R.id.buttonCapgemini);

        Capgemini.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.capgemini.com"));
                startActivity(browserIntent);
            }
        });
        tcs = findViewById(R.id.buttontcs);

        tcs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.tcs.com"));
                startActivity(browserIntent);
            }
        });
        virtusa = findViewById(R.id.buttonvirtusa);

        virtusa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.virtusa.com"));
                startActivity(browserIntent);
            }
        });

        infosys = findViewById(R.id.Buttoninfosys);

        infosys.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.infosys.com"));
                startActivity(browserIntent);
            }
        });
        mahindra = findViewById(R.id.buttonmahindra);

        mahindra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.techmahindra.com"));
                startActivity(browserIntent);
            }
        });
        infos = findViewById(R.id.Buttoninfos);

        infos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.infostretch.com"));
                startActivity(browserIntent);
            }
        });

        cognizant = findViewById(R.id.buttoncognizant);

        cognizant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.cognizant.com"));
                startActivity(browserIntent);
            }
        });

        lti = findViewById(R.id.buttonlti);

        lti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.lntinfotech.com"));
                startActivity(browserIntent);
            }
        });
        previous= findViewById(R.id.button2);

        previous.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dypiemr.ac.in/2015-05-29-08-44-38/placement-statistics"));
                startActivity(browserIntent);
            }
        });
    }
}