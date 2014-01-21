/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.retrievingtasklinks.java;

import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.Task;
import com.aspose.tasks.TaskLink;

import java.util.List;

public class RetrievingTaskLinks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/retrievingtasklinks/data/";

        //create a prject instance
        Project prj = new Project(dataDir + "project.mpp");

        List Links = prj.getTaskLinks();

        for(int i = 0 ; i < Links.size(); i++)
        {
            TaskLink taskLink = (TaskLink)Links.get(i);

            System.out.println("Pred Task : " + taskLink.getPredTask().getName());
            System.out.println("Succ Task : " + taskLink.getSuccTask().getName());
        }

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




