/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.addremovetasks.java;

import com.aspose.tasks.*;

import java.io.FileOutputStream;
import java.util.Date;
import java.util.List;

public class AddRemoveTasks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/addremovetasks/data/";

        Project prj = new Project(dataDir + "Project.mpp");
        List children = prj.getRootTask().getChildren();
        //Before removing task
        System.out.println("Before Removing Task");
        for(int i = 0 ; i < children.size(); i++)
        {
            Task tsk = (Task)children.get(i);
            System.out.println("Task Name = " + tsk.getName());
            System.out.println("Task Start = " + tsk.getStart());
            System.out.println("Task End = " + tsk.getFinish());
        }

        if(prj.getRootTask().getChildren().size() > 1)
            prj.getRootTask().getChildren().remove(0);

        //Task tskADD = new Task("Added");
        Task tskADD = prj.addTask();
        tskADD.setName("Added Task");
        Date curDate = java.util.Calendar.getInstance().getTime();
        tskADD.setStart(curDate);

        java.util.Calendar c = java.util.Calendar.getInstance();
        c.setTime(curDate);
        c.add(java.util.Calendar.DATE, 1);
        Date newDate = c.getTime();
        tskADD.setFinish(newDate);

        System.out.println("_______________________________________");
        System.out.println("After Removing and adding Task");
        for(int i = 0 ; i < children.size(); i++)
        {
            Task tsk = (Task)children.get(i);
            System.out.println("Task Name = " + tsk.getName());
            System.out.println("Task Start = " + tsk.getStart());
            System.out.println("Task End = " + tsk.getFinish());
        }

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




