/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
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
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveDataToExcel.class);

        savingProjectAsXlsx(dataDir);

        savingProjectAsXml(dataDir);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void savingProjectAsXlsx(String dataDir) throws IOException {
        // Read the input Project file
        Project project = new Project(dataDir + "project5.mpp");

        // Save the Project as XLSX
        project.save(dataDir + "project1.xlsx", SaveFileFormat.Xlsx);
    }

    public static void savingProjectAsXml(String dataDir) throws IOException {
        Project project = new Project(dataDir + "project5.mpp");
        project.save(dataDir + "project5.xml", SaveFileFormat.Spreadsheet2003);
    }
}




