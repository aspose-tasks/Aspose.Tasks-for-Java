/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.ChildTasksCollector;
import com.aspose.tasks.Project;
import com.aspose.tasks.Task;
import com.aspose.tasks.TaskUtils;
import com.aspose.tasks.Tsk;

public class OutlineProperties {
	public static void main(String[] args) throws Exception {
		//ExStart: getting-outline-properties
		Project project = new Project("Input.mpp");

		// Create a ChildTasksCollector instance
		ChildTasksCollector collector = new ChildTasksCollector();

		// Collect all the tasks from RootTask using TaskUtils
		TaskUtils.apply(project.getRootTask(), collector, 0);

		// Parse through all the collected tasks
		for (Task tsk : collector.getTasks()) {
			System.out.println(tsk.get(Tsk.OUTLINE_LEVEL));
			System.out.println(tsk.get(Tsk.OUTLINE_NUMBER));
		}
		
		//ExEnd: getting-outline-properties

	}
}
