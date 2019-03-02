package com.organisation.berlinclockconverter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button buttonDigitalToBerlin = findViewById(R.id.buttonDigitalToBerlin);
        buttonDigitalToBerlin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, DigitalToBerlinActivity.class));
            }
        });

        Button buttonBerlinToDigital = findViewById(R.id.buttonBerlinToDigital);
        buttonBerlinToDigital.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, BerlinToDigitalActivity.class));
            }
        });
    }
}
