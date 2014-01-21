/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.readingandwritinggeneralproperties.gettinggeneralproperties.java;

import com.aspose.tasks.*;

import java.util.List;

public class GettingGeneralProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasks/readingandwritinggeneralproperties/gettinggeneralproperties/data/";

        Project prj = new Project(dataDir + "project.mpp");

        // Create a ChildTasksCollector instance
        ChildTasksCollector collector = new ChildTasksCollector();

        // Collect all the tasks from RootTask using TaskUtils
        TaskUtils.apply(prj.getRootTask(), collector, 0);

        List tasks = collector.getTasks();
        int iSize = tasks.size();

        // Parse through all the collected tasks
        for(int i = 0 ; i < iSize; i++)
        {
            Task tsk = (Task)tasks.get(i);
            System.out.println("Id = " + tsk.getId());
            System.out.println("Uid = " + tsk.getUid());
            System.out.println("Name = " + tsk.getName());
            System.out.println("Start = " + tsk.getStart());
            System.out.println("Stop = " + tsk.getStart());
        }

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




