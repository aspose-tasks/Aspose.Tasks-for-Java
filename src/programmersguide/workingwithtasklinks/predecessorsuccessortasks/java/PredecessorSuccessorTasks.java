/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasklinks.predecessorsuccessortasks.java;

import com.aspose.tasks.*;

import java.util.List;

public class PredecessorSuccessorTasks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasklinks/predecessorsuccessortasks/data/";

        Project prj = new Project(dataDir + "Project.mpp");

        List<TaskLink> AllLinks= prj.getTaskLinks();
        for (int i = 0 ; i < AllLinks.size(); i++)
        {
            TaskLink tsklnk = (TaskLink) AllLinks.get(i);
            System.out.println("Predecessor " + tsklnk.getPredTask().getName());
            System.out.println("Successor " + tsklnk.getSuccTask().getName());
        }

    }
}




