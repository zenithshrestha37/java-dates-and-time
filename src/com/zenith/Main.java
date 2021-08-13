package com.zenith;

import java.time.*;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        Clock testClock = Clock.fixed(Instant.EPOCH, ZoneOffset.UTC); // we can vary the clock value to check if the test works
        LocalDate testDate = LocalDate.now(testClock);  //
	// create a calendar
        Calendar calendar = new Calendar();
    // add some task to the calendar
        calendar.addTask(1,0,"Answer urgent email");
        calendar.addTask(4,0,"Write deployment report");
        calendar.addTask(4,0,"Plan security configuration");

    //add sme work periods to the calendar
        calendar.addWorkPeriods(Utils.generateWorkPeriods(testDate,3));
    // add an event to the calendar, specifying its time zone
        ZonedDateTime meetingTime = ZonedDateTime.of(testDate.atTime(8,30)),
        ZoneID.of("America/New_York");
    // create a working schedule
        Schedule schedule = calendar.createSchedule(testClock);
    // and print it out
        System.out.println(schedule);

    }
}











/*
Instant.EPOCH
Instant.ofEpochSecond(9961199)
    - supply negative signifies that much time before the epoch
    - duration.between (Instant.EPOCH ,Instant.ofEpochSecond )
zoneid

DateTimeFormatter - can convert a string to java time object called temporal using .parse method
                    -can convert wider range ofobject called accessor to string using .format
                    -.ISO_DATE_TIME
                   - Factory method
                        -.ofLocalizedTime(FormatStyle.SHORT) object and create date time object and applies parse and format
                        -.ofPattern()

                    - java.util.classes
                    -   Date.from(instant)
                        date.toInstant()
                        Calendar.toInstant()
                        timeZone.toZoneID()
                        TimeZone.getTimeZone(ZoneId)

                     - java.sql classes
                        - Date
 */





