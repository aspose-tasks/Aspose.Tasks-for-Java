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

public class CalculatePercentages {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "ResourceAssignmentVariance.mpp");

        for (ResourceAssignment ra : project.getResourceAssignments()) {
            System.out.println(ra.get(Asn.PERCENT_WORK_COMPLETE).toString());
        }
    }
}




