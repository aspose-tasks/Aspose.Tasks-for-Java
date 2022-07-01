/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Calendars;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class CalendarProperties {
    public static void main(String[] args) throws Exception {
        // ExStart: CalendarProperties
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CalendarProperties.class);

        long OneSec = 1000; // 1000 milliseconds
        long OneMin = 60 * OneSec;
        long OneHour = 60 * OneMin;

        Project project = new Project(dataDir + "project.xml");

        for (Calendar cal : project.getCalendars()) {
            if (cal.getName() == null) {
                continue;
            }

            System.out.println("UID: " + cal.getUid() + " Name: " + cal.getName());

            // Show if it is has a base calendar
            System.out.print("Base Calendar: ");
            System.out.println(cal.isBaseCalendar() ? "Self" : cal.getBaseCalendar().getName());

            for (WeekDay wd : cal.getWeekDays()) {
                double ts = wd.getWorkingTime();
                System.out.println("Day Type: " + DayType.toString(DayType.class, wd.getDayType()) + " Hours: " + ts / OneHour);
            }
        }
        // ExEnd: CalendarProperties
    }
}
