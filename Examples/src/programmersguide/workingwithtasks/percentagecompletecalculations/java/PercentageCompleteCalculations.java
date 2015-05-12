/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.percentagecompletecalculations.java;

import com.aspose.tasks.*;

public class PercentageCompleteCalculations
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/percentagecompletecalculations/data/";  

	Project project = new Project(dataDir + "Input.mpp");

	TaskCollection alTasks = project.getRootTask().getChildren();
	for (Task tsk:alTasks)
	{
            System.out.println(tsk.get(Tsk.PERCENT_COMPLETE));
            System.out.println(tsk.get(Tsk.PERCENT_WORK_COMPLETE).toString());
            System.out.println(tsk.get(Tsk.PHYSICAL_PERCENT_COMPLETE).toString());
	} 
    }
}




