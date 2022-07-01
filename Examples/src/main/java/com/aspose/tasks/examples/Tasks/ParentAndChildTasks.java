/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.ChildTasksCollector;
import com.aspose.tasks.ConstraintType;
import com.aspose.tasks.NullableBool;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.Task;
import com.aspose.tasks.TaskUtils;
import com.aspose.tasks.TimeUnitType;
import com.aspose.tasks.Tsk;
import com.aspose.tasks.examples.Utils;

import java.io.IOException;
import java.util.Date;
import java.util.List;

public class ParentAndChildTasks {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ParentAndChildTasks.class);

        gettingparentandchildtasks(dataDir);
        settingchildtasks();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void gettingparentandchildtasks(String dataDir) {
        Project prj = new Project(dataDir + "ParentChildTasks.mpp");

        // Create a ChildTasksCollector instance
        ChildTasksCollector collector = new ChildTasksCollector();

        //Use TaskUtils to get all children tasks in RootTask
        TaskUtils.apply(prj.getRootTask(), collector, 0);

        List tasks = collector.getTasks();
        int iSize = tasks.size();
        // Parse through all the collected tasks
        for (int i = 0; i < iSize; i++) {
            Task tsk = (Task) tasks.get(i);
            System.out.println("Task Name = " + tsk.get(Tsk.NAME));
        }
    }

    public static void settingchildtasks() throws IOException {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ParentAndChildTasks.class);

        Project proj = new Project(dataDir + "Blank2010.mpp");
        proj.set(Prj.NEW_TASKS_ARE_MANUAL, new NullableBool(false));
        double oneDay = 8d * 60d * 60d * 10000000d;
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2014, 9, 13, 8, 0, 0);
        Date startDate = cal.getTime();
        proj.set(Prj.START_DATE, startDate);

        Task task1 = proj.getRootTask().getChildren().add("Task 1");
        cal.set(2014, 9, 13, 8, 0, 0);
        task1.set(Tsk.START, cal.getTime());
        task1.set(Tsk.DURATION, proj.getDuration(29, TimeUnitType.Day));
        Task task2 = proj.getRootTask().getChildren().add("Task 2");

        //add child tasks to task 2
        Task task3 = task2.getChildren().add("Task 3");
        Task task4 = task2.getChildren().add("Task 4");

        cal.set(2014, 9, 15, 8, 0, 0);
        task3.set(Tsk.START, cal.getTime());
        task3.set(Tsk.DURATION, proj.getDuration(3, TimeUnitType.Day));
        task3.set(Tsk.CONSTRAINT_TYPE, ConstraintType.StartNoEarlierThan);
        task3.set(Tsk.CONSTRAINT_DATE, task3.get(Tsk.START));

        cal.set(2014, 9, 17, 8, 0, 0);
        task4.set(Tsk.START, cal.getTime());
        task4.set(Tsk.DURATION, proj.getDuration(3, TimeUnitType.Day));
        task4.set(Tsk.CONSTRAINT_TYPE, ConstraintType.StartNoEarlierThan);
        task4.set(Tsk.CONSTRAINT_DATE, task3.get(Tsk.START));

        task3.set(Tsk.PERCENT_COMPLETE, 50);
        task4.set(Tsk.PERCENT_COMPLETE, 70);

        proj.save(dataDir + "ProjectJava.mpp", SaveFileFormat.Mpp);
    }
}




