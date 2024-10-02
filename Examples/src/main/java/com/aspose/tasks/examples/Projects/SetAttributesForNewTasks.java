/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.TaskStartDateType;
import com.aspose.tasks.examples.Utils;

public class SetAttributesForNewTasks {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SetAttributesForNewTasks.class);

        //create a prject instance
        Project prj = new Project();

        //set new task property
        prj.set(Prj.NEW_TASK_START_DATE, TaskStartDateType.CurrentDate);

        //save the project in XML format
        prj.save(dataDir + "project1.xml", SaveFileFormat.Xml);

        //Display result of conversion.
        System.out.println("Project file generated Successfully");
    }
}




