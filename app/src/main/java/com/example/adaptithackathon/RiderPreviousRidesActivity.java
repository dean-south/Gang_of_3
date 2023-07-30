package com.example.adaptithackathon;

import android.os.Bundle;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import android.view.Gravity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.lang.reflect.Parameter;

public class RiderPreviousRidesActivity extends AppCompatActivity {

    private TextView numberTextView;
    private int currentNumber = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rider_previous_rides);
        LinearLayout mainLayout = new LinearLayout(this);
        mainLayout.setLayoutParams(new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        ));
        mainLayout.setOrientation(LinearLayout.HORIZONTAL);
        mainLayout.setGravity(Gravity.CENTER);

        TextView driver = new TextView(this);
        TextView rating = new TextView(this);
        TextView comment = new TextView(this);

        driver.setText("Baby");
        rating.setText("3.141");
        comment.setText("Had a nice butt but didn't smile");

        mainLayout.addView(driver);
        mainLayout.addView(rating);
        mainLayout.addView(comment);

        TextView t = mainLayout.findViewById(0);

        setContentView(mainLayout);

        // Set OnClickListener on the LinearLayout to show the popup
        mainLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopup();
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
