/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class UpdateProjectAndRescheduleuncompletedwork
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(UpdateProjectAndRescheduleuncompletedwork.class);

        long OneSec = 10000000;//microsecond * 10
        long OneMin = 60 * OneSec;
        long OneHour = 60 * OneMin;

        Project project = new Project();

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2014, 1, 27, 8, 0, 0);
        project.set(Prj.START_DATE,cal.getTime());

        Task task1 = project.getRootTask().getChildren().add("Task 1");
        Task task2 = project.getRootTask().getChildren().add("Task 2");
        task2.set(Tsk.DURATION, task2.getParentProject().getDuration(16, TimeUnitType.Hour));
        Task task3 = project.getRootTask().getChildren().add("Task 3");
        task3.set(Tsk.DURATION, task2.getParentProject().getDuration(24, TimeUnitType.Hour));
        Task task4 = project.getRootTask().getChildren().add("Task 4");
        task4.set(Tsk.DURATION, task2.getParentProject().getDuration(16, TimeUnitType.Hour));
        Task task5 = project.getRootTask().getChildren().add("Task 5");
        task5.set(Tsk.DURATION, task2.getParentProject().getDuration(16, TimeUnitType.Hour));

        TaskLink link12 = project.getTaskLinks().add(task1, task2, TaskLinkType.FinishToStart);
        TaskLink link23 = project.getTaskLinks().add(task2, task3, TaskLinkType.FinishToStart);
        link23.setLinkLag(4800); // one day lag
        TaskLink link34 = project.getTaskLinks().add(task3, task4, TaskLinkType.FinishToStart);
        TaskLink link45 = project.getTaskLinks().add(task4, task5, TaskLinkType.FinishToStart);

        Task task6 = project.getRootTask().getChildren().add("Task 6");
        Task task7 = project.getRootTask().getChildren().add("Task 7");
        task7.set(Tsk.DURATION , task7.getParentProject().getDuration(24, TimeUnitType.Hour));
        Task task8 = project.getRootTask().getChildren().add("Task 8");
        task8.set(Tsk.DURATION, task2.getParentProject().getDuration(16, TimeUnitType.Hour));
        Task task9 = project.getRootTask().getChildren().add("Task 9");
        task9.set(Tsk.DURATION, task2.getParentProject().getDuration(16, TimeUnitType.Hour));
        Task task10 = project.getRootTask().getChildren().add("Task 10");

        TaskLink link67 = project.getTaskLinks().add(task6, task7, TaskLinkType.FinishToStart);
        TaskLink link78 = project.getTaskLinks().add(task7, task8, TaskLinkType.FinishToStart);
        TaskLink link89 = project.getTaskLinks().add(task8, task9, TaskLinkType.FinishToStart);
        TaskLink link910 = project.getTaskLinks().add(task9, task10, TaskLinkType.FinishToStart);

        task6.set(Tsk.IS_MANUAL, new NullableBool(true));
        task7.set(Tsk.IS_MANUAL, new NullableBool(true));
        task8.set(Tsk.IS_MANUAL, new NullableBool(true));
        task9.set(Tsk.IS_MANUAL, new NullableBool(true));
        task10.set(Tsk.IS_MANUAL, new NullableBool(true));

        project.save(dataDir + "not updated.xml", SaveFileFormat.XML);

        cal.set(2014, 1, 28, 17, 0, 0);
        project.updateProjectWorkAsComplete(cal.getTime(), false);

        project.save(dataDir + "updated.xml", SaveFileFormat.XML);

        cal.set(2014, 1, 28, 17, 0, 0);
        project.rescheduleUncompletedWorkToStartAfter(cal.getTime());

        project.save(dataDir + "rescheduled.xml", SaveFileFormat.XML);
        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




