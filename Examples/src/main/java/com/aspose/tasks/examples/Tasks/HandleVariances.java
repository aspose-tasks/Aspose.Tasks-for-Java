/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.BaselineType;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.Task;
import com.aspose.tasks.Tsk;

import java.util.Calendar;

public class HandleVariances {
    public static void main(String[] args) {
        Project project = new Project();
        Task task = project.getRootTask().getChildren().add("Task");
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2014, Calendar.FEBRUARY, 15, 8, 0, 0);
        project.set(Prj.START_DATE, cal.getTime());
        task.set(Tsk.DURATION, project.getDuration(2));

        project.setBaseline(BaselineType.Baseline);
        cal.set(2013, Calendar.NOVEMBER, 29, 8, 0, 0);
        task.set(Tsk.START, cal.getTime());
        cal.set(2013, Calendar.NOVEMBER, 27, 8, 0, 0);
        task.set(Tsk.STOP, cal.getTime());
    }
}




