/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.handlingtaskconstraints.gettingconstraints.java;

import com.aspose.tasks.*;

import java.io.FileInputStream;

public class GettingConstraints
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasks/handlingtaskconstraints/gettingconstraints/data/";

        ProjectReader projectReader = new ProjectReader();
        Project prj = null;
        FileInputStream prjStream = null;
        try
        {
            prjStream = new FileInputStream(dataDir + "Project.mpp");
            prj = projectReader.read(prjStream);
            prjStream.close();
        }
        catch(Exception ex)
        {

        }

        // Create a ChildTasksCollector instance
        ChildTasksCollector collector = new ChildTasksCollector();

        // Collect all the tasks from RootTask using TaskUtils
        TaskUtils.apply(prj.getRootTask(), collector, 0);

        // Parse through all the collected tasks
        for(int i = 0 ; i < collector.getTasks().size(); i++)
        {
            Task tsk = collector.getTasks().get(i);
            if (tsk.getConstraintDate().toString() == "1/1/2000")
                System.out.println("NA");
            else
                System.out.println(tsk.getConstraintDate().toString());
            System.out.println(tsk.getConstraintType());

        }


        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




