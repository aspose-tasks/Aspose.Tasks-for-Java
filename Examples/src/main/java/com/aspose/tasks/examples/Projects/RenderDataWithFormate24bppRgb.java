/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class RenderDataWithFormate24bppRgb
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RenderDataWithFormate24bppRgb.class);
	
        Project project = new Project(dataDir + "file.mpp");
        ImageSaveOptions options = new ImageSaveOptions(SaveFileFormat.TIFF);
        options.setHorizontalResolution(72);
        options.setVerticalResolution(72);
        options.setPixelFormat(PixelFormat.Format24bppRgb);
        project.save(dataDir + "resFile.tif", options);

    }
}




