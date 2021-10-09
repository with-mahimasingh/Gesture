package com.example.gesture;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

import com.example.gesture.R;

public class MainActivity extends AppCompatActivity {

    CardView textToSign;
    CardView signToText;
    CardView learnSigns;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textToSign = findViewById(R.id.texttosign);
        signToText = findViewById(R.id.signtotext);
        learnSigns = findViewById(R.id.learnsigns);

        textToSign.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity(new Intent(MainActivity.this, TextToSign.class));
            }
        });
        signToText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, SignToText.class));
            }
        });
        learnSigns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, LearnSigns.class));

            }
        });


    }
}