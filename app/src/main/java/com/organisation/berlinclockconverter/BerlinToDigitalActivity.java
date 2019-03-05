package com.organisation.berlinclockconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import android.widget.TextView;

public class BerlinToDigitalActivity extends AppCompatActivity {

    ToggleButton buttonSeconds;
    ToggleButton buttonHoursFiveOne;
    ToggleButton buttonHoursFiveTwo;
    ToggleButton buttonHoursFiveThree;
    ToggleButton buttonHoursFiveFour;
    ToggleButton buttonHoursOneOne;
    ToggleButton buttonHoursOneTwo;
    ToggleButton buttonHoursOneThree;
    ToggleButton buttonHoursOneFour;
    ToggleButton buttonMinutesFiveOne;
    ToggleButton buttonMinutesFiveTwo;
    ToggleButton buttonMinutesFiveThree;
    ToggleButton buttonMinutesFiveFour;
    ToggleButton buttonMinutesFiveFive;
    ToggleButton buttonMinutesFiveSix;
    ToggleButton buttonMinutesFiveSeven;
    ToggleButton buttonMinutesFiveEight;
    ToggleButton buttonMinutesFiveNine;
    ToggleButton buttonMinutesFiveTen;
    ToggleButton buttonMinutesFiveEleven;
    ToggleButton buttonMinutesOneOne;
    ToggleButton buttonMinutesOneTwo;
    ToggleButton buttonMinutesOneThree;
    ToggleButton buttonMinutesOneFour;
    TextView textDigitalTimeHours;
    TextView textDigitalTimeMinutes;
    TextView textDigitalTimeSeconds;

