/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.changeprogressoftask.java;

import com.aspose.tasks.*;

public class ChangeProgressOfTask
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/changeprogressoftask/data/";  

	Project project = new Project();
	System.out.println(project.getCalculationMode());

	Task task = project.getRootTask().getChildren().add("Task");
	task.set(Tsk.DURATION, project.getDuration(2));
	task.set(Tsk.PERCENT_COMPLETE, 50);
    }
}




