/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.writingtaskstoproject.java;

import com.aspose.tasks.*;

import java.util.List;

public class WritingTasksToProject
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/writingtaskstoproject/data/";

        Project prj = new Project();

        Task Task1 = prj.addTask("Task1");
        Task Task2 = prj.addTask("Task2");
        Task Task3 = prj.addTask("Task3");

        prj.save(dataDir + "Project.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




