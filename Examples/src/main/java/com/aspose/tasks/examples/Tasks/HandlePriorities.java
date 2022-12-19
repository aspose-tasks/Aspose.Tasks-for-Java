/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.ChildTasksCollector;
import com.aspose.tasks.Project;
import com.aspose.tasks.Task;
import com.aspose.tasks.TaskUtils;
import com.aspose.tasks.Tsk;
import com.aspose.tasks.examples.Utils;

public class HandlePriorities {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(HandlePriorities.class);

        Project project = new Project(dataDir + "project.xml");

        // Create a ChildTasksCollector instance
        ChildTasksCollector collector = new ChildTasksCollector();

        // Collect all the tasks from RootTask using TaskUtils
        TaskUtils.apply(project.getRootTask(), collector, 0);

        // Handling Priorities:
        // Parse through all the collected tasks
        for (Task tsk : collector.getTasks()) {
            System.out.println(tsk.get(Tsk.PRIORITY).toString());
        }
    }
}




