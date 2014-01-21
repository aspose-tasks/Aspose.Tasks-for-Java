/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.addingandremovingtasklinks.java;

import com.aspose.tasks.*;

import java.util.List;

public class AddingAndRemovingTaskLinks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/addingandremovingtasklinks/data/";

        Project prj = new Project(dataDir + "project.mpp");

        //remove existing task links
        List Links = prj.getTaskLinks();

        for(int i = 0 ; i < Links.size(); i++)
        {
            prj.removeLink((TaskLink)Links.get(i));
        }

        Task tsk1 = prj.addTask("Task 1");
        Task tsk2 = prj.addTask("Task 2");
        TaskLink newLink = new TaskLink(tsk1, tsk2, TaskLinkType.FinishToStart);
        prj.addTaskLink(newLink);

        tsk1.setStart(java.util.Calendar.getInstance().getTime());
        tsk2.setStart(java.util.Calendar.getInstance().getTime());

        java.util.Calendar c = java.util.Calendar.getInstance();
        c.setTime(tsk1.getStart());
        c.add(java.util.Calendar.DATE, 1);
        tsk1.setFinish(c.getTime());

        c.setTime(tsk2.getStart());
        c.add(java.util.Calendar.DATE, 1);
        tsk2.setFinish(c.getTime());

        prj.save(dataDir + "project.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




