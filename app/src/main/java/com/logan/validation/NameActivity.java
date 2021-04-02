package com.logan.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

import static com.logan.validation.constants.Constants.FIRST_NAME;
import static com.logan.validation.constants.Constants.LAST_NAME;

public class NameActivity extends AppCompatActivity {

    Button toEmailButton;
    EditText firstNameView;
    EditText lastNameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_name);

        toEmailButton = findViewById(R.id.button_to_email);
        firstNameView = findViewById(R.id.et_first_name);
        lastNameView = findViewById(R.id.et_last_name);

        toEmailButton.setOnClickListener(v -> navigateEmailActivity());
    }

    private void navigateEmailActivity() {
        String firstName = firstNameView.getText().toString();
        String lastName = lastNameView.getText().toString();
        Intent intent = new Intent(getApplicationContext(), EmailActivity.class);
        intent.putExtra(FIRST_NAME, firstName);
        intent.putExtra(LAST_NAME, lastName);
        startActivity(intent);
    }
}