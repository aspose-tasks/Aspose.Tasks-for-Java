/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.TaskBaselines1;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.util.ArrayList;
import java.util.List;

public class CreatingATaskBaseline
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreatingATaskBaseline.class);

        Project project = new Project();

        // Creating TaskBaseline:
        Task task = project.getRootTask().getChildren().add("Task");
        // set baseline for specified tasks
        List<Task> myList = new ArrayList<Task>();
        project.setBaseline(BaselineType.Baseline, (Iterable<Task>) myList);
        // or set baseline for the entire project
        project.setBaseline(BaselineType.Baseline);
        
        
    }
}




