/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

public class ReadProjectFiles {
	public static void main(String[] args) throws Exception {
		// ExStart: reading-a-project-file
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReadProjectFiles.class);
		Project existingProject = null;
		try {
			existingProject = new Project(dataDir + "Project1.xml");
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		System.out.println("Calendar : " + existingProject.get(Prj.NAME));
		// Display result of conversion.
		System.out.println("Process completed Successfully");
		// ExEnd: reading-a-project-file
	}
}
