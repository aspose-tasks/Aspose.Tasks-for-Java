package com.aspose.tasks.examples.Projects;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class CreateEmptyProjectSaveStream {

	public static void main(String[] args) throws IOException {
		// ExStart: CreateEmptyProjectSaveStream
    	// For complete examples and data files, please go to https://github.com/aspose-tasks/Aspose.Tasks-for-Java
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateEmptyProjectFile.class);

        //Create a project instance
        Project newProject = new Project();

        // Create a file stream
        OutputStream projectStream = new FileOutputStream(dataDir + "EmptyProjectSaveStream_out.xml");
        
        newProject.save(projectStream, SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Project file generated Successfully");
        // ExEnd: CreateEmptyProjectSaveStream

	}

}
