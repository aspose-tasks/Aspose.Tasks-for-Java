/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
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
	Task pred = project.getRootTask().getChildren().add("Task 1");
	Task succ = project.getRootTask().getChildren().add("Task 2");
	TaskLink link = project.getTaskLinks().add(pred, succ);
        //Display result of conversion.
        System.out.println("Process completed Successfully");

    }
}




