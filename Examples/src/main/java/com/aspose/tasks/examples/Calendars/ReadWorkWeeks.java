package com.aspose.tasks.examples.Calendars;

import com.aspose.tasks.examples.Utils;
import com.aspose.tasks.Project;
import com.aspose.tasks.Calendar;
import com.aspose.tasks.WorkWeekCollection;
import com.aspose.tasks.WorkWeek;
import com.aspose.tasks.WeekDayCollection;
import com.aspose.tasks.WeekDay;
import com.aspose.tasks.WorkingTimeCollection;

public class ReadWorkWeeks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ExStart: ReadWorkWeeksInformation
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReadWorkWeeks.class);

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
		// ExEnd: ReadWorkWeeksInformation
	}

}
