/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ReadGroupDefinitionData {
	public static void main(String[] args) {
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReadGroupDefinitionData.class);

		Project project = new Project(dataDir + "project.mpp"); // attached test project

		System.out.println("Task Groups Count: " + project.getTaskGroups().size());

		Group taskGroup = project.getTaskGroups().toList().get(1);
		System.out.println("Percent Complete:" + taskGroup.getName());
		System.out.println("Group Criteria count: " + taskGroup.getGroupCriteria().size());

		System.out.println("\n************* Retrieving Task Group's Criterion information *************");
		GroupCriterion criterion = taskGroup.getGroupCriteria().toList().get(0);
		System.out.println("Criterion Field: " + criterion.getField());
		System.out.println("Criterion GroupOn: " + criterion.getGroupOn());
		System.out.println("Criterion Cell Color: " + criterion.getCellColor());
		System.out.println("Criterion Pattern: " + criterion.getPattern());

		if (taskGroup == criterion.getParentGroup())
			System.out.println("Parent Group is equval to task Group.");

		System.out.println("\n*********** Retreivnig Criterion's Font Information ***********");
		System.out.println("Font Family Name: " + criterion.getFont().getFontFamily());
		System.out.println("Font Size: " + criterion.getFont().getSize());
		System.out.println("Font Style: " + criterion.getFont().getStyle());
		System.out.println("Ascending/Dscending: " + criterion.getAscending());
	}
}




