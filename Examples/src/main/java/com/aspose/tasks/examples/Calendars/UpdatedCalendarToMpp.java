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

import java.util.Date;
import java.util.GregorianCalendar;

public class UpdatedCalendarToMpp {
    public static void main(String[] args) {
		// The path to the document directory.
		String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

		// The path to the output directory.
		String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        String resultFile = "OutputMpp.mpp";
        String newFile = "SampleMpp.mpp";

        Project project = new Project(dataDir + newFile);
        Calendar cal1 = project.getCalendars().add("Calendar 1");
        GetTestCalendar(cal1);

        project.set(Prj.CALENDAR, cal1);

        //Save the Project
        project.save(outDir + resultFile, SaveFileFormat.Mpp);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
	

    private static void GetTestCalendar(Calendar  cal) {
    	Calendar.makeStandardCalendar(cal);
    	cal.setName("Test calendar");
    	CalendarException exc = new CalendarException();
    	Date curTime = java.util.Calendar.getInstance().getTime();
    	exc.setFromDate(curTime);
    	java.util.Calendar calObject = java.util.Calendar.getInstance();

    	calObject.add(java.util.Calendar.DATE, 2);
    	exc.setToDate(calObject.getTime());
    	exc.setDayWorking(true);

		WorkingTime wt1 = new WorkingTime(
				new GregorianCalendar(1, java.util.Calendar.JANUARY, 1, 9, 0, 0).getTime(),
				new GregorianCalendar(1, java.util.Calendar.JANUARY, 1, 13, 0, 0).getTime()
		);

		WorkingTime wt2 = new WorkingTime(
				new GregorianCalendar(1, java.util.Calendar.JANUARY, 1, 14, 0, 0).getTime(),
				new GregorianCalendar(1, java.util.Calendar.JANUARY, 1, 19, 0, 0).getTime()
		);

		WorkingTime wt3 = new WorkingTime(
				new GregorianCalendar(10, java.util.Calendar.JANUARY, 1, 20, 0, 0).getTime(),
				new GregorianCalendar(10, java.util.Calendar.JANUARY, 1, 21, 0, 0).getTime()
		);

    	exc.getWorkingTimes().add(wt1);
    	exc.getWorkingTimes().add(wt2);
    	exc.getWorkingTimes().add(wt3);
    	cal.getExceptions().add(exc);

    	CalendarException exc2 = new CalendarException();
    	java.util.Calendar newCal = java.util.Calendar.getInstance();
    	newCal.add(java.util.Calendar.DATE, 7);
    	exc2.setFromDate(newCal.getTime());
    	exc2.setToDate(exc2.getFromDate());
    	exc2.setDayWorking(false);
    	cal.getExceptions().add(exc2);
     }
}




