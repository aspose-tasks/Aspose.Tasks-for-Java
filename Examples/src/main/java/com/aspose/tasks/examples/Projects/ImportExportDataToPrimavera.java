/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.FileFormat;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectFileInfo;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

import java.io.IOException;

public class ImportExportDataToPrimavera {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ImportExportDataToPrimavera.class);

        importingprimaveraxml(dataDir);

        exportingprimaveraxml(dataDir);

        exportingprimaveraxer(dataDir);

        exportingprimaverampx(dataDir);
        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void importingprimaveraxml(String dataDir) {
        Project project = new Project(dataDir + "primavera1.xml");

        //read the project structure
        ProjectFileInfo info = Project.getProjectFileInfo(dataDir + "primavera1.xml");
        System.out.println(FileFormat.getName(FileFormat.class, info.getProjectFileFormat()));
    }

    public static void exportingprimaveraxml(String dataDir) throws IOException {
        Project project = new Project(dataDir + "Project.mpp");

        project.save(dataDir + "saved.xml", SaveFileFormat.PrimaveraP6Xml);
    }

    public static void exportingprimaveraxer(String dataDir) throws IOException {
        Project project = new Project(dataDir + "Project.mpp");

        project.save(dataDir + "saved.xer", SaveFileFormat.PrimaveraXer);
    }

    public static void exportingprimaverampx(String dataDir) throws IOException {
        Project project = new Project(dataDir + "Project.mpp");

        project.save(dataDir + "saved.mpx", SaveFileFormat.Mpx);
    }
}




