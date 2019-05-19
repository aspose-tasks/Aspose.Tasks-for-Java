package com.aspose.tasks.examples.Projects;

import java.io.IOException;

import com.aspose.tasks.MpdSettings;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class ReadingProjectDataFromMicrosoftAccessDatabase {
	// ExStart: ReadingProjectDataFromMicrosoftAccessDatabase
	public static void main(String[] args) throws IOException {
		// For complete examples and data files, please go to https://github.com/aspose-tasks/Aspose.Tasks-for-Java
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReadingProjectDatafromMicrosoftProjectDatabase.class);
		
		MpdSettings settings = new MpdSettings(getConnectionString(), 1);
		Project project = new Project(settings);
		project.save(dataDir + "Project1.xml", SaveFileFormat.XML);
	}
	
	private static String getConnectionString()
	{
	    return "jdbc:odbc:DRIVER=Microsoft Access Driver (*.mdb, *.accdb);DBQ=" + "mpdFile.mpd";
	}
	// ExEnd: ReadingProjectDataFromMicrosoftAccessDatabase
}
