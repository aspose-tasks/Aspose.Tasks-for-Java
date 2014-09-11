/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.definingroottask.java;

import com.aspose.tasks.*;

import java.util.List;

public class DefiningRootTask
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/definingroottask/data/";

        //Create a project instance
        Project prj = new Project();

        //Define a Task and set it as Root Task
        Task rootTsk = new Task();
        prj.setRootTask(rootTsk);

        java.util.Calendar cal = java.util.Calendar.getInstance();

        //Define Tasks
        Task tsk1 = new Task("Task1");
        tsk1.setStart(cal.getTime());
        Task tsk2 = new Task("Task2");
        tsk2.setStart(cal.getTime());

        //Add tsk1 and tsk2 to the rootTsk
        rootTsk.getChildren().add(tsk1);
        rootTsk.getChildren().add(tsk2);

        // Create a ChildTasksCollector instance
        ChildTasksCollector collector = new ChildTasksCollector();

        // Collect all the tasks from RootTask using TaskUtils
        TaskUtils.apply(prj.getRootTask(), collector, 0);

        List<Task> allTasks = collector.getTasks();
        // Parse through all the collected tasks
        for(int i = 0 ; i < allTasks.size(); i++)
        {
            //Display tasks
            Task tsk = allTasks.get(i);
            System.out.println("" + tsk.getName());
        }
        prj.save(dataDir + "project.xml", SaveFileFormat.XML);
        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