    int hours;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_berlin_to_digital);
        getSupportActionBar().setTitle(R.string.title_berlin_to_digital_conversion);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        textDigitalTimeHours = findViewById(R.id.textDigitalTimeHours);
        textDigitalTimeMinutes = findViewById(R.id.textDigitalTimeMinutes);
        textDigitalTimeSeconds = findViewById(R.id.textDigitalTimeSeconds);
        buttonSeconds = findViewById(R.id.buttonSeconds);
        buttonSeconds.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    textDigitalTimeSeconds.setText("00");
                else
                    textDigitalTimeSeconds.setText("01");

            }
        });
        buttonSeconds.setChecked(true);
        buttonHoursFiveOne = findViewById(R.id.buttonHoursFiveOne);
        buttonHoursFiveOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    hours = hours + 5;
                else
                    hours = hours - 5;
                if (hours >= 24)
                    textDigitalTimeHours.setText("00");
                else
                    textDigitalTimeHours.setText(String.format("%02d", hours));
            }
        });
        buttonHoursFiveTwo = findViewById(R.id.buttonHoursFiveTwo);
        buttonHoursFiveTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    hours = hours + 5;
                else
                    hours = hours - 5;
                if (hours >= 24)
                    textDigitalTimeHours.setText("00");
                else
                    textDigitalTimeHours.setText(String.format("%02d", hours));
            }
        });
        buttonHoursFiveThree = findViewById(R.id.buttonHoursFiveThree);
        buttonHoursFiveThree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    hours = hours + 5;
                else
                    hours = hours - 5;
                if (hours >= 24)
                    textDigitalTimeHours.setText("00");
                else
                    textDigitalTimeHours.setText(String.format("%02d", hours));
            }
        });
        buttonHoursFiveFour = findViewById(R.id.buttonHoursFiveFour);
        buttonHoursFiveFour.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    hours = hours + 5;
                else
                    hours = hours - 5;
                if (hours >= 24)
                    textDigitalTimeHours.setText("00");
                else
                    textDigitalTimeHours.setText(String.format("%02d", hours));
            }
        });
        buttonHoursOneOne = findViewById(R.id.buttonHoursOneOne);
        buttonHoursOneOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    hours = hours + 1;
                else
                    hours = hours - 1;
                if (hours >= 24)
                    textDigitalTimeHours.setText("00");
                else
                    textDigitalTimeHours.setText(String.format("%02d", hours));
            }
        });
        buttonHoursOneTwo = findViewById(R.id.buttonHoursOneTwo);
        buttonHoursOneTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    hours = hours + 1;
                else
                    hours = hours - 1;
                if (hours >= 24)
                    textDigitalTimeHours.setText("00");
                else
                    textDigitalTimeHours.setText(String.format("%02d", hours));
            }
        });

        buttonHoursOneThree = findViewById(R.id.buttonHoursOneThree);
        buttonHoursOneThree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    hours = hours + 1;
                else
                    hours = hours - 1;
                if (hours >= 24)
                    textDigitalTimeHours.setText("00");
                else
                    textDigitalTimeHours.setText(String.format("%02d", hours));
            }
        });
        buttonHoursOneFour = findViewById(R.id.buttonHoursOneFour);
        buttonHoursOneFour.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked)
                    hours = hours + 1;
                else
                    hours = hours - 1;
                if (hours >= 24)
                    textDigitalTimeHours.setText("00");
                else
                    textDigitalTimeHours.setText(String.format("%02d", hours));
            }
        });
        buttonMinutesFiveOne = findViewById(R.id.buttonMinutesFiveOne);
        buttonMinutesFiveOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 5);
            }
        });
        buttonMinutesFiveTwo = findViewById(R.id.buttonMinutesFiveTwo);
        buttonMinutesFiveTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 5);
            }
        });
        buttonMinutesFiveThree = findViewById(R.id.buttonMinutesFiveThree);
        buttonMinutesFiveThree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 5);
            }
        });
        buttonMinutesFiveFour = findViewById(R.id.buttonMinutesFiveFour);
        buttonMinutesFiveFour.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 5);
            }
        });
        buttonMinutesFiveFive = findViewById(R.id.buttonMinutesFiveFive);
        buttonMinutesFiveFive.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 5);
            }
        });
        buttonMinutesFiveSix = findViewById(R.id.buttonMinutesFiveSix);
        buttonMinutesFiveSix.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 5);
            }
        });
        buttonMinutesFiveSeven = findViewById(R.id.buttonMinutesFiveSeven);
        buttonMinutesFiveSeven.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 5);
            }
        });
        buttonMinutesFiveEight = findViewById(R.id.buttonMinutesFiveEight);
        buttonMinutesFiveEight.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 5);
            }
        });
        buttonMinutesFiveNine = findViewById(R.id.buttonMinutesFiveNine);
        buttonMinutesFiveNine.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 5);
            }
        });
        buttonMinutesFiveTen = findViewById(R.id.buttonMinutesFiveTen);
        buttonMinutesFiveTen.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 5);
            }
        });
        buttonMinutesFiveEleven = findViewById(R.id.buttonMinutesFiveEleven);
        buttonMinutesFiveEleven.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 5);
            }
        });
        buttonMinutesOneOne = findViewById(R.id.buttonMinutesOneOne);
        buttonMinutesOneOne.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 1);
            }
        });
        buttonMinutesOneTwo = findViewById(R.id.buttonMinutesOneTwo);
        buttonMinutesOneTwo.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 1);
            }
        });
        buttonMinutesOneThree = findViewById(R.id.buttonMinutesOneThree);
        buttonMinutesOneThree.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 1);
            }
        });
        buttonMinutesOneFour = findViewById(R.id.buttonMinutesOneFour);
        buttonMinutesOneFour.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                setTime(textDigitalTimeMinutes, isChecked, 1);
            }
        });
    }

    /**
     * This function is used for setting digital time value in Minutes TextView after user
     * selects any block of Minutes from Berlin clock.
     *
     * @param textViewTime  : time before user selected new time
     * @param isTimeChecked : true if that block of berlin clock is checked else false
     * @param blockValue    : integer value of that block type i.e 5 for five minutes block selected and 1 for one
     *                      one minute block selected.
     */
    private void setTime(TextView textViewTime, boolean isTimeChecked, int blockValue) {
        if (isTimeChecked) {
            textViewTime.setText(String.format("%02d", (Integer.valueOf(textViewTime.getText().toString()) + blockValue)));
        } else {
            textViewTime.setText(String.format("%02d", (Integer.valueOf(textViewTime.getText().toString()) - blockValue)));
        }
    }

}
