/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.tasksandcalendars.gettingtaskcalendar.java;

import com.aspose.tasks.*;

import java.util.List;

public class GettingTaskCalendar
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasks/tasksandcalendars/gettingtaskcalendar/data/";

        //create a project instance
        Project prj = new Project(dataDir + "project.mpp");

        //Declare ChildTasksCollector class object
        ChildTasksCollector collector = new ChildTasksCollector();

        //Use TaskUtils to get all children tasks in RootTask
        TaskUtils.apply(prj.getRootTask(), collector, 0);

        List<Task> tasks = collector.getTasks();
        int iSize = tasks.size();

        // Parse through all the collected tasks
        for(int i = 0 ; i < iSize; i++)
        {
            System.out.println(tasks.get(i).getCalendar().getName());
        }

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




