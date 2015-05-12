/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.printingtaskwritingexceptions.java;

import com.aspose.tasks.*;

import java.util.List;

public class PrintingTaskWritingExceptions
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/printingtaskwritingexceptions/data/";

        Project prj = new Project(dataDir + "Project5.mpp");

	try
	{
	    prj.save("project.MPP", SaveFileFormat.MPP);
	}
	catch (TasksWritingException ex)
	{
	    System.out.println(ex.getLogText());
	}
    }
}




