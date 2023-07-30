package com.example.adaptithackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PreviousRidesActivity extends AppCompatActivity {

    LinearLayout prLayout1;
    LinearLayout prLayout2;
    LinearLayout prLayout3;
    LinearLayout prLayout0;



    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_previous_rides);
        fill();
    }

    public void fill(){
        prLayout1 = findViewById(R.id.pr1);
        prLayout2 = findViewById(R.id.pr2);
        prLayout3 = findViewById(R.id.pr3);
        prLayout0 = findViewById(R.id.pr0);
        for(int i = 0; i < 100;++i){
            TextView no = new TextView(this);
            TextView name1 = new TextView(this);
            TextView name2 = new TextView(this);
            TextView name3 = new TextView(this);
            TextView start1 = new TextView(this);
            TextView start2 = new TextView(this);
            TextView start3 = new TextView(this);
            TextView end1 = new TextView(this);
            TextView end2 = new TextView(this);
            TextView end3 = new TextView(this);
            String nom = String.valueOf(i+1);
            no.setText(nom);
            name1.setText("John Smith");
            name2.setText("Rick");
            name3.setText("Jonathan");
            start1.setText("Braam");
            start2.setText("Parktown");
            start3.setText("Hillbrow");
            end2.setText("Braam");
            end3.setText("Parktown");
            end1.setText("Hillbrow");
            prLayout1.addView(name1);
            prLayout1.addView(name2);
            prLayout1.addView(name3);
            prLayout2.addView(start1);
            prLayout2.addView(start2);
            prLayout2.addView(start3);
            prLayout3.addView(end1);
            prLayout3.addView(end2);
            prLayout3.addView(end3);
            prLayout0.addView(no);
        }
    }
}