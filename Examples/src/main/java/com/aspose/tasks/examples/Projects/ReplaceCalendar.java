/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ReplaceCalendar {
	public static void main(String[] args) throws Exception {
		// ExStart: replace-calendar-new-calendar
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReplaceCalendar.class);

		Project project = new Project();
		// Add a calendar to the project
		Calendar cal = project.getCalendars().add("Cal 1");

		Calendar newCal = new Calendar("New Cal");
		CalendarCollection calColl = project.getCalendars();
		for (Calendar c : calColl) {
			if (c.getName() == "Cal 1") {
				calColl.remove(c);
				calColl.add("Standard", newCal);
				break;
			}
		}
		// Display result of conversion.
		System.out.println("Process completed Successfully");
		// ExEnd: replace-calendar-new-calendar
	}
}
