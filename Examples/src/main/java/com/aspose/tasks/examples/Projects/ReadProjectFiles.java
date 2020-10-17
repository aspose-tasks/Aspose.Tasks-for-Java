/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.tasks.examples.Projects;


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
        
        CheckIfProjectIsPasswordProtected(dataDir);
        ReadProjectAsTemplate(dataDir);
        ReadProjectFileFromStream(dataDir);
    }
    
    public static void CheckIfProjectIsPasswordProtected(String dataDir)
    {
    	//ExStart: CheckIfProjectIsPasswordProtected
    	ProjectFileInfo info = Project.getProjectFileInfo(dataDir + "project.mpp");
    	System.out.println("Is file password protected?:" + info.isPasswordProtected());
    	//ExEnd: CheckIfProjectIsPasswordProtected
    }
    public static void ReadProjectAsTemplate(String dataDir)
    {
    	// ExStart: ReadProjectAsTemplate
    	// For complete examples and data files, please go to https://github.com/aspose-tasks/Aspose.Tasks-for-Java
    	// Read existing project template file
    	Project project = new Project(dataDir + "ReadProjectFiles.mpt");
    	System.out.println("Name : " + project.get(Prj.NAME));
    	// ExEnd: ReadProjectAsTemplate
    }
    
    public static void ReadProjectFileFromStream(String dataDir)
    {
    	// ExStart: ReadProjectFiles
    	// For complete examples and data files, please go to https://github.com/aspose-tasks/Aspose.Tasks-for-Java
        try
        {
        	FileInputStream prjStream = new FileInputStream(dataDir + "Project1.mpp");
        	Project existingProject = new Project(prjStream);
        	prjStream.close();
        	
        	System.out.println("Calendar : " + existingProject.get(Prj.NAME));
        }
        catch(Exception ex)
        {
        	System.out.println(ex.getMessage());
        }
        // ExEnd: ReadProjectFiles
        // Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




