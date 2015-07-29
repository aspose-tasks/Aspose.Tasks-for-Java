/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.util.List;

public class PrintTaskWritingExceptions
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(PrintTaskWritingExceptions.class);

        Project prj = new Project(dataDir + "Project5.mpp");

	try
	{
	    prj.save(dataDir + "project.MPP", SaveFileFormat.MPP);
	}
	catch (TasksWritingException ex)
	{
	    System.out.println(ex.getLogText());
	}
    }
}




