package com.logan.validation;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

import static com.logan.validation.constants.Constants.EMAIL;
import static com.logan.validation.constants.Constants.FIRST_NAME;
import static com.logan.validation.constants.Constants.LAST_NAME;
import static com.logan.validation.constants.Constants.PASSWORD;

public class CompleteActivity extends Activity {

    String firstName;
    String lastName;
    String password;
    String email;

    TextView firstNameView;
    TextView lastNameView;
    TextView emailView;
    TextView passwordView;


    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete);

        Intent intent = getIntent();
        firstName = intent.getStringExtra(FIRST_NAME);
        lastName = intent.getStringExtra(LAST_NAME);
        email = intent.getStringExtra(EMAIL);
        password = intent.getStringExtra(PASSWORD);

        firstNameView.setText(firstName);
        lastNameView.setText(lastName);
        emailView.setText(email);
        passwordView.setText(password);
    }
}
