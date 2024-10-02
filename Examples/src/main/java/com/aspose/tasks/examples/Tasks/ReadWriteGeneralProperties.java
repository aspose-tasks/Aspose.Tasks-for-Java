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

import java.util.Calendar;

public class ReadWriteGeneralProperties {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadWriteGeneralProperties.class);

        settingproperties();

        gettingproperties(dataDir);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingproperties() {
        Project project = new Project();
        Task task = project.getRootTask().getChildren().add("Task1");
        //Set task start date
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2013, Calendar.JULY, 17, 8, 0, 0);
        task.set(Tsk.START, cal.getTime());
        //Set task name
        task.set(Tsk.NAME, "new name");
    }

    public static void gettingproperties(String dataDir) {
        Project prj = new Project(dataDir + "project.xml");
        // Create a ChildTasksCollector instance
        ChildTasksCollector collector = new ChildTasksCollector();

        // Collect all the tasks from RootTask using TaskUtils
        TaskUtils.apply(prj.getRootTask(), collector, 0);

        // Parse through all the collected tasks
        for (Task tsk : collector.getTasks()) {
            System.out.println("Task Id:" + tsk.get(Tsk.ID));
            System.out.println("Task Uid: " + tsk.get(Tsk.UID));
            System.out.println("Task Name: " + tsk.get(Tsk.NAME));
            System.out.println("Task Start: " + tsk.get(Tsk.START));
            System.out.println("Task Finish: " + tsk.get(Tsk.FINISH));
        }
    }
}




