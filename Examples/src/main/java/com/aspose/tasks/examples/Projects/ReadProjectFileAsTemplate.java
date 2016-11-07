package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

public class ReadProjectFileAsTemplate {
	public static void main(String[] args) {
		// ExStart: read-project-file-as-template
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReadProjectFileAsTemplate.class);
		// Create a project instance
		Project newProject = new Project(dataDir + "Project1.mpp");
		System.out.println("Project file generated Successfully");
		// ExEnd: read-project-file-as-template

	}

}
