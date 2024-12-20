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

public class CreateCalendar {
	public static void main(String[] args) {
		// The path to the output directory.
		String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

		// Create a project instance
		Project prj = new Project();

		// Define Calendar
		Calendar cal1 = prj.getCalendars().add("no info");
		Calendar cal2 = prj.getCalendars().add("no name");
		Calendar cal3 = prj.getCalendars().add("cal3");

		// Save the Project
		prj.save(outDir + "project_out.xml", SaveFileFormat.Xml);

		// Display result of conversion.
		System.out.println("Process completed Successfully");
		// ExEnd: CreateCalendar
	}
}
