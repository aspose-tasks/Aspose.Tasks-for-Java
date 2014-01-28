/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasklinks.creatingatasklink.java;

import com.aspose.tasks.*;

public class CreatingATaskLink
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasklinks/creatingatasklink/data/";

        Project project = new Project();

        Task tsk1 = new Task("Task1");
        Task tsk2 = new Task("Task2");
        TaskLink tsklnk = new TaskLink(tsk1, tsk2, TaskLinkType.FinishToStart);

        project.addTaskLink(tsklnk);

        project.save(dataDir + "Project.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");

    }
}




