/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasklinks.defininglinktype.java;

import com.aspose.tasks.*;

import java.util.List;

public class DefiningLinkType
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasklinks/defininglinktype/data/";

        Project project = new Project();

        Task tsk1 = new Task("Task1");
        Task tsk2 = new Task("Task2");
        TaskLink tsklnk1 = new TaskLink(tsk1, tsk2, TaskLinkType.FinishToStart);

        project.addTaskLink(tsklnk1);

        //ProjectWithResources2013Modified
        List AllLinks = project.getTaskLinks();
        for (int i = 0 ; i < AllLinks.size(); i++)
        {
            TaskLink tsklnk = (TaskLink) AllLinks.get(i);
            System.out.println(tsklnk.getLinkType());
        }


        project.save(dataDir + "Project.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




