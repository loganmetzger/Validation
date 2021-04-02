package com.logan.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import static com.logan.validation.constants.Constants.EMAIL;
import static com.logan.validation.constants.Constants.FIRST_NAME;
import static com.logan.validation.constants.Constants.LAST_NAME;

public class EmailActivity extends AppCompatActivity {

    Button toPasswordButton;
    EditText emailView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_email);

        toPasswordButton = findViewById(R.id.button_to_password);
        emailView = findViewById(R.id.et_email);

        toPasswordButton.setOnClickListener(v -> {
            Intent passwordIntent = new Intent(this, CompleteActivity.class);
//            passwordIntent.putExtras(getIntent().getExtras());
            Bundle bundle = getIntent().getExtras();
            String firstName = bundle.getString(FIRST_NAME);
            String lastName = bundle.getString(LAST_NAME);
            passwordIntent.putExtra(EMAIL, emailView.getText().toString());
            passwordIntent.putExtra(FIRST_NAME, firstName);
            passwordIntent.putExtra(LAST_NAME, lastName);
            startActivity(passwordIntent);
        });
    }
}