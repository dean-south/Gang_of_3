package com.example.adaptithackathon;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.content.Intent;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.google.zxing.integration.android.IntentIntegrator;
import com.google.zxing.integration.android.IntentResult;

public class RiderActivity extends AppCompatActivity {
    private Button scanButton;
    private Button signOutButton;

    private Button previousRidesButton;

    private Button getNewTicketButton;

    private TextView ticketAmount;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider);

        // Initialize the scanButton
        scanButton = findViewById(R.id.scanButton);
        scanButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Start the QR code scanner when the button is clicked
                startQRCodeScanner();
            }
        });

        signOutButton = findViewById(R.id.buttonSignOut);

        signOutButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RiderActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        previousRidesButton = findViewById(R.id.buttonPreviousRides);

        previousRidesButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RiderActivity.this, RiderPreviousRidesActivity.class);
                startActivity(intent);
            }
        });

        getNewTicketButton = findViewById(R.id.buttonGetNewTicket);

        getNewTicketButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RiderActivity.this, RiderGetNewTicketActivity.class);
                startActivity(intent);
            }
        });

        ticketAmount = findViewById(R.id.textViewTicketAmount);

        //set the amount of tickets the rider has
        ticketAmount.setText("Ticket Amount: 0");

    }
    private void startQRCodeScanner() {
        IntentIntegrator integrator = new IntentIntegrator(this);
        integrator.setPrompt("Scan a QR code");
        integrator.setOrientationLocked(false);
        integrator.initiateScan();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        IntentResult result = IntentIntegrator.parseActivityResult(requestCode, resultCode, data);
        if (result != null) {
            if (result.getContents() != null) {
                // Handle the scanned QR code result here
                String qrCodeResult = result.getContents();
                // You can display the QR code result or use it as needed
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data);
        }
    }


}
