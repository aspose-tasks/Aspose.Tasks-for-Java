/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import java.io.IOException;

import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class SaveDataToExcel {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        savingProjectAsXlsx(dataDir, outDir);

        savingProjectAsXml(dataDir, outDir);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void savingProjectAsXlsx(String dataDir, String outDir) {
        // Read the input Project file
        Project project = new Project(dataDir + "project5.mpp");

        // Save the Project as XLSX
        project.save(outDir + "project1_out.xlsx", SaveFileFormat.Xlsx);
    }

    public static void savingProjectAsXml(String dataDir, String outDir) {
        Project project = new Project(dataDir + "project5.mpp");
        project.save(outDir + "project5_out.xml", SaveFileFormat.Spreadsheet2003);
    }
}




