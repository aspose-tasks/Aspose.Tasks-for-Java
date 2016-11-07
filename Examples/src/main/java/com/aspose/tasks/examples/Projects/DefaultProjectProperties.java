/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class DefaultProjectProperties {
	public static void main(String[] args) throws Exception {
		// ExStart: reading-default-project-properties

		// The path to the documents directory.
		String dataDir = Utils.getDataDir(DefaultProjectProperties.class);

		Project project = new Project(dataDir + "project.mpp");

		// Display default properties
		System.out.println("Project Version : " + project.get(Prj.SAVE_VERSION));
		System.out.println("New Task Default Start: " + project.get(Prj.DEFAULT_START_TIME));
		System.out.println("New Task Default Type: " + project.get(Prj.DEFAULT_TASK_TYPE));
		System.out.println("Resource Default Standard Rate: " + project.get(Prj.DEFAULT_STANDARD_RATE));
		System.out.println("Resource Default Overtime Rate: " + project.get(Prj.DEFAULT_OVERTIME_RATE));
		System.out.println("Default Task EV Method: " + project.get(Prj.DEFAULT_TASK_EV_METHOD));
		System.out.println("Default Cost Accrual: " + project.get(Prj.DEFAULT_FIXED_COST_ACCRUAL));
		// ExEnd: reading-default-project-properties

		// ExStart: writing-default-project-properties
		// Set default properties
		project.set(Prj.SCHEDULE_FROM_START, new NullableBool(true));

		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(2014, 2, 15, 0, 0, 0);

		project.set(Prj.START_DATE, cal.getTime());
		project.set(Prj.DEFAULT_START_TIME, project.get(Prj.START_DATE));
		project.set(Prj.DEFAULT_TASK_TYPE, TaskType.FixedDuration);
		project.set(Prj.DEFAULT_STANDARD_RATE, 15d);
		project.set(Prj.DEFAULT_OVERTIME_RATE, 12d);
		project.set(Prj.DEFAULT_TASK_EV_METHOD, EarnedValueMethodType.PercentComplete);
		project.set(Prj.DEFAULT_FIXED_COST_ACCRUAL, CostAccrualType.Prorated);

		// Save the project to XML format
		project.save(dataDir + "Project4.xml", SaveFileFormat.XML);

		// Display result of conversion.
		System.out.println("Process completed Successfully");
		// ExEnd: writing-default-project-properties
	}
}