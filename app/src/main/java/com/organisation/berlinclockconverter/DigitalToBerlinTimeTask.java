package com.organisation.berlinclockconverter;

import android.os.AsyncTask;
import android.support.v4.util.Pair;

import java.lang.ref.WeakReference;

public class DigitalToBerlinTimeTask extends AsyncTask<Integer, Void, BerlinTimeOutput> {

    private WeakReference<DigitalToBerlinActivity> digitalToBerlinActivityReference;

    public DigitalToBerlinTimeTask(DigitalToBerlinActivity digitalToBerlinActivity) {
        this.digitalToBerlinActivityReference = new WeakReference<>(digitalToBerlinActivity);
    }

    protected BerlinTimeOutput doInBackground(Integer... input) {
        BerlinTimeOutput berlinTimeOutput = new BerlinTimeOutput();
        if (input != null && input.length > 0) {
            if (input[2] % 2 == 0)
                berlinTimeOutput.isEvenSeconds = true;
            else
                berlinTimeOutput.isEvenSeconds = false;
            Pair<Integer, Integer> hoursBlocks = divideAndModulusBFive(input[0]);
            berlinTimeOutput.numberOfFiveHoursBlocksOn = hoursBlocks.first;
            berlinTimeOutput.numberOfOneHourBlocksOn = hoursBlocks.second;
            Pair<Integer, Integer> minutesBlocks = divideAndModulusBFive(input[1]);
            berlinTimeOutput.numberOfFiveMinutesBlocksOn = minutesBlocks.first;
            berlinTimeOutput.numberOfOneMinuteBlocksOn = minutesBlocks.second;
        }
        return berlinTimeOutput;
    }

    protected void onPostExecute(BerlinTimeOutput result) {
        final DigitalToBerlinActivity digitalToBerlinActivity = digitalToBerlinActivityReference.get();
        digitalToBerlinActivity.onConversionFromDigitalToBerlin(result);
    }

    private Pair<Integer, Integer> divideAndModulusBFive(int time) {
        if (time > 0) {
            int fiveHrsMnsBlocks = 0;
            int oneHrsMnsBlocks;
            if (time > 5) {
                while (time > 5) {
                    time = time - 5;
                    fiveHrsMnsBlocks++;
                }
                oneHrsMnsBlocks = time;
            } else {
                oneHrsMnsBlocks = time;
            }
            return new Pair<>(fiveHrsMnsBlocks, oneHrsMnsBlocks);
        }
        return new Pair<>(0, 0);
    }

}
