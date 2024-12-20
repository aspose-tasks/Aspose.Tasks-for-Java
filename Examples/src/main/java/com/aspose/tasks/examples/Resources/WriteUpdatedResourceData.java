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
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

import java.math.BigDecimal;

public class WriteUpdatedResourceData {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        String file = dataDir + "ResourceWithExtAttribs.xml"; // Test file with one rsc to update
        // File to write test project
        String resultFile = outDir + "OutputMPP.mpp";

        Project project = new Project(file);
        Resource rsc = project.getResources().add("Rsc");
        rsc.set(Rsc.STANDARD_RATE, BigDecimal.valueOf(30));
        rsc.set(Rsc.OVERTIME_RATE, BigDecimal.valueOf(45));
        rsc.set(Rsc.GROUP, "Workgroup1");

        //Save the Project
        project.save(resultFile, SaveFileFormat.Mpp);
    }
}




