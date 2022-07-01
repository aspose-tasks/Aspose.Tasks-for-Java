/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class CreateEmptyProjectFile {
    public static void main(String[] args) throws Exception {
        // ExStart: CreateEmptyProjectFile
        // For complete examples and data files, please go to https://github.com/aspose-tasks/Aspose.Tasks-for-Java
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateEmptyProjectFile.class);

        // Create a project instance
        Project newProject = new Project();

        newProject.save(dataDir + "Project1.xml", SaveFileFormat.Xml);

        //Display result of conversion.
        System.out.println("Project file generated Successfully");
        // ExEnd: CreateEmptyProjectFile
    }
}




