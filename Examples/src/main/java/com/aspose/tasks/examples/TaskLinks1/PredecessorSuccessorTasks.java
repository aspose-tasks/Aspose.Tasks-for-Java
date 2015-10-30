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

public class PredecessorSuccessorTasks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(PredecessorSuccessorTasks.class);

        Project project = new Project(dataDir + "Input.mpp");
        TaskLinkCollection allinks= project.getTaskLinks();
        for(TaskLink tsklnk: allinks)
        {
        System.out.println("Predecessor " + tsklnk.getPredTask().get(Tsk.NAME));
        System.out.println("Successor " + tsklnk.getSuccTask().get(Tsk.NAME));
        }
    }
}




