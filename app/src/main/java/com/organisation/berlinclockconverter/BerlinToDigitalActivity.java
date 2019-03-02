package com.organisation.berlinclockconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BerlinToDigitalActivity extends AppCompatActivity {

    Button buttonSeconds;
    Button buttonHoursFiveOne;
    Button buttonHoursFiveTwo;
    Button buttonHoursFiveThree;
    Button buttonHoursFiveFour;
    Button buttonHoursOneOne;
    Button buttonHoursOneTwo;
    Button buttonHoursOneThree;
    Button buttonHoursOneFour;
    Button buttonMinutesFiveOne;
    Button buttonMinutesFiveTwo;
    Button buttonMinutesFiveThree;
    Button buttonMinutesFiveFour;
    Button buttonMinutesFiveFive;
    Button buttonMinutesFiveSix;
    Button buttonMinutesFiveSeven;
    Button buttonMinutesFiveEight;
    Button buttonMinutesFiveNine;
    Button buttonMinutesFiveTen;
    Button buttonMinutesFiveEleven;
    Button buttonMinutesOneOne;
    Button buttonMinutesOneTwo;
    Button buttonMinutesOneThree;
    Button buttonMinutesOneFour;
    TextView textDigitalTime;
    int buttonSecondsClickCounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berlin_to_digital);
        buttonSeconds = findViewById(R.id.buttonSeconds);
        buttonSeconds.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if( buttonSecondsClickCounter == 0 )
                {
                    buttonSecondsClickCounter++;
                    v.setSelected(true);
                }
                else
                {
                    if( v.isSelected() )
                        v.setSelected(false);
                    else
                        v.setSelected(true);
                }

            }
        });
        buttonHoursFiveOne = findViewById(R.id.buttonHoursFiveOne);
        buttonHoursFiveTwo = findViewById(R.id.buttonHoursFiveTwo);
        buttonHoursFiveThree = findViewById(R.id.buttonHoursFiveThree);
        buttonHoursFiveFour = findViewById(R.id.buttonHoursFiveFour);
        buttonHoursOneOne = findViewById(R.id.buttonHoursOneOne);
        buttonHoursOneTwo = findViewById(R.id.buttonHoursOneTwo);
        buttonHoursOneThree = findViewById(R.id.buttonHoursOneThree);
        buttonHoursOneFour = findViewById(R.id.buttonHoursOneFour);
        buttonMinutesFiveOne = findViewById(R.id.buttonMinutesFiveOne);
        buttonMinutesFiveTwo = findViewById(R.id.buttonMinutesFiveTwo);
        buttonMinutesFiveThree = findViewById(R.id.buttonMinutesFiveThree);
        buttonMinutesFiveFour = findViewById(R.id.buttonMinutesFiveFour);
        buttonMinutesFiveFive = findViewById(R.id.buttonMinutesFiveFive);
        buttonMinutesFiveSix = findViewById(R.id.buttonMinutesFiveSix);
        buttonMinutesFiveSeven = findViewById(R.id.buttonMinutesFiveSeven);
        buttonMinutesFiveEight = findViewById(R.id.buttonMinutesFiveEight);
        buttonMinutesFiveNine = findViewById(R.id.buttonMinutesFiveNine);
        buttonMinutesFiveTen = findViewById(R.id.buttonMinutesFiveTen);
        buttonMinutesFiveEleven = findViewById(R.id.buttonMinutesFiveEleven);
        buttonMinutesOneOne = findViewById(R.id.buttonMinutesOneOne);
        buttonMinutesOneTwo = findViewById(R.id.buttonMinutesOneTwo);
        buttonMinutesOneThree = findViewById(R.id.buttonMinutesOneThree);
        buttonMinutesOneFour = findViewById(R.id.buttonMinutesOneFour);


    }
}
