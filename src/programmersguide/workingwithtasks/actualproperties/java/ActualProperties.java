/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.actualproperties.java;

import com.aspose.tasks.*;

import java.util.List;

public class ActualProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasks/actualproperties/data/";

        Project project = new Project(dataDir + "project.mpp");

        // Create a ChildTasksCollector instance
        ChildTasksCollector collector = new ChildTasksCollector();

        //Use TaskUtils to get all children tasks in RootTask
        TaskUtils.apply(project.getRootTask(), collector, 0);

        List<Task> tasks = collector.getTasks();
        int iSize = tasks.size();

        // Parse through all the collected tasks
        for(int i = 0 ; i < iSize; i++)
        {
            Task task = (Task) tasks.get(i);
            System.out.println("Task Name : " + task.getName());
            System.out.println("Actual Start: " + task.getActualStart());
            System.out.println("Actual Finish: " + task.getActualFinish());
            System.out.println("Actual Duration: " + task.getActualDuration());
            System.out.println("Actual Cost: " + task.getActualCost());
            System.out.println("---------------------------------------------");
        }

    }
}




