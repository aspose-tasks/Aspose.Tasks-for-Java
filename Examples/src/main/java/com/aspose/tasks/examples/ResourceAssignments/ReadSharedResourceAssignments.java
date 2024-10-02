/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.ResourceAssignments;

import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.Rsc;
import com.aspose.tasks.examples.Utils;

public class ReadSharedResourceAssignments {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadSharedResourceAssignments.class);

        // ExStart: ReadSharedResourceAssignments
        // suppose `test.mpp` contains resource from resource pool and assignments from other projects
        Project project = new Project(dataDir + "ResourceCosts.mpp");
        Resource resource = project.getResources().getByUid(1);
        // Units are calculated using assignments from other projects.
        Double units = resource.get(Rsc.PEAK_UNITS);
        // ExEnd: ReadSharedResourceAssignments
    }
}
