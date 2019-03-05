package com.organisation.berlinclockconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DigitalToBerlinActivity extends AppCompatActivity {

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
    EditText editTextHours;
    EditText editTextMinutes;
    EditText editTextSeconds;
    Button buttonConvert;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_digital_to_berlin);
        getSupportActionBar().setTitle(R.string.title_digital_to_berlin_conversion);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        buttonSeconds = findViewById(R.id.buttonSeconds);
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
        editTextHours = findViewById(R.id.inputDigitalTimeHours);
        editTextMinutes = findViewById(R.id.inputDigitalTimeMinutes);
        editTextSeconds = findViewById(R.id.inputDigitalTimeSeconds);
        buttonConvert = findViewById(R.id.buttonConvert);
        buttonConvert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Resetting the Berlin clock view
                buttonSeconds.setSelected(false);
                buttonHoursFiveOne.setSelected(false);
                buttonHoursFiveTwo.setSelected(false);
                buttonHoursFiveThree.setSelected(false);
                buttonHoursFiveFour.setSelected(false);
                buttonHoursOneOne.setSelected(false);
                buttonHoursOneTwo.setSelected(false);
                buttonHoursOneThree.setSelected(false);
                buttonHoursOneFour.setSelected(false);
                buttonMinutesFiveOne.setSelected(false);
                buttonMinutesFiveTwo.setSelected(false);
                buttonMinutesFiveThree.setSelected(false);
                buttonMinutesFiveFour.setSelected(false);
                buttonMinutesFiveFive.setSelected(false);
                buttonMinutesFiveSix.setSelected(false);
                buttonMinutesFiveSeven.setSelected(false);
                buttonMinutesFiveEight.setSelected(false);
                buttonMinutesFiveNine.setSelected(false);
                buttonMinutesFiveTen.setSelected(false);
                buttonMinutesFiveEleven.setSelected(false);
                buttonMinutesOneOne.setSelected(false);
                buttonMinutesOneTwo.setSelected(false);
                buttonMinutesOneThree.setSelected(false);
                buttonMinutesOneFour.setSelected(false);
                // Processing the data in Hours, Minutes and Seconds edit field.
                if (editTextHours.getText().toString().isEmpty() ||
                        editTextMinutes.getText().toString().isEmpty() ||
                        editTextSeconds.getText().toString().isEmpty()) {
                    Toast.makeText(DigitalToBerlinActivity.this, R.string.text_empty_field_message,
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                Integer[] arr = new Integer[3];
                arr[0] = Integer.valueOf(editTextHours.getText().toString());
                arr[1] = Integer.valueOf(editTextMinutes.getText().toString());
                arr[2] = Integer.valueOf(editTextSeconds.getText().toString());
                if (arr[0] > 23 || arr[1] > 59 || arr[2] > 59) {
                    Toast.makeText(DigitalToBerlinActivity.this, R.string.text_invalid_time_message,
                            Toast.LENGTH_SHORT).show();
                    return;
                }
                DigitalToBerlinTimeTask digitalToBerlinTimeTask = new DigitalToBerlinTimeTask(DigitalToBerlinActivity.this);
                digitalToBerlinTimeTask.execute(arr);
            }
        });
    }

    /**
     * This is a callback implemented to be called from DigitalToBerlinTimeTask after it processes the digital
     * time data, to lit the blocks of Berlin clock.
     *
     * @param berlinTimeOutput It contains data information to lit the blocks.
     */
    protected void onConversionFromDigitalToBerlin(BerlinTimeOutput berlinTimeOutput) {
        buttonSeconds.setSelected(berlinTimeOutput.isEvenSeconds);
        switch (berlinTimeOutput.numberOfFiveHoursBlocksOn) {
            case 1:
                buttonHoursFiveOne.setSelected(true);
                break;
            case 2:
                buttonHoursFiveOne.setSelected(true);
                buttonHoursFiveTwo.setSelected(true);
                break;
            case 3:
                buttonHoursFiveOne.setSelected(true);
                buttonHoursFiveTwo.setSelected(true);
                buttonHoursFiveThree.setSelected(true);
                break;
            case 4:
                buttonHoursFiveOne.setSelected(true);
                buttonHoursFiveTwo.setSelected(true);
                buttonHoursFiveThree.setSelected(true);
                buttonHoursFiveFour.setSelected(true);
                break;
        }
        switch (berlinTimeOutput.numberOfOneHourBlocksOn) {
            case 1:
                buttonHoursOneOne.setSelected(true);
                break;
            case 2:
                buttonHoursOneOne.setSelected(true);
                buttonHoursOneTwo.setSelected(true);
                break;
            case 3:
                buttonHoursOneOne.setSelected(true);
                buttonHoursOneTwo.setSelected(true);
                buttonHoursOneThree.setSelected(true);
                break;
            case 4:
                buttonHoursOneOne.setSelected(true);
                buttonHoursOneTwo.setSelected(true);
                buttonHoursOneThree.setSelected(true);
                buttonHoursOneFour.setSelected(true);
                break;
        }
        switch (berlinTimeOutput.numberOfFiveMinutesBlocksOn) {
            case 1:
                buttonMinutesFiveOne.setSelected(true);
                break;
            case 2:
                buttonMinutesFiveOne.setSelected(true);
                buttonMinutesFiveTwo.setSelected(true);
                break;
            case 3:
                buttonMinutesFiveOne.setSelected(true);
                buttonMinutesFiveTwo.setSelected(true);
                buttonMinutesFiveThree.setSelected(true);
                break;
            case 4:
                buttonMinutesFiveOne.setSelected(true);
                buttonMinutesFiveTwo.setSelected(true);
                buttonMinutesFiveThree.setSelected(true);
                buttonMinutesFiveFour.setSelected(true);
                break;
            case 5:
                buttonMinutesFiveOne.setSelected(true);
                buttonMinutesFiveTwo.setSelected(true);
                buttonMinutesFiveThree.setSelected(true);
                buttonMinutesFiveFour.setSelected(true);
                buttonMinutesFiveFive.setSelected(true);
                break;
            case 6:
                buttonMinutesFiveOne.setSelected(true);
                buttonMinutesFiveTwo.setSelected(true);
                buttonMinutesFiveThree.setSelected(true);
                buttonMinutesFiveFour.setSelected(true);
                buttonMinutesFiveFive.setSelected(true);
                buttonMinutesFiveSix.setSelected(true);
                break;
            case 7:
                buttonMinutesFiveOne.setSelected(true);
                buttonMinutesFiveTwo.setSelected(true);
                buttonMinutesFiveThree.setSelected(true);
                buttonMinutesFiveFour.setSelected(true);
                buttonMinutesFiveFive.setSelected(true);
                buttonMinutesFiveSix.setSelected(true);
                buttonMinutesFiveSeven.setSelected(true);
                break;
            case 8:
                buttonMinutesFiveOne.setSelected(true);
                buttonMinutesFiveTwo.setSelected(true);
                buttonMinutesFiveThree.setSelected(true);
                buttonMinutesFiveFour.setSelected(true);
                buttonMinutesFiveFive.setSelected(true);
                buttonMinutesFiveSix.setSelected(true);
                buttonMinutesFiveSeven.setSelected(true);
                buttonMinutesFiveEight.setSelected(true);
                break;
            case 9:
                buttonMinutesFiveOne.setSelected(true);
                buttonMinutesFiveTwo.setSelected(true);
                buttonMinutesFiveThree.setSelected(true);
                buttonMinutesFiveFour.setSelected(true);
                buttonMinutesFiveFive.setSelected(true);
                buttonMinutesFiveSix.setSelected(true);
                buttonMinutesFiveSeven.setSelected(true);
                buttonMinutesFiveEight.setSelected(true);
                buttonMinutesFiveNine.setSelected(true);
                break;
            case 10:
                buttonMinutesFiveOne.setSelected(true);
                buttonMinutesFiveTwo.setSelected(true);
                buttonMinutesFiveThree.setSelected(true);
                buttonMinutesFiveFour.setSelected(true);
                buttonMinutesFiveFive.setSelected(true);
                buttonMinutesFiveSix.setSelected(true);
                buttonMinutesFiveSeven.setSelected(true);
                buttonMinutesFiveEight.setSelected(true);
                buttonMinutesFiveNine.setSelected(true);
                buttonMinutesFiveTen.setSelected(true);
                break;
            case 11:
                buttonMinutesFiveOne.setSelected(true);
                buttonMinutesFiveTwo.setSelected(true);
                buttonMinutesFiveThree.setSelected(true);
                buttonMinutesFiveFour.setSelected(true);
                buttonMinutesFiveFive.setSelected(true);
                buttonMinutesFiveSix.setSelected(true);
                buttonMinutesFiveSeven.setSelected(true);
                buttonMinutesFiveEight.setSelected(true);
                buttonMinutesFiveNine.setSelected(true);
                buttonMinutesFiveTen.setSelected(true);
                buttonMinutesFiveEleven.setSelected(true);
                break;

        }
        switch (berlinTimeOutput.numberOfOneMinuteBlocksOn) {
            case 1:
                buttonMinutesOneOne.setSelected(true);
                break;
            case 2:
                buttonMinutesOneOne.setSelected(true);
                buttonMinutesOneTwo.setSelected(true);
                break;
            case 3:
                buttonMinutesOneOne.setSelected(true);
                buttonMinutesOneTwo.setSelected(true);
                buttonMinutesOneThree.setSelected(true);
                break;
            case 4:
                buttonMinutesOneOne.setSelected(true);
                buttonMinutesOneTwo.setSelected(true);
                buttonMinutesOneThree.setSelected(true);
                buttonMinutesOneFour.setSelected(true);
                break;
        }
    }

}
