/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.TaskLinks;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class UpdatedTaskLinkDataToMpp {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(UpdatedTaskLinkDataToMpp.class);

        long OneSec = 10000000;//microsecond * 10
        long OneMin = 60 * OneSec;
        long OneHour = 60 * OneMin;

        String newFile = "Blank2010.mpp";
        // File to write test project
        String resultFile = "Output.mpp";

        // Read new empty file
        Project project = new Project(dataDir + newFile);

        // Add eight tasks
        Task task1 = project.getRootTask().getChildren().add("1");
        task1.set(Tsk.DURATION, project.getDuration(8, TimeUnitType.Hour));
        task1.set(Tsk.START, project.get(Prj.START_DATE));
        task1.set(Tsk.FINISH, project.get(Prj.CALENDAR).getTaskFinishDateFromDuration(task1, task1.get(Tsk.DURATION).toDouble()));

        Task task2 = project.getRootTask().getChildren().add("2");
        task2.set(Tsk.DURATION, project.getDuration(8, TimeUnitType.Hour));
        task2.set(Tsk.START, project.get(Prj.START_DATE));
        task2.set(Tsk.FINISH, project.get(Prj.CALENDAR).getTaskFinishDateFromDuration(task2, task2.get(Tsk.DURATION).toDouble()));

        project.getRootTask().getChildren().add(task1);
        project.getRootTask().getChildren().add(task2);

        Task task3 = project.getRootTask().getChildren().add("3");
        task3.set(Tsk.DURATION, project.getDuration(8, TimeUnitType.Hour));
        task3.set(Tsk.START, project.get(Prj.START_DATE));
        task3.set(Tsk.FINISH, project.get(Prj.CALENDAR).getTaskFinishDateFromDuration(task3, task3.get(Tsk.DURATION).toDouble()));

        Task task4 = project.getRootTask().getChildren().add("4");
        task4.set(Tsk.DURATION, project.getDuration(8, TimeUnitType.Hour));
        task4.set(Tsk.START, project.get(Prj.START_DATE));
        task4.set(Tsk.FINISH, project.get(Prj.CALENDAR).getTaskFinishDateFromDuration(task4, task4.get(Tsk.DURATION).toDouble()));

        project.getRootTask().getChildren().add(task3);
        project.getRootTask().getChildren().add(task4);

        Task task5 = project.getRootTask().getChildren().add("5");
        task5.set(Tsk.DURATION, project.getDuration(8, TimeUnitType.Hour));
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(project.get(Prj.START_DATE));
        cal.add(java.util.Calendar.DATE, 7);

        task5.set(Prj.START_DATE, cal.getTime());
        task5.set(Tsk.FINISH, project.get(Prj.CALENDAR).getTaskFinishDateFromDuration(task5, task5.get(Tsk.DURATION).toDouble()));
        task5.set(Tsk.CONSTRAINT_TYPE, ConstraintType.MustStartOn);
        task5.set(Tsk.CONSTRAINT_DATE, task5.get(Tsk.START));

        Task task6 = project.getRootTask().getChildren().add("6");
        task6.set(Tsk.DURATION, project.getDuration(8, TimeUnitType.Hour));
        task6.set(Tsk.FINISH, task5.get(Tsk.START));
        task6.set(Tsk.START, project.get(Prj.CALENDAR).getTaskFinishDateFromDuration(task6, task6.get(Tsk.DURATION).toDouble()));

        project.getRootTask().getChildren().add(task5);
        project.getRootTask().getChildren().add(task6);

        Task task7 = project.getRootTask().getChildren().add("7");
        task7.set(Tsk.DURATION, project.getDuration(8, TimeUnitType.Hour));

        Task task8 = project.getRootTask().getChildren().add("8");
        task8.set(Tsk.DURATION, project.getDuration(8, TimeUnitType.Hour));

        project.getRootTask().getChildren().add(task7);
        project.getRootTask().getChildren().add(task8);

        task7.set(Tsk.START, project.get(Prj.START_DATE));
        task7.set(Tsk.START, project.get(Prj.CALENDAR).getTaskFinishDateFromDuration(task7, task7.get(Tsk.DURATION).toDouble()));

        cal.setTime(project.get(Prj.START_DATE));
        cal.add(java.util.Calendar.DATE, 1);
        task8.set(Tsk.START, cal.getTime());
        task8.set(Tsk.START, project.get(Prj.CALENDAR).getTaskFinishDateFromDuration(task8, task8.get(Tsk.DURATION).toDouble()));

        // Add four TaskLinks with different TaskLinkTypes
        TaskLink link1 = project.getTaskLinks().add(task1, task2, TaskLinkType.StartToStart);

        TaskLink link2 = project.getTaskLinks().add(task3, task4, TaskLinkType.FinishToFinish);

        TaskLink link3 = project.getTaskLinks().add(task5, task6, TaskLinkType.StartToFinish);

        TaskLink link4 = project.getTaskLinks().add(task7, task8, TaskLinkType.FinishToStart);

        link4.setLagFormat(TimeUnitType.Day);
        link4.setLinkLag(60 * 8 * 10 * 10); // 10d
        task8.set(Tsk.START, project.get(Prj.CALENDAR).getFinishDateByStartAndWork(task8.get(Tsk.FINISH), OneHour * 8 * 10));
        task8.set(Tsk.FINISH, project.get(Prj.CALENDAR).getFinishDateByStartAndWork(task8.get(Tsk.START), task8.get(Tsk.DURATION).toDouble()));

        //Save the Project
        project.save(dataDir + resultFile, SaveFileFormat.Mpp);
    }
}




