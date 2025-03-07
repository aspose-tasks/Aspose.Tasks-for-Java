/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

public class ReadPasswordProtectedFiles {
    public static void main(String[] args) {
        // For complete examples and data files, please go to https://github.com/aspose-tasks/Aspose.Tasks-for-Java

        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project prj = new Project(dataDir + "PasswordProtected.mpp", "pass");

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




