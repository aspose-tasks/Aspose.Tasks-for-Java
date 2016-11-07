/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.examples.Utils;

import com.aspose.tasks.*;

public class TaskBudgetWorkAndCost {
	public static void main(String[] args) throws Exception {
		// ExStart: retrieve-task-budget-work-cost
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(TaskBudgetWorkAndCost.class);

		Project project = new Project(dataDir + "input.mpp");
		Task projSummary = project.getRootTask();

		System.out.println("projSummary.BudgetWork = " + projSummary.get(Tsk.BUDGET_WORK));
		System.out.println("projSummary.BudgetCost = " + projSummary.get(Tsk.BUDGET_COST));

		// Get resource by Uid
		Resource rsc = project.getResources().getByUid(1);

		// Display resource budget work
		System.out.println("Resource BudgetWork = " + rsc.get(Rsc.BUDGET_WORK));

		// Get next resource by Uid
		rsc = project.getResources().getByUid(2);

		// Display resource budget cost
		System.out.println("Resource BudgetCost = " + rsc.get(Rsc.BUDGET_COST));

		for (ResourceAssignment assn : projSummary.getAssignments()) {
			if (assn.get(Asn.RESOURCE).get(Rsc.TYPE) == ResourceType.Work)
				System.out.println("Assignment BudgetWork = " + assn.get(Asn.BUDGET_WORK));
			else
				System.out.println("Assignment BudgetCost = " + assn.get(Asn.BUDGET_COST));
		}
		// ExEnd: retrieve-task-budget-work-cost
	}
}
