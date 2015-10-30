/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.TaskLinks;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class IdentifyCrossProjectTasks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(IdentifyCrossProjectTasks.class);

        Project externalProject = new Project(dataDir + "External.mpp");

        Task externalTask = externalProject.getRootTask().getChildren().getByUid(4);
        //ID of the task in the external project
        System.out.println(externalTask.get(Tsk.ID).toString());
        //ID of the task in the original project
        System.out.println(externalTask.get(Tsk.EXTERNAL_ID).toString());

    }
}




