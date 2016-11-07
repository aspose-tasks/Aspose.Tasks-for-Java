/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.ResourceAssignments;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class AssignmentBudget {
	public static void main(String[] args) throws Exception {
		// ExStart: managing-assignment-budget
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(AssignmentBudget.class);

		Project prj = new Project(dataDir + "project5.mpp");

		for (ResourceAssignment ra : prj.getResourceAssignments()) {
			System.out.println(ra.get(Asn.BUDGET_COST));
			System.out.println(ra.get(Asn.BUDGET_WORK).toString());
		}

		// ExEnd: managing-assignment-budget

	}
}
