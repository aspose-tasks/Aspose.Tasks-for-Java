/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import java.util.Calendar;
import java.util.Date;

import com.aspose.tasks.DateTimeConverter;
import com.aspose.tasks.GanttChartView;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.TimescaleUnit;
import com.aspose.tasks.examples.Utils;

public class CustomizeTimeScaleTierLabels {
	public static void main(String[] args) throws Exception {
		//ExStart: customize-time-scale-tier-labels
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(DefaultProjectProperties.class);
		Project project = new Project(dataDir + "New Project 2007.mpp");

		project.getTaskLinks().add(project.getRootTask().getChildren()
				.add("Task 1"), project.getRootTask().getChildren()
				.add("Task 2"));

		GanttChartView view = (GanttChartView)project.getDefaultView();
		view.getMiddleTimescaleTier().setUnit(TimescaleUnit.Months);
		project.set(Prj.TIMESCALE_START, new Date(112, 7, 6));

		view.getMiddleTimescaleTier().setDateTimeConverter( new DateTimeConverter() {
		      	public String invoke(java.util.Date date)
		        {
		      		Calendar cal = Calendar.getInstance();
		      		cal.setTime(date);
		      		int month = cal.get(Calendar.MONTH);
		            return new String[] { "Jan.", "Feb.", "Mar.", "Apr.","May.", "Jun.", "July.","Aug.", "Sep.", "Oct.", "Nov.", "Dec." }[month];
		        }
		        });

		project.save("saved.pdf", SaveFileFormat.PDF);
		//ExEnd: customize-time-scale-tier-labels
	}
}
