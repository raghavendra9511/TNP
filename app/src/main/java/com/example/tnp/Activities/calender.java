
package com.example.tnp.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import com.example.tnp.R;

import java.util.ArrayList;
import java.util.GregorianCalendar;

public class calender extends AppCompatActivity {



    public GregorianCalendar cal_month, cal_month_copy;
    private HwAdapter hwAdapter;
    private TextView tv_month;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);




            HomeCollection.date_collection_arr=new ArrayList<HomeCollection>();
            HomeCollection.date_collection_arr.add( new HomeCollection("2020-11-03" ,"Capgemini","Placement","Venue Dypiemr"));
            HomeCollection.date_collection_arr.add( new HomeCollection("2020-11-08" ,"Virtusa","Round1 appti","Venue SHANTAI pharma bulding"));
            HomeCollection.date_collection_arr.add( new HomeCollection("2020-11-12" ,"Royals","Placement","Venue Dypiemr"));
            HomeCollection.date_collection_arr.add( new HomeCollection("2020-11-15" ,"Tata Motors","final HR","Venue Dypiemr"));
            HomeCollection.date_collection_arr.add( new HomeCollection("2020-11-18" ,"TechEasy","Placement","Venue Dnyanprasad"));
            HomeCollection.date_collection_arr.add( new HomeCollection("2020-12-01" ,"ShreyasITsol","Placement","Venue Dypiemr"));
            HomeCollection.date_collection_arr.add( new HomeCollection("2020-12-03" ,"TechMahindra","Placement","Venue SHANTAI pharma bulding"));
            HomeCollection.date_collection_arr.add( new HomeCollection("2020-12-05" ,"Infosys","Placement","Venue MCA building"));
            HomeCollection.date_collection_arr.add( new HomeCollection("2020-12-07" ,"TCS","Placement","Venue SHANTAI pharma bulding"));
            HomeCollection.date_collection_arr.add( new HomeCollection("2020-12-11" ,"Microsoft","Placement","Venue SHANTAI pharma bulding"));



            cal_month = (GregorianCalendar) GregorianCalendar.getInstance();
            cal_month_copy = (GregorianCalendar) cal_month.clone();
            hwAdapter = new HwAdapter(this, cal_month,HomeCollection.date_collection_arr);

            tv_month = (TextView) findViewById(R.id.tv_month);
            tv_month.setText(android.text.format.DateFormat.format("MMMM yyyy", cal_month));


            ImageButton previous = (ImageButton) findViewById(R.id.ib_prev);
            previous.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cal_month.get(GregorianCalendar.MONTH) == 4&&cal_month.get(GregorianCalendar.YEAR)==2017) {
                        //cal_month.set((cal_month.get(GregorianCalendar.YEAR) - 1), cal_month.getActualMaximum(GregorianCalendar.MONTH), 1);
                        Toast.makeText(calender.this, "Event Detail is available for current session only.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        setPreviousMonth();
                        refreshCalendar();
                    }


                }
            });
            ImageButton next = (ImageButton) findViewById(R.id.Ib_next);
            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (cal_month.get(GregorianCalendar.MONTH) == 5&&cal_month.get(GregorianCalendar.YEAR)==2018) {
                        //cal_month.set((cal_month.get(GregorianCalendar.YEAR) + 1), cal_month.getActualMinimum(GregorianCalendar.MONTH), 1);
                        Toast.makeText(calender.this, "Event Detail is available for current session only.", Toast.LENGTH_SHORT).show();
                    }
                    else {
                        setNextMonth();
                        refreshCalendar();
                    }
                }
            });
            GridView gridview = (GridView) findViewById(R.id.gv_calendar);
            gridview.setAdapter(hwAdapter);
            gridview.setOnItemClickListener(new AdapterView.OnItemClickListener() {

                public void onItemClick(AdapterView<?> parent, View v, int position, long id) {
                    String selectedGridDate = HwAdapter.day_string.get(position);
                    ((HwAdapter) parent.getAdapter()).getPositionList(selectedGridDate, calender.this);
                }

            });
        }
        protected void setNextMonth() {
            if (cal_month.get(GregorianCalendar.MONTH) == cal_month.getActualMaximum(GregorianCalendar.MONTH)) {
                cal_month.set((cal_month.get(GregorianCalendar.YEAR) + 1), cal_month.getActualMinimum(GregorianCalendar.MONTH), 1);
            } else {
                cal_month.set(GregorianCalendar.MONTH,
                        cal_month.get(GregorianCalendar.MONTH) + 1);
            }
        }

        protected void setPreviousMonth() {
            if (cal_month.get(GregorianCalendar.MONTH) == cal_month.getActualMinimum(GregorianCalendar.MONTH)) {
                cal_month.set((cal_month.get(GregorianCalendar.YEAR) - 1), cal_month.getActualMaximum(GregorianCalendar.MONTH), 1);
            } else {
                cal_month.set(GregorianCalendar.MONTH, cal_month.get(GregorianCalendar.MONTH) - 1);
            }
        }

        public void refreshCalendar() {
            hwAdapter.refreshDays();
            hwAdapter.notifyDataSetChanged();
            tv_month.setText(android.text.format.DateFormat.format("MMMM yyyy", cal_month));
        }
    }
