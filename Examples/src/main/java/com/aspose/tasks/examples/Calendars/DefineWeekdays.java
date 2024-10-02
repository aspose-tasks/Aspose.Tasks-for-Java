/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Calendars;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.util.GregorianCalendar;

public class DefineWeekdays {
    public static void main(String[] args) {
        // ExStart: DefineWeekdays
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(DefineWeekdays.class);

        // Create a project instance
        Project prj = new Project();

        // Define Calendar
        Calendar cal = prj.getCalendars().add("Calendar1");

        // Add working days Monday through Thursday with default timings
        cal.getWeekDays().add(WeekDay.createDefaultWorkingDay(DayType.Monday));
        cal.getWeekDays().add(WeekDay.createDefaultWorkingDay(DayType.Tuesday));
        cal.getWeekDays().add(WeekDay.createDefaultWorkingDay(DayType.Wednesday));
        cal.getWeekDays().add(WeekDay.createDefaultWorkingDay(DayType.Thursday));
        cal.getWeekDays().add(new WeekDay(DayType.Saturday));
        cal.getWeekDays().add(new WeekDay(DayType.Sunday));

        // Set Friday as short working day
        WeekDay myWeekDay = new WeekDay(DayType.Friday);

        // Sets working time. Only time part of date-time is important
        WorkingTime wt1 = new WorkingTime(
                new GregorianCalendar(1, java.util.Calendar.JANUARY, 1, 9, 0, 0).getTime(),
                new GregorianCalendar(1, java.util.Calendar.JANUARY, 1, 12, 0, 0).getTime()
        );

        WorkingTime wt2 = new WorkingTime(
                new GregorianCalendar(1, java.util.Calendar.JANUARY, 1, 13, 0, 0).getTime(),
                new GregorianCalendar(1, java.util.Calendar.JANUARY, 1, 16, 0, 0).getTime()
        );

        myWeekDay.getWorkingTimes().add(wt1);
        myWeekDay.getWorkingTimes().add(wt2);
        myWeekDay.setDayWorking(true);
        cal.getWeekDays().add(myWeekDay);

        // Save the Project
        prj.save(dataDir + "project.xml", SaveFileFormat.Xml);

        // Display result of conversion.
        System.out.println("Process completed Successfully");
        // ExEnd: DefineWeekdays
    }
}




