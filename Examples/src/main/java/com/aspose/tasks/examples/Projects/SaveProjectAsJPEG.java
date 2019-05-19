package com.aspose.tasks.examples.Projects;

import java.io.IOException;

import com.aspose.tasks.ImageSaveOptions;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class SaveProjectAsJPEG {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		 // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveAsPdf.class);
        
        //ExStart: SaveProjectAsJPEG
		Project project = new Project(dataDir + "Homemoveplan.mpp");

		// in order to manipulate JPEG quality one can use ImageSaveOptions.JpegQuality property.
		// The allowed value range is 0..100.
		ImageSaveOptions options = new ImageSaveOptions(SaveFileFormat.JPEG);
		options.setJpegQuality(50);

		project.save(dataDir + "image_out.jpeg", options);
		//ExEnd: SaveProjectAsJPEG
	}

}
