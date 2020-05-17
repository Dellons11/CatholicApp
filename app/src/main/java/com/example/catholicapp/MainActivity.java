package com.example.catholicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText age;
    private Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        submit = findViewById(R.id.submitAge);
        age = findViewById(R.id.ageEditText);


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String ageText = age.getText().toString();

                if (ageText.isEmpty()){
                    Toast.makeText(getApplicationContext(),"Empty age is not allowed",Toast.LENGTH_LONG).show();
                }else {

                    Intent intent = new Intent(MainActivity.this,DetailActivity.class);
                    intent.putExtra("age",ageText);
                    startActivity(intent);
                }
            }
        });
    }
}