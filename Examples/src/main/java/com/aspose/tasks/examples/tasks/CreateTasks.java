/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.tasks;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class CreateTasks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateTasks.class);

        Project project = new Project();
        Task task = project.getRootTask().getChildren().add("Summary1");
        Task subtask = task.getChildren().add("Subtask1");
        
    }
}




