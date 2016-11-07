/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;
import com.aspose.tasks.examples.TaskLinks.UpdatedTaskLinkDataToMpp;

public class UpdatedTaskDataToMpp {
	public static void main(String[] args) throws Exception {
		// ExStart: updated-tasks-to-mpp
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(UpdatedTaskLinkDataToMpp.class);

		long OneSec = 10000000;// microsecond * 10
		long OneMin = 60 * OneSec;
		long OneHour = 60 * OneMin;

		Project project = new Project(dataDir + "Aspose\\SampleNewMSP.mpp");
		Task task1 = project.getRootTask().getChildren().add("First task");

		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(2013, 12, 10, 8, 0, 0);
		project.set(Prj.START_DATE, cal.getTime());
		task1.set(Tsk.START, cal.getTime());
		task1.set(Tsk.DURATION, project.getDuration(OneHour * 24, TimeUnitType.Hour));

		Task summary = project.getRootTask().getChildren().add("Summary task");
		summary.getChildren().add(task1);

		project.getRootTask().getChildren().add(summary);

		cal.setTime(task1.get(Tsk.START));
		cal.add(java.util.Calendar.DATE, 10);
		task1.set(Tsk.DEADLINE, cal.getTime());

		task1.set(Tsk.NOTES_TEXT, "The first task.");
		task1.set(Tsk.DURATION_FORMAT, TimeUnitType.DayEstimated);
		task1.set(Tsk.CONSTRAINT_TYPE, ConstraintType.FinishNoLaterThan);

		cal.setTime(task1.get(Tsk.DEADLINE));
		cal.add(java.util.Calendar.DATE, -1);
		task1.set(Tsk.CONSTRAINT_DATE, cal.getTime());

		// Create 10 new tasks
		for (int i = 0; i < 10; i++) {
			String taskName = "Task " + (i + 2);
			Task task = summary.getChildren().add(taskName);
			task.set(Tsk.START, task1.get(Tsk.START));
			long lDuration = (long) task1.get(Tsk.DURATION).toDouble();
			lDuration = (long) (lDuration + (OneHour * 8 * (i + 1)));
			task.set(Tsk.DURATION, project.getDuration(lDuration, TimeUnitType.Hour));
			task1.set(Tsk.DURATION_FORMAT, TimeUnitType.Day);

			cal.setTime(task1.get(Tsk.DEADLINE));
			cal.add(java.util.Calendar.DATE, 1 + i);
			task.set(Tsk.DEADLINE, cal.getTime());
			task.set(Tsk.FINISH,
					project.get(Prj.CALENDAR).getFinishDateByStartAndWork(task.get(Tsk.START), task.get(Tsk.DURATION)));
			summary.getChildren().add(task);
		}

		// Save the Project
		project.save(dataDir + "Aspose\\WritingUpdatedTaskDataToMpp.mpp", SaveFileFormat.MPP);
		// ExEnd: updated-tasks-to-mpp
	}
}
