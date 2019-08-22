/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Miscellaneous;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.TimeZone;

public class WriteMetadata {
	public static void main(String[] args) throws Exception {
		// ExStart: WriteMetadata
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(WriteMetadata.class);

		long OneSec = 10000000;
		long OneMin = 60 * OneSec;
		long OneHour = 60 * OneMin;
		long OneDayEightHour = 8 * OneHour;
		long OneDayTwentyFourHour = 24 * OneHour;

		Project project = new Project(dataDir + "New project 2010.mpp");
		java.util.Calendar calendar = java.util.Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		calendar.set(2012, java.util.Calendar.DECEMBER, 7, 0, 0, 0);
		Date startDate = calendar.getTime();
		calendar.set(2013, java.util.Calendar.DECEMBER, 7, 0, 0, 0);
		Date toDate = calendar.getTime();

		WorkingTime wt = new WorkingTime();
		wt.setFromTime(startDate);
		wt.setToTime(toDate);

		WeekDay day = project.get(Prj.CALENDAR).getWeekDays().toList().get(1);
		day.getWorkingTimes().add(wt);

		project.get(Prj.CALENDAR).setName("CHANGED NAME!");

		Task task = project.getRootTask().getChildren().add("Task 1");
		task.set(Tsk.DURATION_FORMAT, TimeUnitType.Day);
		task.set(Tsk.DURATION, project.getDuration(3));
		task.set(Tsk.CONTACT, "Rsc 1");
		// new fields
		task.set(Tsk.IS_MARKED, true);
		task.set(Tsk.IGNORE_WARNINGS, true);

		Task task2 = project.getRootTask().getChildren().add("Task 2");
		task2.set(Tsk.DURATION_FORMAT, TimeUnitType.Day);
		task2.set(Tsk.CONTACT, "Rsc 2");

		project.getTaskLinks().add(task, task2, TaskLinkType.FinishToStart, project.getDuration(-1, TimeUnitType.Day));

		calendar.set(2013, java.util.Calendar.DECEMBER, 13, 9, 0, 0);
		startDate = calendar.getTime();
		project.set(Prj.START_DATE, startDate);

		Resource rsc = project.getResources().add("Rsc 1");
		rsc.set(Rsc.TYPE, ResourceType.Work);
		rsc.set(Rsc.INITIALS, "WR");
		rsc.set(Rsc.ACCRUE_AT, CostAccrualType.Prorated);
		rsc.set(Rsc.MAX_UNITS, 1d);
		rsc.set(Rsc.CODE, "Code 1");
		rsc.set(Rsc.GROUP, "Workers");
		rsc.set(Rsc.E_MAIL_ADDRESS, "1@gmail.com");
		rsc.set(Rsc.WINDOWS_USER_ACCOUNT, "user_acc1");
		rsc.set(Rsc.IS_GENERIC, new NullableBool(true));
		rsc.set(Rsc.ACCRUE_AT, CostAccrualType.End);
		rsc.set(Rsc.STANDARD_RATE, BigDecimal.valueOf(10));
		rsc.set(Rsc.STANDARD_RATE_FORMAT, RateFormatType.Day);
		rsc.set(Rsc.OVERTIME_RATE, BigDecimal.valueOf(15));
		rsc.set(Rsc.OVERTIME_RATE_FORMAT, RateFormatType.Hour);

		rsc.set(Rsc.IS_TEAM_ASSIGNMENT_POOL, true);
		rsc.set(Rsc.COST_CENTER, "Cost Center 1");

		ResourceAssignment assn = project.getResourceAssignments().add(task, rsc);
		assn.set(Asn.UID, 1);
		assn.set(Asn.WORK, task.get(Tsk.DURATION));
		assn.set(Asn.REMAINING_WORK, assn.get(Asn.WORK));
		assn.set(Asn.REGULAR_WORK, assn.get(Asn.WORK));
		task.set(Tsk.WORK, assn.get(Asn.WORK));

		rsc.set(Rsc.WORK, task.get(Tsk.WORK));
		assn.set(Asn.START, task.get(Tsk.START));
		assn.set(Asn.FINISH, task.get(Tsk.FINISH));

		// Add extended attribute for project and task
		ExtendedAttributeDefinition attr = ExtendedAttributeDefinition.createTaskDefinition(CustomFieldType.Flag,
				ExtendedAttributeTask.Flag1, "My Flag Field");
		project.getExtendedAttributes().add(attr);

		ExtendedAttribute taskAttr = attr.createExtendedAttribute();
		taskAttr.setFlagValue(true);
		task2.getExtendedAttributes().add(taskAttr);

		project.save(dataDir + "updated.mpp", SaveFileFormat.MPP);
		// ExEnd: WriteMetadata
	}
}
