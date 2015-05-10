/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasklinks.updatedtasklinkdatatompp.java;

import com.aspose.tasks.*;

public class UpdatedTaskLinkDataToMpp
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasklinks/updatedtasklinkdatatompp/data/";

       	long OneSec = 10000000;//microsecond * 10
	long OneMin = 60 * OneSec;
	long OneHour = 60 * OneMin;

	String newFile = "Blank2010.mpp";
	// File to write test project
	String resultFile = "Output.mpp";
	// Read new empty file
	Project project = new Project(newFile);

	// Add eight tasks
	Task task1 = new Task("1");
	task1.setDuration(OneHour * 8);// = new TimeSpan(8, 0, 0);
	task1.setStart(project.getStartDate());
	task1.setFinish(project.getCalendar().getTaskFinishDateFromDuration(task1, task1.getDuration()));
	Task task2 = new Task("2");
	task2.setDuration(OneHour * 8);
	task2.setStart(project.getStartDate());
	task2.setFinish(project.getCalendar().getTaskFinishDateFromDuration(task2, task2.getDuration()));
	project.getRootTask().getChildren().add(task1);
	project.getRootTask().getChildren().add(task2);

	Task task3 = new Task("3");
	task3.setDuration(OneHour * 8);
	task3.setStart(project.getStartDate());
	task3.setFinish(project.getCalendar().getTaskFinishDateFromDuration(task3, task3.getDuration()));
	Task task4 = new Task("4");
	task4.setDuration(OneHour * 8);
	task4.setStart(project.getStartDate());
	task4.setFinish(project.getCalendar().getTaskFinishDateFromDuration(task4, task4.getDuration()));
	project.getRootTask().getChildren().add(task3);
	project.getRootTask().getChildren().add(task4);

	Task task5 = new Task("5");
	task5.setDuration(OneHour * 8);
	java.util.Calendar cal = java.util.Calendar.getInstance();
	cal.setTime(project.getStartDate());
	cal.add(java.util.Calendar.DATE, 7);
	task5.setStart(cal.getTime());
	task5.setFinish(project.getCalendar().getTaskFinishDateFromDuration(task5, task5.getDuration()));
	task5.setConstraintType(ConstraintType.MustStartOn);
	task5.setConstraintDate(task5.getStart());
	
	Task task6 = new Task("6");
	task6.setDuration(OneHour * 8);
	task6.setFinish(task5.getStart());
	task6.setStart(project.getCalendar().getStartDateFromFinishAndDuration(task6.getFinish(), task6.getDuration()));
	project.getRootTask().getChildren().add(task5);
	project.getRootTask().getChildren().add(task6);
	
	Task task7 = new Task("7");
	task7.setDuration(OneHour * 8);
	Task task8 = new Task("8");
	task8.setDuration(OneHour * 8);
	project.getRootTask().getChildren().add(task7);
	project.getRootTask().getChildren().add(task8);
	
	task7.setStart(project.getStartDate());
	task7.setFinish(project.getCalendar().getTaskFinishDateFromDuration(task7, task7.getDuration()));
	
	cal.setTime(project.getStartDate());
	cal.add(java.util.Calendar.DATE, 1);
	task8.setStart(cal.getTime());
	task8.setFinish(project.getCalendar().getTaskFinishDateFromDuration(task8, task8.getDuration()));
	
	// Necessary calculations
	project.calcTaskUids();
	project.calcTaskIds();
	project.updateReferences();

	// Add four TaskLinks with different TaskLinkTypes
	TaskLink link1 = new TaskLink(task1, task2, TaskLinkType.StartToStart);
	project.addTaskLink(link1);
	
	TaskLink link2 = new TaskLink(task3, task4, TaskLinkType.FinishToFinish);
	project.addTaskLink(link2);
	
	TaskLink link3 = new TaskLink(task5, task6, TaskLinkType.StartToFinish);
	project.addTaskLink(link3);
	
	TaskLink link4 = new TaskLink(task7, task8, TaskLinkType.FinishToStart);
	project.addTaskLink(link4);

	link4.setLagFormat(TimeUnitType.Day);
	link4.setLinkLag(60 * 8 * 10 * 10); // 10d
	task8.setStart(project.getCalendar().getFinishDateByStartAndWork(task7.getFinish(), OneHour * 8 * 10));
	task8.setFinish(project.getCalendar().getFinishDateByStartAndWork(task8.getStart(), task8.getDuration()));

	//Save the Project
	project.save(dataDir + "Project.Mpp", SaveFileFormat.MPP);

    }
}




