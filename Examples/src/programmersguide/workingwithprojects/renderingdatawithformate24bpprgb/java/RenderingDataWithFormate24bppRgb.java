/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.renderingdatawithformate24bpprgb.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class RenderingDataWithFormate24bppRgb
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/renderingdatawithformate24bpprgb/data/";
	
	Project project = new Project(dataDir + "file.mpp");
	ImageSaveOptions options = new ImageSaveOptions(SaveFileFormat.TIFF);
	options.setHorizontalResolution(72);
	options.setVerticalResolution(72);
	options.setPixelFormat(PixelFormat.Format24bppRgb);
	project.save("resFile.tif", options);    	        
    }
}




