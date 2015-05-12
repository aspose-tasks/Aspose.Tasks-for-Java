/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.tasksandcalendars.java;

import com.aspose.tasks.*;

import java.util.List;

public class TasksAndCalendars
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasks/tasksandcalendars/data/";

	settingtaskcalendar();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingtaskcalendar()
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/tasksandcalendars/data/";
        
	Project project = new Project();
	Task tsk = project.getRootTask().getChildren().add("Task1");
	// add a standard calendar
	Calendar cal = project.getCalendars().add("TaskCal1");

	tsk.set(Tsk.CALENDAR, cal);

    }

    public static void gettingtaskcalendar()
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/tasksandcalendars/data/";

	//create a project instance
	Project prj = new Project(dataDir + "project5.mpp");

	//Declare ChildTasksCollector class object
	ChildTasksCollector collector = new ChildTasksCollector();

	//Use TaskUtils to get all children tasks in RootTask
	TaskUtils.apply(prj.getRootTask(), collector, 0);

	//Parse all the recursive children
	for(Task tsk:collector.getTasks())
	{
  		Calendar tskCal = tsk.get(Tsk.CALENDAR);
  		System.out.println("Task calendar name:"+ tskCal.getName());
	}
     }
}




