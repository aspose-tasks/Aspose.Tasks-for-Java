/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.Resources1;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.math.BigDecimal;

public class WriteUpdatedResourceData
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(WriteUpdatedResourceData.class);
        
        String file = dataDir + "SampleNewMPP.mpp"; // Test file with one rsc to update
        // File to write test project
        String resultFile = dataDir + "OutputMPP.mpp";

        Project project = new Project(file);
        Resource rsc = project.getResources().add("Rsc");
        rsc.set(Rsc.STANDARD_RATE, BigDecimal.valueOf(30));
        rsc.set(Rsc.OVERTIME_RATE, BigDecimal.valueOf(45));
        rsc.set(Rsc.GROUP, "Workgroup1");

        //Save the Project
        project.save(resultFile, SaveFileFormat.MPP);
        
    }
}




