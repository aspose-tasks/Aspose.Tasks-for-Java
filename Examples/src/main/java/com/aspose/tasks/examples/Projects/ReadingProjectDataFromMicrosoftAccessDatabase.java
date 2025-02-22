/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.MpdSettings;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class ReadingProjectDataFromMicrosoftAccessDatabase {
    public static void main(String[] args) {
        // For complete examples and data files, please go to https://github.com/aspose-tasks/Aspose.Tasks-for-Java

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        MpdSettings settings = new MpdSettings(getConnectionString(), 1);
        Project project = new Project(settings);
        project.save(outDir + "project1.xml", SaveFileFormat.Xml);
    }

    private static String getConnectionString() {
        return "jdbc:odbc:DRIVER=Microsoft Access Driver (*.mdb, *.accdb);DBQ=" + "mpdFile.mpd";
    }
}
