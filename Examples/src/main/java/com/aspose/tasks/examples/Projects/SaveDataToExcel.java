/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class SaveDataToExcel {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SaveDataToExcel.class);

		savingprojectasxlsx();

		savingprojectasxml();

		// Display result of conversion.
		System.out.println("Process completed Successfully");
	}

	public static void savingprojectasxlsx() {
		// ExStart: saving-project-to-xlsx
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SaveDataToExcel.class);

		// Read the input Project file
		Project project = new Project(dataDir + "Project5.mpp");

		// Save the Project as XLSX
		project.save(dataDir + "Project1.XLSX", SaveFileFormat.XLSX);

		// ExEnd: saving-project-to-xlsx

	}

	public static void savingprojectasxml() {
		// ExStart: saving-project-to-spreadsheet2003
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SaveDataToExcel.class);
		Project project = new Project(dataDir + "Project5.mpp");
		project.save(dataDir + "Project5.xml", SaveFileFormat.Spreadsheet2003);

		// ExEnd: saving-project-to-spreadsheet2003

	}
}
