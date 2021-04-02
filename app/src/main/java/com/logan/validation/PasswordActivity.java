package com.logan.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.logan.validation.constants.Constants.PASSWORD;

public class PasswordActivity extends AppCompatActivity {

    Button toCompleteButton;

    EditText passwordView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_password);

        toCompleteButton = findViewById(R.id.button_to_complete);
        passwordView = findViewById(R.id.et_password);

        toCompleteButton.setOnClickListener(v -> {
            Intent passwordIntent = new Intent(getApplicationContext(), CompleteActivity.class);
            String password = passwordView.getText().toString();
            passwordIntent.putExtras(getIntent().getExtras());
            passwordIntent.putExtra(PASSWORD, password);
            startActivity(passwordIntent);
        });
    }
}