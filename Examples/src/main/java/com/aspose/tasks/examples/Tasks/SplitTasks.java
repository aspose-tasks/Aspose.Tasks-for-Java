/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.Asn;
import com.aspose.tasks.Calendar;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.ResourceAssignment;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.Task;
import com.aspose.tasks.Tsk;
import com.aspose.tasks.WorkContourType;
import com.aspose.tasks.examples.Utils;

public class SplitTasks {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SplitTasks.class);

        //Create new project
        Project splitTaskProject = new Project();

        //Get a standard calendar
        Calendar calendar = splitTaskProject.get(Prj.CALENDAR);

        //Set project's calendar settings
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2011, java.util.Calendar.MARCH, 15, 8, 0, 0);
        splitTaskProject.set(Prj.START_DATE, cal.getTime());
        cal.set(2011, java.util.Calendar.MARCH, 21, 17, 0, 0);
        splitTaskProject.set(Prj.FINISH_DATE, cal.getTime());

        // root task
        Task rootTask = splitTaskProject.getRootTask();
        rootTask.set(Tsk.NAME, "Root");

        //Add a new task
        Task taskToSplit = rootTask.getChildren().add("Task1");
        taskToSplit.set(Tsk.DURATION, splitTaskProject.getDuration(3));

        //Create a new resource assignment
        ResourceAssignment splitResourceAssignment = splitTaskProject.getResourceAssignments().add(taskToSplit, null);

        //Generate resource assignment timephased data
        splitResourceAssignment.timephasedDataFromTaskDuration(calendar);

        //Split the task into 3 parts.
        //Provide start date and finish date arguments to SplitTask method
        //These dates will be used for split
        //Set project's calendar settings
        cal = java.util.Calendar.getInstance();
        java.util.Calendar cal2 = java.util.Calendar.getInstance();

        cal.set(2011, java.util.Calendar.MARCH, 16, 8, 0, 0);
        cal2.set(2011, java.util.Calendar.MARCH, 16, 17, 0, 0);
        splitResourceAssignment.splitTask(cal.getTime(), cal2.getTime(), calendar);
        cal.set(2011, java.util.Calendar.MARCH, 18, 8, 0, 0);
        cal2.set(2011, java.util.Calendar.MARCH, 18, 17, 0, 0);
        splitResourceAssignment.splitTask(cal.getTime(), cal2.getTime(), calendar);
        splitResourceAssignment.set(Asn.WORK_CONTOUR, WorkContourType.Contoured);

        //Save the Project
        splitTaskProject.save(dataDir + "project.xml", SaveFileFormat.Xml);
    }
}




