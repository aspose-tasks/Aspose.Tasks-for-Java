/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.TaskLinks1;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class CreateTaskLink
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateTaskLink.class);

       	Project project = new Project();
        Task pred = project.getRootTask().getChildren().add("Task 1");
        Task succ = project.getRootTask().getChildren().add("Task 2");
        TaskLink link = project.getTaskLinks().add(pred, succ);

        //Display result of conversion.
        System.out.println("Process completed Successfully");

    }
}




