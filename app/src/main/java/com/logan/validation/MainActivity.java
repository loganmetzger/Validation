package com.logan.validation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button toNameButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toNameButton = findViewById(R.id.button_to_name);

        toNameButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                navigateToNameActivity();
            }
        });
    }

    private void navigateToNameActivity() {
        Intent intent = new Intent(this, NameActivity.class);
        startActivity(intent);
    }
}