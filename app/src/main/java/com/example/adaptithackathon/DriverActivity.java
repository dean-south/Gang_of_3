package com.example.adaptithackathon;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class DriverActivity extends AppCompatActivity {
    private Button previousRidesButton;
    private Button reviewsButton;

    private Button signOutButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drive);
        setListeners();

        signOutButton = findViewById(R.id.buttonSignOut);

        signOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(DriverActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

    }

    public void setListeners(){
        previousRidesButton = findViewById(R.id.buttonPreviousRides);
        reviewsButton = findViewById(R.id.buttonReviews);
        previousRidesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event for the "Previous Rides" button
                showToast("Previous Rides button clicked");
                openPreviousRides();
            }
        });

        reviewsButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the click event for the "Reviews" button
                showToast("Reviews button clicked");
                openReviews();
            }
        });
    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

    public void openPreviousRides(){
        Intent intent = new Intent(getApplicationContext(), DriverPreviousRidesActivity.class);
        startActivity(intent);
    }

    public void openReviews(){
        Intent intent = new Intent(getApplicationContext(), DriverReviewActivity.class);
        startActivity(intent);
    }

}