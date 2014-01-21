/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.retrievingtaskinformation.java;

import com.aspose.tasks.*;

import java.util.List;

public class RetrievingTaskInformation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/retrievingtaskinformation/data/";

        //Open a project
        Project prj = new Project(dataDir + "project.mpp");

        ChildTasksCollector collector = new ChildTasksCollector();

        // Collect all the tasks from RootTask using TaskUtils
        TaskUtils.apply(prj.getRootTask(), collector, 0);

        //List tasks = collector.getTasks();
        List tasks = collector.getTasks();
        int count = tasks.size();

        //Display Tasks
        for(int i = 0 ; i < count; i++)
        {
            Task tsk = (Task) tasks.get(i);
            System.out.println("Task Name : " + tsk.getName() );
            System.out.println("Start : " + tsk.getStart().toString());
            System.out.println("Finish : " + tsk.getFinish().toString());
        }

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




