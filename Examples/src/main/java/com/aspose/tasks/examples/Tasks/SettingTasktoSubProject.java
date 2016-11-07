/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.Task;
import com.aspose.tasks.Tsk;
import com.aspose.tasks.examples.Utils;

public class SettingTasktoSubProject {
	public static void main(String[] args) throws Exception {
		
		// ExStart: set-task-to-sub-project
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RenderTaskUsage.class);

		Project project = new Project(dataDir + "New Project 2010.mpp");

		Task task = project.getRootTask().getChildren().add("Task 1");

		// setting new subproject link
		task.set(Tsk.SUBPROJECT_NAME, dataDir +"NewProductDev.mpp");

		// you can see the result in the attached screenshot
		project.save("Link.mpp", SaveFileFormat.MPP);
		
		// ExEnd: set-task-to-sub-project

	}
}
