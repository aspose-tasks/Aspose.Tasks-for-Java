/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.PrimaveraProjectInfo;
import com.aspose.tasks.PrimaveraXmlReader;
import com.aspose.tasks.examples.Utils;

import java.util.List;

/**
 * Shows how to examine short projects' info from a Primavera XML file.
 */
public class ReadProjectInfosFromXmlFile {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        //Read the MPP file.
        PrimaveraXmlReader reader = new PrimaveraXmlReader(dataDir + "MultiprojectWithExternal.xml");

        List<PrimaveraProjectInfo> projectInfos = reader.getProjectInfos();
        for (PrimaveraProjectInfo info : projectInfos) {
            System.out.printf("%d - '%s' - %b%n", info.getUid(), info.getName(), info.getExportFlag());
        }
    }
}
