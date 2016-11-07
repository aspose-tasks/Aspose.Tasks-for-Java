/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class RescheduleProjectFromStartOrFinishDate {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RescheduleProjectFromStartOrFinishDate.class);
		scheduleFromStart();
		scheduleFromFinish();

		// Display result of conversion.
		System.out.println("Process completed Successfully");
	}

	public static void scheduleFromStart() {
		// ExStart: schedule-from-start
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RescheduleProjectFromStartOrFinishDate.class);

		Project project = new Project(dataDir + "Project.mpp");
		project.set(Prj.SCHEDULE_FROM_START, new NullableBool(true));
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(2020, 1, 1, 0, 0, 0);
		project.set(Prj.START_DATE, cal.getTime());

		// Now all tasks dates (Start, Finish, EarlyStart, EarlyFinish,
		// LateStart,
		// LateFinish) are calculated.
		// To get the critical path we need to calculate slacks (can be invoked
		// in
		// separate thread, but only after calculation of all early/late dates)
		project.recalculate();
		TaskCollection criticalPath = project.getCriticalPath();

		// ExEnd: schedule-from-start

	}

	public static void scheduleFromFinish() {
		// ExStart: schedule-from-finish
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RescheduleProjectFromStartOrFinishDate.class);

		Project project = new Project(dataDir + "Project.mpp");
		project.set(Prj.SCHEDULE_FROM_START, new NullableBool(false));
		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(2020, 1, 1, 0, 0, 0);
		project.set(Prj.FINISH_DATE, cal.getTime());

		// Now all tasks dates (Start, Finish, EarlyStart, EarlyFinish,
		// LateStart,
		// LateFinish) are calculated.
		// To get the critical path we need to calculate slacks (can be invoked
		// in
		// separate thread, but only after calculation of all early/late dates)
		project.recalculate();
		TaskCollection criticalPath = project.getCriticalPath();

		// ExEnd: schedule-from-finish
	}
}
