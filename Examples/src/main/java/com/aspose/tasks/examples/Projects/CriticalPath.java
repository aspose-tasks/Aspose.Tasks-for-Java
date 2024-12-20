/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class CriticalPath {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "New project 2013.mpp");
        project.setCalculationMode(CalculationMode.Automatic);

        Task subtask1 = project.getRootTask().getChildren().add("1");
        Task subtask2 = project.getRootTask().getChildren().add("2");
        Task subtask3 = project.getRootTask().getChildren().add("3");

        project.getTaskLinks().add(subtask1, subtask2, TaskLinkType.FinishToStart);

        //Display the critical path now
        for (Task task : project.getCriticalPath()) {
            System.out.println(task.get(Tsk.NAME));
        }

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




