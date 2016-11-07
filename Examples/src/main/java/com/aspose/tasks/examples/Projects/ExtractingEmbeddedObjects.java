/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import java.io.File;
import java.io.FileOutputStream;

import com.aspose.tasks.OleObject;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

public class ExtractingEmbeddedObjects {
	public static void main(String[] args) throws Exception {
		// ExStart: extracting-embedded-objects
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ExtractingEmbeddedObjects.class);
		Project project = new Project(dataDir + "EmbeddedFile.mpp");
		OleObject ole = project.getOleObjects().toList().get(0);

		// we have to check this property because it can be null if the embedded
		// object was created inside the ms project application
		// Or, alternatively, you can use this check: if (ole.FileFormat ==
		// "Package")
		// if (!string.IsNullOrEmpty(ole.FullPath))
		if (ole.getFileFormat().equals("Package")) {

			File file = new File(dataDir);
			FileOutputStream fop = new FileOutputStream(file);
			// get the content in bytes
			byte[] contentInBytes = ole.getContent();

			fop.write(contentInBytes);
			fop.flush();
			fop.close();
		}

		// ExEnd: extracting-embedded-objects

	}

}
