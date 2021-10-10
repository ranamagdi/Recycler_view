package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class details_activity extends AppCompatActivity {
String detail;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);

            String incomingdetails = getIntent().getStringExtra("Details");



            TextView TextDetails = findViewById(R.id.DName);
            TextView Details_Text=findViewById(R.id.Details);
           detail= Details_Text.getText().toString().trim();


            TextDetails.setText(incomingdetails);


        }
    }

