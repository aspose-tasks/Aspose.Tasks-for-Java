/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.ResourceAssignments;

import com.aspose.tasks.Asn;
import com.aspose.tasks.Project;
import com.aspose.tasks.ResourceAssignment;
import com.aspose.tasks.examples.Utils;

public class AssignmentBudget {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project prj = new Project(dataDir + "project.mpp");

        for (ResourceAssignment ra : prj.getResourceAssignments()) {
            System.out.println(ra.get(Asn.BUDGET_COST));
            System.out.println(ra.get(Asn.BUDGET_WORK).toString());
        }
    }
}




