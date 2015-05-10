/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.updatedtaskdatatompp.java;

import com.aspose.tasks.*;

public class UpdatedTaskDataToMpp
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/updatedtaskdatatompp/data/";  

	long OneSec = 10000000;//microsecond * 10
	long OneMin = 60 * OneSec;
	long OneHour = 60 * OneMin;

	Project project = new Project(dataDir + "Aspose\\SampleNewMSP.mpp");
	Task task1 = new Task("First task");

	java.util.Calendar cal = java.util.Calendar.getInstance();
	cal.set(2013, 12, 10, 8, 0, 0);
	project.setStartDate(cal.getTime());
	task1.setStart(cal.getTime());
	task1.setDuration((long)(OneHour * 24));

	Task summary = new Task("Summary task");
	summary.getChildren().add(task1);

	project.getRootTask().getChildren().add(summary);
	project.updateReferences();
	project.calcTaskIds();
	project.calcTaskUids();

	cal.setTime(task1.getStart());
	cal.add(java.util.Calendar.DATE, 10);
	task1.setDeadline(cal.getTime());
	
	task1.setNotesText("The first task.");
	task1.setDurationFormat(TimeUnitType.DayEstimated);
	task1.setConstraintType(ConstraintType.FinishNoLaterThan);
	
	cal.setTime(task1.getDeadline());
	cal.add(java.util.Calendar.DATE, -1);
	task1.setConstraintDate (cal.getTime());

	Task.recalculate(task1);

	// Create 10 new tasks
	for (int i = 0; i < 10; i++)
	{
	    String taskName = "Task " + (i + 2);
    	    Task task = new Task(taskName);
    	    task.setStart(task1.getStart());
    	    long lDuration = task1.getDuration();
    	    lDuration = (long)(lDuration + (OneHour * 8 * (i + 1)));
    	    task.setDuration(lDuration);
    	    task1.setDurationFormat(TimeUnitType.Day);

    	    cal.setTime(task1.getDeadline());
    	    cal.add(java.util.Calendar.DATE, 1 + i);
    	    task.setDeadline(cal.getTime());
    	    task.setFinish(project.getCalendar().getFinishDateByStartAndWork(task.getStart(), task.getDuration()));
    	    summary.getChildren().add(task);
	}

	// After adding new tasks need to recalculate again
	project.updateReferences();
	project.calcTaskIds();
	project.calcTaskUids();

	//Save the Project
	project.save(dataDir + "Aspose\\WritingUpdatedTaskDataToMpp.mpp", SaveFileFormat.MPP);
    }
}




