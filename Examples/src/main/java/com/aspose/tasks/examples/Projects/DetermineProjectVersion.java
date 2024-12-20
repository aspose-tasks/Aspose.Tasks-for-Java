/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

public class DetermineProjectVersion {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "input.xml");

        //Display project version property
        System.out.println("Project Version : " + project.get(Prj.SAVE_VERSION));
        System.out.println("Last Saved : " + project.get(Prj.LAST_SAVED));

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




