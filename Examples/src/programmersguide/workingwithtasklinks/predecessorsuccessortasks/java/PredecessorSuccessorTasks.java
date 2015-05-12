/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasklinks.predecessorandsuccessortasks.java;

import com.aspose.tasks.*;

import java.util.List;

public class PredecessorAndSuccessorTasks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasklinks/predecessorandsuccessortasks/data/";

        Project project = new Project(dataDir + "Input.mpp");
	TaskLinkCollection allinks= project.getTaskLinks();
	for(TaskLink tsklnk: allinks)
	{
  	System.out.println("Predecessor " + tsklnk.getPredTask().get(Tsk.NAME));
  	System.out.println("Successor " + tsklnk.getSuccTask().get(Tsk.NAME));
	}
    }
}




