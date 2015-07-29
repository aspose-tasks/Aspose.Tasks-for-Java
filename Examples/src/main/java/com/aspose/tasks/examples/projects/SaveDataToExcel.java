/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.projects;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

import java.io.FileInputStream;

public class SaveDataToExcel
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveDataToExcel.class);

        savingprojectasxlsx();

	savingprojectasxml();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void savingprojectasxlsx()
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveDataToExcel.class);

        //Read the input Project file
        Project project = new Project(dataDir + "Project5.mpp");

        //Save the Project as XLSX
        project.save(dataDir + "Project1.XLSX", SaveFileFormat.XLSX);
        
    }

    public static void savingprojectasxml()
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveDataToExcel.class);

        Project project = new Project(dataDir + "Project5.mpp");
        project.save(dataDir + "Project5.xml", SaveFileFormat.Spreadsheet2003);
        
    }     
}




