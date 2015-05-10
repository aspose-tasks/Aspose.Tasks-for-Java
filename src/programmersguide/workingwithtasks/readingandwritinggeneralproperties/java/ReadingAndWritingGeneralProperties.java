/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.readingandwritinggeneralproperties.java;

import com.aspose.tasks.*;

import java.util.Date;
import java.util.List;

public class ReadingAndWritingGeneralProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasks/readingandwritinggeneralproperties/data/";

	settingproperties();

	gettingproperties();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingproperties()
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/readingandwritinggeneralproperties/data/";
        
	Project project = new Project();
	Task task = project.getRootTask().getChildren().add("Task1");
	//Set task start date
	java.util.Calendar cal = java.util.Calendar.getInstance();
	cal.set(2013,7,17,8,0,0);
	task.set(Tsk.START, cal.getTime());
	//Set task name
	task.set(Tsk.NAME, "new name");

    }

    public static void gettingproperties()
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/readingandwritinggeneralproperties/data/";
       	
	Project prj = new Project(dataDir + "project.mpp");
	// Create a ChildTasksCollector instance
	ChildTasksCollector collector = new ChildTasksCollector();

	// Collect all the tasks from RootTask using TaskUtils
	TaskUtils.apply(prj.getRootTask(), collector, 0);

	// Parse through all the collected tasks
	for(Task tsk:collector.getTasks())
	{
    		System.out.println("Task Id:" + tsk.get(Tsk.ID));
    		System.out.println("Task Uid: " + tsk.get(Tsk.UID));
    		System.out.println("Task Name: " + tsk.get(Tsk.NAME));
    		System.out.println("Task Start: " + tsk.get(Tsk.START));
    		System.out.println("Task Finish: "+  tsk.get(Tsk.FINISH));
	}

    }
}




