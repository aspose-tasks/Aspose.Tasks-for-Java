/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.Duration;
import com.aspose.tasks.Project;
import com.aspose.tasks.Task;
import com.aspose.tasks.TimeUnitType;
import com.aspose.tasks.Tsk;

public class ManageDurations {
    public static void main(String[] args) throws Exception {
        //ExStart: ManageDurations
        // Create a new project and add a new task
        Project project = new Project();
        Task task = project.getRootTask().getChildren().add("Task");

        // Task duration in days (default time unit)
        Duration duration = task.get(Tsk.DURATION);
        System.out.println("Duration equals 1 day:" + duration.toString().equals("1 day"));

        // Convert to hours time unit
        duration = duration.convert(TimeUnitType.Hour);
        System.out.println("Duration equals 8 hrs: " + duration.toString().equals("8 hrs"));

        // Increase task duration to 1 week and display if duration is updated successfully
        task.set(Tsk.DURATION, project.getDuration(1, TimeUnitType.Week));
        System.out.println("Duration equals 1 wk: " + task.get(Tsk.DURATION).toString().equals("1 wk"));

        // Decrease task duration and display if duration is updated successfully
        task.set(Tsk.DURATION, task.get(Tsk.DURATION).subtract(0.5));
        System.out.println("Duration equals 0.5 wks: " + task.get(Tsk.DURATION).toString().equals("0.5 wks"));
        //ExEnd: ManageDurations
    }
}




