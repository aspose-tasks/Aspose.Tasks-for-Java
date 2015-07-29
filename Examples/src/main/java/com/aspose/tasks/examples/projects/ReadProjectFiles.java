/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.tasks.examples.projects;


import com.aspose.tasks.*;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

import java.io.FileInputStream;

public class ReadProjectFiles
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadProjectFiles.class);

       		Project existingProject = null;
            FileInputStream prjStream = null;
            try
            {
                prjStream = new FileInputStream(dataDir + "Project1.mpp");
                existingProject = new Project(prjStream);
                prjStream.close();
            }
            catch(Exception ex)
            {

            }
            System.out.println("Calendar : " + existingProject.get(Prj.NAME));

            //Display result of conversion.
            System.out.println("Process completed Successfully");
    }
}




