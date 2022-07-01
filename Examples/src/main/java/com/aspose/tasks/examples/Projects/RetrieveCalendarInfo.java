/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Calendar;
import com.aspose.tasks.CalendarCollection;
import com.aspose.tasks.Project;
import com.aspose.tasks.WeekDay;
import com.aspose.tasks.WeekDayCollection;
import com.aspose.tasks.examples.Utils;

public class RetrieveCalendarInfo {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RetrieveCalendarInfo.class);

        long OneSec = 10000000;//microsecond * 10
        long OneMin = 60 * OneSec;
        long OneHour = 60 * OneMin;

        //Create a project reader instance
        Project project = new Project(dataDir + "project.mpp");

        //Retrieve Calendars Information
        CalendarCollection alCals = project.getCalendars();

        for (Calendar cal : alCals) {
            if (cal.getName() != null) {
                System.out.println("Calendar UID : " + cal.getUid());
                System.out.println("Calendar Name : " + cal.getName());

                WeekDayCollection alDays = cal.getWeekDays();
                for (WeekDay wd : alDays) {
                    double ts = wd.getWorkingTime();        //milliseconds
                    double time = ts / (OneHour);
                    if (wd.getDayWorking()) {
                        System.out.print(wd.getDayType() + ":");
                        System.out.print("Working Time:" + time + " Hours");
                        System.out.println(", Ticks = " + ts);
                    }
                }
            }
        }

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




