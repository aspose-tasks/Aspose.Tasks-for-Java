/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.Tasks1;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class WbsAssociatedWithTask
{
    public static void main(String[] args) throws Exception
    {
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
    }
}




