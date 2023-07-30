package com.example.adaptithackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DriverReviewActivity extends AppCompatActivity {

    LinearLayout rl1;
    LinearLayout rl2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reviews);
        fill();
    }

    public void fill(){
        rl1 = findViewById(R.id.rl1);
        rl2 = findViewById(R.id.rl2);
        for(int i = 0; i < 100;++i) {
            TextView comment = new TextView(this);
            TextView Rating = new TextView(this);
            comment.setText("Nice ride.");
            Rating.setText("3");
            rl1.addView(comment);
            rl2.addView(Rating);
        }
    }
}