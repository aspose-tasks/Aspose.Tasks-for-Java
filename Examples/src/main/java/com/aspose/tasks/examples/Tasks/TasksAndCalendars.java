/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.Calendar;
import com.aspose.tasks.ChildTasksCollector;
import com.aspose.tasks.Project;
import com.aspose.tasks.Task;
import com.aspose.tasks.TaskUtils;
import com.aspose.tasks.Tsk;
import com.aspose.tasks.examples.Utils;

public class TasksAndCalendars {
    public static void main(String[] args) throws Exception {
        settingtaskcalendar();

        // Display result of process.
        System.out.println("Process completed Successfully");
    }

    public static void settingtaskcalendar() {
        Project project = new Project();
        Task tsk = project.getRootTask().getChildren().add("Task1");
        // add a standard calendar
        Calendar cal = project.getCalendars().add("TaskCal1");

        tsk.set(Tsk.CALENDAR, cal);
    }
}




