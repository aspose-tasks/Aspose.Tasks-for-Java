/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects1;

import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

public class ReadPasswordProtectedFiles
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadPasswordProtectedFiles.class);

        Project prj = new Project(dataDir + "PassProtected2003.mpp", "pass");

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




