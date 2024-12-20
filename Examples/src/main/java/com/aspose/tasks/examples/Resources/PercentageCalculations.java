/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
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

public class PercentageCalculations {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project prj = new Project(dataDir + "Software Development.mpp");
        for (Resource res : prj.getResources()) {
            if (res.get(Rsc.NAME) != null) {
                System.out.println(res.get(Rsc.PERCENT_WORK_COMPLETE));
            }
        }
    }
}




