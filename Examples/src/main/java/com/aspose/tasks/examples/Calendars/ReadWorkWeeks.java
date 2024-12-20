/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Calendars;

import com.aspose.tasks.Calendar;
import com.aspose.tasks.Project;
import com.aspose.tasks.WeekDay;
import com.aspose.tasks.WeekDayCollection;
import com.aspose.tasks.WorkWeek;
import com.aspose.tasks.WorkWeekCollection;
import com.aspose.tasks.WorkingTimeCollection;
import com.aspose.tasks.examples.Utils;

public class ReadWorkWeeks {

	public static void main(String[] args) {
		// The path to the document directory.
		String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

		// Create project instance and access calendar and work weeks collection
		Project project = new Project(dataDir + "ReadWorkWeeksInformation.mpp");
		Calendar calendar = project.getCalendars().getByUid(3);
		WorkWeekCollection collection = calendar.getWorkWeeks();

		for (WorkWeek workWeek : collection) {
			// Display work week name, from and to dates
			System.out.println(workWeek.getName());
			System.out.println(workWeek.getFromDate());
			System.out.println(workWeek.getToDate());

			// This data is all about "Details." button you can set special working times
			// for special WeekDay or even make it non-working
			WeekDayCollection weekDays = workWeek.getWeekDays();
			for (WeekDay day : weekDays) {
				// You can further traverse through working times and display these
				WorkingTimeCollection workingTimes = day.getWorkingTimes();
			}
		}
	}
}
