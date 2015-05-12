/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.creatingtasks.java;

import com.aspose.tasks.*;

public class CreatingTasks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/creatingtasks/data/";

	Project project = new Project();
	Task task = project.getRootTask().getChildren().add("Summary1");
	Task subtask = task.getChildren().add("Subtask1");
        
    }
}




