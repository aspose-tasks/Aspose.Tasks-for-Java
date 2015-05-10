/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.verifyingprojectstructure.java;

import com.aspose.tasks.*;

import java.util.List;

public class VerifyingProjectStructure
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/verifyingprojectstructure/data/";

        Project prj = new Project(dataDir + "test.txt");
	if(prj.check())
	{
		System.out.println("Project is ok");
	}
	else
	{
		System.out.println("Project is not ok");
	}
    }
}




