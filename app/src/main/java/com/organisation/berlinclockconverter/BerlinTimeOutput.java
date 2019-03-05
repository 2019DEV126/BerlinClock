package com.organisation.berlinclockconverter;

/**
 * This class is used for getting data to lit the blocks of Berlin clock after user enters the
 * digital time and needs to convert it into Berlin clock representation.
 */
public class BerlinTimeOutput {
    boolean isEvenSeconds = false;
    int numberOfFiveHoursBlocksOn = 0;
    int numberOfOneHourBlocksOn = 0;
    int numberOfFiveMinutesBlocksOn = 0;
    int numberOfOneMinuteBlocksOn = 0;
}
