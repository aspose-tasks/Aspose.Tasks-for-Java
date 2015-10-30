/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.Tasks1;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class TaskDurationInDifferentUnits
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(TaskDurationInDifferentUnits.class);;

        // Read MS Project template file
        String fileName = dataDir + "SampleProject.mpp";

        //Read the input file as Project
        Project project = new Project(fileName);

        //Get a task to calculate its duration in different formats
        Task task = project.getRootTask().getChildren().getById(1);

        //Get the duration in Minutes
        double mins = task.get(Tsk.DURATION).convert(TimeUnitType.Minute).toDouble();
        //Get the duration in Days
        double days = task.get(Tsk.DURATION).convert(TimeUnitType.Day).toDouble();
        //Get the duration in Hours
        double hours =  task.get(Tsk.DURATION).convert(TimeUnitType.Hour).toDouble();
        //Get the duration in Weeks
        double weeks = task.get(Tsk.DURATION).convert(TimeUnitType.Week).toDouble();
        //Get the duration in Months
        double months = task.get(Tsk.DURATION).convert(TimeUnitType.Month).toDouble();
 
    }
}




