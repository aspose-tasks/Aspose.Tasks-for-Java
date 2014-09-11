/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtaskbaselines.taskbaselineduration.java;

import com.aspose.tasks.*;

import java.util.List;

public class TaskBaselineDuration
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtaskbaselines/taskbaselineduration/data/";
        long OneSec = 10000000;//microsecond * 10
        long OneMin = 60 * OneSec;
        long OneHour = 60 * OneMin;
        Project prj = new Project(dataDir+ "project.mpp");
        List<TaskBaseline> alB = (List<TaskBaseline>) prj.getRootTask().getChildren().get(0).getBaseline();
        for (int i = 0 ; i < alB.size(); i++)
        {
            TaskBaseline  tskBln = (TaskBaseline) alB.get(i);
            System.out.println(tskBln.getDuration()/OneHour + " Hours");
        }
        
    }
}




