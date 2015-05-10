/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.settingtimescalecount.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class SettingTimeScaleCount
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/settingtimescalecount/data/";

	Project project = new Project();
	GanttChartView view = new GanttChartView();

	view.getBottomTimescaleTier().setCount(2);
	view.getBottomTimescaleTier().setShowTicks(false);

	view.getMiddleTimescaleTier().setCount(2);
	view.getMiddleTimescaleTier().setShowTicks(false);

	project.getViews().add(view);

	// Add some test data to project
	Task task1 = project.getRootTask().getChildren().add("Task 1");
	Task task2 = project.getRootTask().getChildren().add("Task 2");
	task1.set(Tsk.DURATION, task1.getParentProject().getDuration(24, TimeUnitType.Hour));
	task2.set(Tsk.DURATION, task1.getParentProject().getDuration(40, TimeUnitType.Hour));

	project.save("temp.pdf", SaveFileFormat.PDF); // Result is in attached screenshot


	
    }
}




