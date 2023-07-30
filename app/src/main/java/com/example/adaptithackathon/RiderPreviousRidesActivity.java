package com.example.adaptithackathon;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import java.lang.reflect.Parameter;
import java.util.Vector;

public class RiderPreviousRidesActivity extends AppCompatActivity {

    private Button backButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_previous_rides);

        backButton.findViewById(R.id.buttonBack);

        backButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(RiderPreviousRidesActivity.this, RiderActivity.class);
                startActivity(intent);
            }
        });

    }

    private void showPopup() {
        // Create the popup content layout (LinearLayout)
        LinearLayout popupLayout = new LinearLayout(this);
        popupLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        popupLayout.setOrientation(LinearLayout.VERTICAL);
        popupLayout.setPadding(16, 16, 16, 16);

        // Create the TextView for the popup
        TextView popupTextView = new TextView(this);
        popupTextView.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        popupTextView.setText("This is a popup");
        popupLayout.addView(popupTextView);

        // Create the Button for the popup
        Button popupButton = new Button(this);
        popupButton.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.WRAP_CONTENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        popupButton.setText("Dismiss");
        popupButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Dismiss the popup when the button is clicked
                dismissPopup();
            }
        });
        popupLayout.addView(popupButton);

        // Create the AlertDialog to display the popup
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setView(popupLayout);

        // Create and show the AlertDialog
        AlertDialog alertDialog = builder.create();
        alertDialog.show();
    }

    private void dismissPopup() {
        // The popup is automatically dismissed when the "Dismiss" button is clicked
    }

}
