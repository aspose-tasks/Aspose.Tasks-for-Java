/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
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

import java.util.ArrayList;
import java.util.List;

public class WbsAssociatedWithTask {
    public static void main(String[] args) {
        RenumberTaskWBSCodes();
    }

    public static void ReadWBSCodes() {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "input.mpp");

        // Create a ChildTasksCollector instance
        ChildTasksCollector collector = new ChildTasksCollector();

        // Collect all the tasks from RootTask using TaskUtils
        TaskUtils.apply(project.getRootTask(), collector, 0);

        //Parse through all the collected tasks
        for (Task tsk : collector.getTasks()) {
            System.out.println(tsk.get(Tsk.WBS));
            System.out.println(tsk.get(Tsk.WBS_LEVEL));
            // set custom WBS
            tsk.set(Tsk.WBS, "custom wbs");
        }
    }

    public static void RenumberTaskWBSCodes() {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "RenumberExample.mpp");

        List<Task> tasks = (List<Task>) project.getRootTask().selectAllChildTasks();

        System.out.println("WBS codes before: ");

        // output: ""; "1"; "2"; "4"
        for (Task task : tasks) {
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
        for (Task task : tasks) {
            System.out.println("\"" + task.get(Tsk.WBS) + "\"" + "; ");
        }
    }
}




