/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import java.io.IOException;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class SaveAsCsvTextAndTemplate {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveAsCsvTextAndTemplate.class);
        SavingProjectAsCsv(dataDir);

        SavingProjectAsText(dataDir);

        SavingProjectAsTemplate(dataDir);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void SavingProjectAsCsv(String dataDir) throws IOException {
        Project project = new Project(dataDir + "project5.mpp");
        project.save(dataDir + "project5.csv", SaveFileFormat.Csv);
    }

    public static void SavingProjectAsText(String dataDir) throws IOException {
        Project project = new Project(dataDir + "project5.mpp");
        project.save(dataDir + "project5.txt", SaveFileFormat.Txt);
    }

    public static void SavingProjectAsTemplate(String dataDir) throws IOException {
        String projectName = dataDir + "Blank2010.mpp"; // any mpp file (here 2010 format used)
        Project project = new Project(projectName);
        ProjectFileInfo projectFileInfo = Project.getProjectFileInfo(dataDir + "Blank2010.mpp");

        if (FileFormat.MPP14 == projectFileInfo.getProjectFileFormat()) {
            System.out.println("Project file format is ok");
        }
        SaveTemplateOptions options = new SaveTemplateOptions();
        options.setRemoveActualValues(true);
        options.setRemoveBaselineValues(true);

        String templateName = "result.mpt";
        project.saveAsTemplate(templateName);

        ProjectFileInfo templateFileInfo = Project.getProjectFileInfo(templateName);
        if (FileFormat.MPT14 == templateFileInfo.getProjectFileFormat()) {
            System.out.println("Template FileFormat is ok");
        }
    }
}




