/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.TaskBaselines;

import com.aspose.tasks.BaselineType;
import com.aspose.tasks.Project;
import com.aspose.tasks.Task;
import com.aspose.tasks.TaskBaseline;
import com.aspose.tasks.examples.Utils;

public class TaskBaselineDuration {
    public static void main(String[] args) {
        long OneSec = 10000000; // microsecond * 10
        long OneMin = 60 * OneSec;
        long OneHour = 60 * OneMin;

        Project project = new Project();

        // Creating TaskBaseline:
        Task task = project.getRootTask().getChildren().add("Task");
        project.setBaseline(BaselineType.Baseline);

        TaskBaseline baseline = task.getBaselines().toList().get(0);
        System.out.println(baseline.getDuration().toDouble() / OneHour + " Hours");
    }
}




