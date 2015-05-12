/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.miscellaneous.handlingexceptions.java;

import com.aspose.tasks.*;

public class HandlingExceptions
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/miscellaneous/handlingexceptions/data/";

        Project project;
	try
	{
	project = new Project(dataDir + "ProjectWithException.mpp");
	}
	catch (TasksReadingException ex)
	{
    	System.out.println("Message:");
    	System.out.println(ex.getMessage());
    	System.out.println("Log:");
    	System.out.println(ex.getLogText());

    	if (ex.getCause() != null)
    	{
    	System.out.println("Inner exception message:");
    	System.out.println(ex.getCause().getMessage());
    	}

	}
	catch (Exception e)
	{
    	System.out.println(e.getMessage());
	}
        
    }
}




