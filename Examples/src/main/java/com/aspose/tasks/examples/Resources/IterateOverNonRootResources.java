/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Resources;

import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.Rsc;
import com.aspose.tasks.examples.Utils;

public class IterateOverNonRootResources {
    public static void main(String[] args) {
        // Shows how to use IsRoot property to skip root resource.

        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ResourceCost.class);

        Project prj = new Project(dataDir + "ResourceCosts.mpp");
        for (Resource res : prj.getResources()) {
            if (res.isRoot()) {
                continue;
            }
            System.out.println(res.get(Rsc.NAME));
        }
    }
}