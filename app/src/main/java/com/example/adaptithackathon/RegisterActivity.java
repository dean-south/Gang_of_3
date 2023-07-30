package com.example.adaptithackathon;

import android.content.Intent;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class RegisterActivity extends AppCompatActivity {

    private EditText editTextEmail;
    private EditText editTextPassword;
    // Add other EditText fields for Name, Surname, and Cell Phone Number if needed
    private Button buttonRegister;

    private String selectedRole;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);
        // Initialize other EditText fields here

        buttonRegister = findViewById(R.id.buttonRegister);
        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Implement your registration logic here
                String email = editTextEmail.getText().toString();
                String password = editTextPassword.getText().toString();
                // Get other fields' values as needed

                // Display a toast message to indicate successful registration
                String message = "Registered successfully!\nEmail: " + email + "\nPassword: " + password;
                Toast.makeText(RegisterActivity.this, message, Toast.LENGTH_LONG).show();

                // Here, you can save the registration data to a database or perform other operations as needed

                Intent intent = new Intent(RegisterActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        Spinner spinner = findViewById(R.id.spinnerRole);

        // Define the array of options
        String[] roles = {"Rider", "Driver"};

        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this,
                android.R.layout.simple_spinner_item, roles);

        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);
    }
}
