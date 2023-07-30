package com.example.adaptithackathon;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class RiderGetNewTicketActivity extends AppCompatActivity {

    private Button backButton;

    private TextView numberTextView;
    private int currentNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_get_new_ticket);

        backButton = findViewById(R.id.buttonBack);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RiderGetNewTicketActivity.this, RiderActivity.class);
                startActivity(intent);
            }
        });

        numberTextView = findViewById(R.id.numberTextView);
        updateNumberTextView();
    }

    public void onDecreaseClick(View view) {
        currentNumber--;

        if (currentNumber < 0){
            currentNumber = 0;
        }

        updateNumberTextView();
    }

    public void onIncreaseClick(View view) {
        currentNumber++;
        updateNumberTextView();
    }

    private void updateNumberTextView() {
        numberTextView.setText(String.valueOf(currentNumber));
    }
}
