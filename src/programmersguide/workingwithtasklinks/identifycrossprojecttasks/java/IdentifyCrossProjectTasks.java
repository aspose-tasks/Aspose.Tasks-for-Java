/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasklinks.identifycrossprojecttasks.java;

import com.aspose.tasks.*;

public class IdentifyCrossProjectTasks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasklinks/identifycrossprojecttasks/data/";

        Project externalProject = new Project(dataDir+ "project.mpp");

        Task externalTask = externalProject.getTaskByUid(5);
        if(externalTask != null)
        {
            //ID of the task in the external project
            System.out.println(externalTask.getId());
            //ID of the task in the original project
            System.out.println(externalTask.getExternalId());
        }
        
    }
}




