/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class WriteMPPProjectSummary {
	public static void main(String[] args) throws Exception {
		// ExStart: writing-mpp-project-summary
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(WriteMPPProjectSummary.class);

		Project project = new Project(dataDir + "project.mpp");

		// Set some summary information about the project
		project.set(Prj.AUTHOR, "Author");
		project.set(Prj.LAST_AUTHOR, "Last Author");
		project.set(Prj.REVISION, 15);
		project.set(Prj.KEYWORDS, "MSP Aspose");
		project.set(Prj.COMMENTS, "Comments");

		java.util.Calendar cal = java.util.Calendar.getInstance();
		cal.set(2014, 2, 15, 0, 0, 0);
		project.set(Prj.CREATION_DATE, cal.getTime());
		project.set(Prj.KEYWORDS, "MPP Aspose");
		cal.set(2014, 3, 16, 0, 0, 0);
		project.set(Prj.LAST_PRINTED, cal.getTime());

		// Save the Project back in MPP format
		project.save(dataDir + "MPPAspose.xml", SaveFileFormat.XML);

		// Display result of conversion.
		System.out.println("Process completed Successfully");

		// Reading Project Summary Information
		project = new Project(dataDir + "MPPAspose.xml");

		System.out.println("Author: " + project.get(Prj.AUTHOR));
		System.out.println(project.get(Prj.LAST_AUTHOR));
		System.out.println(project.get(Prj.REVISION));
		System.out.println(project.get(Prj.KEYWORDS));
		System.out.println(project.get(Prj.COMMENTS));

		System.out.println(project.get(Prj.CREATION_DATE).toString());
		System.out.println(project.get(Prj.KEYWORDS));
		System.out.println(project.get(Prj.LAST_PRINTED).toString());
		// ExEnd: writing-mpp-project-summary

	}
}
