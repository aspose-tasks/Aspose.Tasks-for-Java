/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.PrimaveraProjectInfo;
import com.aspose.tasks.PrimaveraXerReader;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

import java.util.List;

/**
 * Shows how to examine short projects' info from a Primavera XER file.
 */
public class ReadProjectInfosFromXerFile {
    public static void main(String[] args) {
        // The path to the documents' directory.
        String dataDir = Utils.getDataDir(ReadProjectInfosFromXerFile.class);

        //Read the MPP file.
        PrimaveraXerReader reader = new PrimaveraXerReader(dataDir + "MultiprojectWithExternal.xer");

        List<PrimaveraProjectInfo> projectInfos = reader.getProjectInfos();
        for (PrimaveraProjectInfo info : projectInfos) {
            System.out.printf("%d - '%s' - %b%n", info.getUid(), info.getName(), info.getExportFlag());
        }

        Project project = reader.loadProject(5494);

        System.out.printf("Loaded project '%s' with Uid %s", project.getName(), project.getUid());
    }
}
