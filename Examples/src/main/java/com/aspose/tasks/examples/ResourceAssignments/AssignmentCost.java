/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.ResourceAssignments;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class AssignmentCost {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AssignmentCost.class);

        Project project = new Project(dataDir + "project.mpp");

        for (ResourceAssignment ra : project.getResourceAssignments()) {
            System.out.println(ra.get(Asn.COST));
            System.out.println(ra.get(Asn.ACWP));
            System.out.println(ra.get(Asn.BCWP));
            System.out.println(ra.get(Asn.BCWS));
        }
    }
}




