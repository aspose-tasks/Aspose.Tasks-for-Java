/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectFileInfo;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class ImportExportDataToPrimavera
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ImportExportDataToPrimavera.class);

        importingprimaveraxml();

        exportingprimaveraxml();

        exportingprimaveraxer();

        exportingprimaverampx();
        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void importingprimaveraxml()
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ImportExportDataToPrimavera.class);


        Project project = new Project(dataDir + "Primavera1.xml");

        //read the project structure
        ProjectFileInfo info = Project.getProjectFileInfo("primavera1.xml");
        System.out.println(info.getProjectFileFormat());
        
    }

    public static void exportingprimaveraxml()
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ImportExportDataToPrimavera.class);

        Project project = new Project(dataDir + "Project.mpp");

	    project.save(dataDir + "saved.xml", SaveFileFormat.PrimaveraP6XML);
    }    

    public static void exportingprimaveraxer()
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ImportExportDataToPrimavera.class);

        Project project = new Project(dataDir + "Project.mpp");

        project.save(dataDir + "saved.xer", SaveFileFormat.PrimaveraXER);

    }  
   
    public static void exportingprimaverampx()
    {
        // The path to the documents directory.
        String dataDir =  Utils.getDataDir(ImportExportDataToPrimavera.class);

        Project project = new Project(dataDir + "Project.mpp");

        project.save(dataDir + "saved.mpx", SaveFileFormat.MPX);
    
    }

 
}




