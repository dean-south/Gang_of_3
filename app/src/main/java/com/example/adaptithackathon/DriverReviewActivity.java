package com.example.adaptithackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class DriverReviewActivity extends AppCompatActivity {

    LinearLayout rl1;
    LinearLayout rl2;

    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_driver_reviews);
        fill();

        backButton = findViewById(R.id.buttonBack);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DriverReviewActivity.this, DriverActivity.class);
                startActivity(intent);
            }
        });

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