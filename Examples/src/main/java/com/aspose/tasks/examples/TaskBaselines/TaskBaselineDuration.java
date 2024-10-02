/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
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
import com.aspose.tasks.TimeUnitType;
import com.aspose.tasks.TimephasedData;
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

        // Display task baseline duration
        TaskBaseline baseline = task.getBaselines().toList().get(0);
        System.out.println(baseline.getDuration().toDouble() / OneHour + " Hours");
        System.out.println("Baseline Start: " + baseline.getStart());
        System.out.println("Baseline duration: " + baseline.getDuration());
        System.out.println("Baseline duration format: " + TimeUnitType.toString(TimeUnitType.class, baseline.getDuration().getTimeUnit()));
        System.out.println("Is it estimated duration?: " + baseline.getEstimatedDuration());
        System.out.println("Baseline Finish: " + baseline.getFinish());

        // value indicating whether this is an Interim Baseline
        System.out.println("Interim: " + baseline.getInterim());
        System.out.println("Fixed Cost: " + baseline.getFixedCost());

        // print timephased data of task baseline
        System.out.println("Number of timephased items: " + baseline.getTimephasedData().size());
        for(TimephasedData data : baseline.getTimephasedData())
        {
            System.out.println(" Uid: " + data.getUid());
            System.out.println(" Start: " + data.getStart());
            System.out.println(" Finish: " + data.getFinish());
        }

    }
}




