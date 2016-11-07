/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ActualProperties {
	public static void main(String[] args) throws Exception {
		// ExStart: reading-actual-properties
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ActualProperties.class);

		Project project = new Project(dataDir + "E - 1 Task.mpp");

		// Create a ChildTasksCollector instance
		ChildTasksCollector collector = new ChildTasksCollector();

		// Collect all the tasks from RootTask using TaskUtils
		TaskUtils.apply(project.getRootTask(), collector, 0);

		// Parse through all the collected tasks
		for (Task task : collector.getTasks()) {
			System.out.println("Task Name : " + task.get(Tsk.NAME));
			System.out.println("Actual Start: " + task.get(Tsk.ACTUAL_START).toString());
			System.out.println("Actual Finish: " + task.get(Tsk.ACTUAL_FINISH).toString());
			System.out.println("Actual Duration: " + task.get(Tsk.ACTUAL_DURATION).toString());
			System.out.println("Actual Cost: " + task.get(Tsk.ACTUAL_COST).toString());
			System.out.println("---------------------------------------------");
		}
		// ExEnd: reading-actual-properties

	}
}
