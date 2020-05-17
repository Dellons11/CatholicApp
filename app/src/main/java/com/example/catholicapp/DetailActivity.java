package com.example.catholicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {
    private Bundle bundle;
    private TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        result = findViewById(R.id.resultText);

        bundle = getIntent().getExtras();
        if (bundle != null){
            String message;
            int age = Integer.parseInt(bundle.getString("age"));
            if (age < 17 ){
                message ="You are in YCS";
            }else if (age >=18 && age <=30){
                message = "You are in CYON";

            }else {
                message = "You are in CWO or CMO";
            }
            result.setText(message);


        }


    }
}
