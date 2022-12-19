/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.ConstraintType;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.Task;
import com.aspose.tasks.TimeUnitType;
import com.aspose.tasks.Tsk;
import com.aspose.tasks.examples.TaskLinks.UpdatedTaskLinkDataToMpp;
import com.aspose.tasks.examples.Utils;

public class UpdatedTaskDataToMpp {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(UpdatedTaskDataToMpp.class);

        long OneSec = 1000;
        long OneMin = 60 * OneSec;
        long OneHour = 60 * OneMin;

        Project project = new Project(dataDir + "project.xml");
        Task task1 = project.getRootTask().getChildren().add("First task");

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2013, 12, 10, 8, 0, 0);
        project.set(Prj.START_DATE, cal.getTime());
        task1.set(Tsk.START, cal.getTime());
        task1.set(Tsk.DURATION, project.getDuration(24, TimeUnitType.Hour));

        Task summary = project.getRootTask().getChildren().add("Summary task");
        summary.getChildren().add(task1);

        project.getRootTask().getChildren().add(summary);

        cal.setTime(task1.get(Tsk.START));
        cal.add(java.util.Calendar.DATE, 10);
        task1.set(Tsk.DEADLINE, cal.getTime());

        task1.set(Tsk.NOTES_TEXT, "The first task.");
        task1.set(Tsk.DURATION_FORMAT, TimeUnitType.DayEstimated);
        task1.set(Tsk.CONSTRAINT_TYPE, ConstraintType.FinishNoLaterThan);

        cal.setTime(task1.get(Tsk.DEADLINE));
        cal.add(java.util.Calendar.DATE, -1);
        task1.set(Tsk.CONSTRAINT_DATE, cal.getTime());

        // Create 10 new tasks
        for (int i = 0; i < 10; i++) {
            String taskName = "Task " + (i + 2);
            Task task = summary.getChildren().add(taskName);
            task.set(Tsk.START, task1.get(Tsk.START));
            long lDuration = (long) task1.get(Tsk.DURATION).toDouble() / OneHour;
            lDuration = (long) (lDuration + (8 * (i + 1)));
            task.set(Tsk.DURATION, project.getDuration(lDuration, TimeUnitType.Hour));
            task1.set(Tsk.DURATION_FORMAT, TimeUnitType.Day);

            cal.setTime(task1.get(Tsk.DEADLINE));
            cal.add(java.util.Calendar.DATE, 1 + i);
            task.set(Tsk.DEADLINE, cal.getTime());
            task.set(Tsk.FINISH, project.get(Prj.CALENDAR).getFinishDateByStartAndWork(task.get(Tsk.START), task.get(Tsk.DURATION)));
            summary.getChildren().add(task);
        }

        //Save the Project
        project.save(dataDir + "WritingUpdatedTaskDataToMpp.mpp", SaveFileFormat.Mpp);
    }
}




