/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.Task;
import com.aspose.tasks.Tsk;
import com.aspose.tasks.examples.Utils;

import java.util.Calendar;

public class MppFileUpdate {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(MppFileUpdate.class);

        //Read an existing project
        Project project = new Project(dataDir + "SampleMSP2010.mpp");

        //create a new task
        Task task = project.getRootTask().getChildren().add("Task1");
        //set start date
        java.util.Calendar cal = java.util.Calendar.getInstance();

        cal.set(2012, Calendar.JULY, 1, 8, 0, 0);
        task.set(Tsk.START, cal.getTime());

        cal.set(2012, Calendar.JULY, 1, 17, 0, 0);
        task.set(Tsk.FINISH, cal.getTime());

        //Save the project as MPP project file
        project.save(dataDir + "AfterLinking.mpp", SaveFileFormat.Mpp);
        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




