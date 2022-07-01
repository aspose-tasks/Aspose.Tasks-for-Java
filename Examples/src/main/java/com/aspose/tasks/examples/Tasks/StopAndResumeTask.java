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

import java.util.Calendar;
import java.util.GregorianCalendar;

public class StopAndResumeTask {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(StopAndResumeTask.class);

        Project project = new Project(dataDir + "Software Development.mpp");

        // Create a ChildTasksCollector instance
        ChildTasksCollector collector = new ChildTasksCollector();

        // Collect all the tasks from RootTask using TaskUtils
        TaskUtils.apply(project.getRootTask(), collector, 0);

        java.util.Date minDate = new GregorianCalendar(2000, Calendar.JANUARY, 1).getTime();

        // Stop and Resume
        for (Task tsk : collector.getTasks()) {
            if (tsk.get(Tsk.STOP).before(minDate)) {
                System.out.println("NA");
            } else {
                System.out.println(tsk.get(Tsk.STOP).toString());
            }
            if (tsk.get(Tsk.RESUME).before(minDate)) {
                System.out.println("NA");
            } else {
                System.out.println(tsk.get(Tsk.RESUME).toString());
            }
        }
    }
}




