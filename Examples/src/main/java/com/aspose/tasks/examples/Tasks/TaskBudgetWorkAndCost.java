/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.Asn;
import com.aspose.tasks.BackgroundPattern;
import com.aspose.tasks.Field;
import com.aspose.tasks.FontDescriptor;
import com.aspose.tasks.FontStyles;
import com.aspose.tasks.Group;
import com.aspose.tasks.GroupCriterion;
import com.aspose.tasks.GroupOn;
import com.aspose.tasks.MPPSaveOptions;
import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceAssignment;
import com.aspose.tasks.ResourceType;
import com.aspose.tasks.Rsc;
import com.aspose.tasks.Task;
import com.aspose.tasks.Tsk;
import com.aspose.tasks.examples.Utils;

public class TaskBudgetWorkAndCost {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "BudgetWorkAndCost.mpp");
        Task projSummary = project.getRootTask();

        System.out.println("projSummary.BudgetWork = " + projSummary.get(Tsk.BUDGET_WORK));
        System.out.println("projSummary.BudgetCost = " + projSummary.get(Tsk.BUDGET_COST));

        //Get resource by Uid
        Resource rsc = project.getResources().getByUid(2);

        //Display resource budget work
        System.out.println("Resource BudgetWork = " + rsc.get(Rsc.BUDGET_WORK));

        //Get next resource by Uid
        rsc = project.getResources().getByUid(2);

        //Display resource budget cost
        System.out.println("Resource BudgetCost = " + rsc.get(Rsc.BUDGET_COST));

        for (ResourceAssignment assn : projSummary.getAssignments()) {
            if (assn.get(Asn.RESOURCE).get(Rsc.TYPE) == ResourceType.Work) {
                System.out.println("Assignment BudgetWork = " + assn.get(Asn.BUDGET_WORK));
            } else {
                System.out.println("Assignment BudgetCost = " + assn.get(Asn.BUDGET_COST));
            }
        }
    }
}




