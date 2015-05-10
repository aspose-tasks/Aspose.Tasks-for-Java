/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtaskbaselines.baselinetaskscheduling.java;

import com.aspose.tasks.*;

import java.util.List;

public class BaselineTaskScheduling
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtaskbaselines/baselinetaskscheduling/data/";

        long OneSec = 10000000;//microsecond * 10
	long OneMin = 60 * OneSec;
	long OneHour = 60 * OneMin;

	Project project = new Project();
	// Creating TaskBaseline:
	Task task = project.getRootTask().getChildren().add("Task");
	project.setBaseline(BaselineType.Baseline);

	TaskBaseline baseline = task.getBaselines().toList().get(0);
	System.out.println(baseline.getDuration().toDouble()/OneHour + " Hours");
	System.out.println("Baseline Start: "  + baseline.getStart());
	System.out.println("Baseline Finish: " + baseline.getFinish());
    }
}




