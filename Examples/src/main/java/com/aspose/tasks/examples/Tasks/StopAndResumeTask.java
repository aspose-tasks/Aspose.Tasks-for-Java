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

public class StopAndResumeTask
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(StopAndResumeTask.class);

        Project project = new Project(dataDir + "input.mpp");

        // Create a ChildTasksCollector instance
        ChildTasksCollector collector = new ChildTasksCollector();

        // Collect all the tasks from RootTask using TaskUtils
        TaskUtils.apply(project.getRootTask(), collector, 0);

        // Stop and Resume
        for (Task tsk:collector.getTasks())
        {
            if (tsk.get(Tsk.STOP).toString() == "1/1/2000")
            System.out.println("NA");
            else
            System.out.println(tsk.get(Tsk.STOP).toString());
            if (tsk.get(Tsk.RESUME).toString() == "1/1/2000")
            System.out.println("NA");
                else
            System.out.println(tsk.get(Tsk.RESUME).toString());
        }
	
    }
}




