/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.Tasks;

import java.util.ArrayList;
import java.util.List;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class WbsAssociatedWithTask
{
    public static void main(String[] args) throws Exception
    {
    	RenumberTaskWBSCodes();
    }
    
    public static void ReadWBSCodes()
    {
    	//ExStart: ReadWBSCodes
    	// The path to the documents directory.
        String dataDir = Utils.getDataDir(WbsAssociatedWithTask.class);

        Project project = new Project(dataDir + "input.mpp");

        // Create a ChildTasksCollector instance
        ChildTasksCollector collector = new ChildTasksCollector();

        // Collect all the tasks from RootTask using TaskUtils
        TaskUtils.apply(project.getRootTask(), collector, 0);

        //Parse through all the collected tasks
        for (Task tsk:collector.getTasks())
        {
            System.out.println(tsk.get(Tsk.WBS));
            System.out.println(tsk.get(Tsk.WBS_LEVEL));
            // set custom WBS
            tsk.set(Tsk.WBS, "custom wbs");
        }
    	//ExEnd: ReadWBSCodes
    }
    
    public static void RenumberTaskWBSCodes()
    {
    	//ExStart: RenumberTaskWBSCodes
    	String dataDir = Utils.getDataDir(WbsAssociatedWithTask.class);
    	
    	Project project = new Project(dataDir + "RenumberExample.mpp");

    	List<Task> tasks = (List<Task>) project.getRootTask().selectAllChildTasks();

    	System.out.println("WBS codes before: ");

    	// output: ""; "1"; "2"; "4"
    	for (Task task: tasks)
    	{
    		System.out.println("\"" + task.get(Tsk.WBS) + "\"" + "; ");
    	}

    	// project.RenumberWBSCode(); // this overload could have used too
    	List<Integer> listIds = new ArrayList<>();
    	listIds.add(1);
    	listIds.add(2);
    	listIds.add(3);
    	project.renumberWBSCode(listIds);

    	System.out.println("\nWBS codes after: ");

    	// output: ""; "1"; "2"; "3"
    	for (Task task: tasks)
    	{
    		System.out.println("\"" + task.get(Tsk.WBS) + "\"" + "; ");
    	}
    	//ExEnd: RenumberTaskWBSCodes
    }
}




