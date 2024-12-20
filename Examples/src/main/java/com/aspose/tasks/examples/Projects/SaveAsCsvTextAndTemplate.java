/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class SaveAsCsvTextAndTemplate {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        SavingProjectAsCsv(dataDir, outDir);

        SavingProjectAsText(dataDir, outDir);

        SavingProjectAsTemplate(dataDir, outDir);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void SavingProjectAsCsv(String dataDir, String outDir) {
        Project project = new Project(dataDir + "project5.mpp");
        project.save(outDir + "project5_out.csv", SaveFileFormat.Csv);
    }

    public static void SavingProjectAsText(String dataDir, String outDir) {
        Project project = new Project(dataDir + "project5.mpp");
        project.save(outDir + "project5_out.txt", SaveFileFormat.Txt);
    }

    public static void SavingProjectAsTemplate(String dataDir, String outDir) {
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
        project.saveAsTemplate(outDir + templateName);

        ProjectFileInfo templateFileInfo = Project.getProjectFileInfo(outDir + templateName);
        if (FileFormat.MPT14 == templateFileInfo.getProjectFileFormat()) {
            System.out.println("Template FileFormat is ok");
        }
    }
}




