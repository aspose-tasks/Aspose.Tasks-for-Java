/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import java.util.List;

import com.aspose.tasks.PrimaveraXmlReader;
import com.aspose.tasks.PrimaveraXmlReadingOptions;
import com.aspose.tasks.PrimaveraXmlSaveOptions;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectFileInfo;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class ImportExportDataToPrimavera {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ImportExportDataToPrimavera.class);

		importingPrimaveraXML();
		
		importingPrimaveraMPX();
		exportingPrimaveraXML();
		exportingPrimaveraXER();
		exportingPrimaveraMPX();
		
		exportingPrimaveraXMLSaveOptions();
		// Display result of conversion.
		System.out.println("Process completed Successfully");
	}

	public static void importingPrimaveraXML() {
		// ExStart: import-data-from-primavera-xml-format
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ImportExportDataToPrimavera.class);
		Project project = new Project(dataDir + "Primavera1.xml");
		// read the project structure
		ProjectFileInfo info = Project.getProjectFileInfo("primavera1.xml");
		System.out.println(info.getProjectFileFormat());
		// ExEnd: import-data-from-primavera-xml-format

	}

	public static void importingPrimaveraMPX(){
		//ExStart: import-data-from-primavera-mpx-format 
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ImportExportDataToPrimavera.class);
		Project project = new Project(dataDir +"Primavera1.mpx");
		// read the project structure
		ProjectFileInfo info = Project.getProjectFileInfo("primavera1.mpx");
		System.out.println(info.getProjectFileFormat());
		//ExEnd: import-data-from-primavera-mpx-format 
	}
	
	public static void exportingPrimaveraXML() {
		// ExStart: export-data-to-primavera-xml-format
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ImportExportDataToPrimavera.class);
		Project project = new Project(dataDir + "Project.mpp");
		project.save(dataDir + "saved.xml", SaveFileFormat.PrimaveraP6XML);
		// ExEnd: export-data-to-primavera-xml-format
	}

	public static void exportingPrimaveraXER() {
		// ExStart: export-data-to-primavera-xer-format
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ImportExportDataToPrimavera.class);
		Project project = new Project(dataDir + "Project.mpp");
		project.save(dataDir + "saved.xer", SaveFileFormat.PrimaveraXER);
		// ExEnd: export-data-to-primavera-xer-format

	}

	public static void exportingPrimaveraMPX() {
		// ExStart: export-data-to-primavera-mpx-format
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ImportExportDataToPrimavera.class);
		Project project = new Project(dataDir + "Project.mpp");
		project.save(dataDir + "saved.mpx", SaveFileFormat.MPX);
		// ExEnd: export-data-to-primavera-mpx-format

	}
	
	public static void exportingPrimaveraXMLSaveOptions(){
		//ExStart: primavera-xml-save-options
		Project project = new Project("test.xml");
		PrimaveraXmlSaveOptions options = new PrimaveraXmlSaveOptions();
		options.setSaveRootTask(false);
		project.save("test1.xml",options);
		//ExEnd: primavera-xml-save-options
	}

	
	public static void readAllUIDPrimavera(){
		//ExStart: read-all-project-uid
		PrimaveraXmlReader reader = new PrimaveraXmlReader("primaveraXml.xml");
		List<Integer> listOpProjectUids = reader.getProjectUids();
		//ExEnd: read-all-project-uid
	}
	
	
	public static void readProjectWithSpecificUID(){
		//ExStart: read-project-specific-uid
		PrimaveraXmlReadingOptions options = new PrimaveraXmlReadingOptions();
		options.setProjectUid(4557);
		// returns project with special Uid
		Project project = new Project("PrimaveraXmlFile.xml",options); 
		//ExEnd: read-project-specific-uid
	}
	
	
}
