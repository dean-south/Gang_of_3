package com.example.adaptithackathon;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    private EditText editTextUsername;
    private EditText editTextPassword;
    private Button buttonLogin;
    private Button buttonRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextUsername = findViewById(R.id.editTextUsername);
        editTextPassword = findViewById(R.id.editTextPassword);
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);

        //For Testing purposes get rid of for release
        String userType = "rider";

        buttonLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String username = editTextUsername.getText().toString();
                String password = editTextPassword.getText().toString();

                // Sample login logic (Replace this with your actual login logic)
                if (username.equals("rider") || username.equals("driver")  && password.equals("password")) {
                    showToast("Login successful!");

                    if (username.equals("rider")){
                        Intent intent = new Intent(MainActivity.this, RiderActivity.class);
                        startActivity(intent);
                    }
                    else if (username.equals("driver")){
                        Intent intent = new Intent(MainActivity.this, DriverActivity.class);
                        startActivity(intent);
                    }



                } else {
                    showToast("Login failed. Invalid credentials.");
                }
            }
        });

        buttonRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Navigate to the RegisterActivity when "Register" is clicked
                Intent intent = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(intent);
            }
        });

    }

    private void showToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
