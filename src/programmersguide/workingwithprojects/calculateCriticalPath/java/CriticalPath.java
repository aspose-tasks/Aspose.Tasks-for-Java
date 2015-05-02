/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.criticalPath.java;

import com.aspose.tasks.*;

import java.util.List;

public class CriticalPath
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/criticalPath/data/";

		Project project = new Project(dataDir + "New project 2010.mpp");
		project.setCalculationMode(CalculationMode.Automatic);

		Task subtask1 = project.getRootTask().getChildren().add("1");
		Task subtask2 = project.getRootTask().getChildren().add("2");
		Task subtask3 = project.getRootTask().getChildren().add("3");

		project.getTaskLinks().add(subtask1, subtask2, TaskLinkType.FinishToStart);

		//Display the critical path now
		for(Task task:project.getCriticalPath())
		{
		    System.out.println(task.get(Tsk.NAME));
		}

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




