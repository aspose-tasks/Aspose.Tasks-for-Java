/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.ImageSaveOptions;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

import java.io.IOException;

public class SaveProjectAsJpeg {
    public static void main(String[] args) {
        // The path to the !!OTHER!! document directory.
        String dataDir = Utils.getDataDir(SaveAsPdf.class);

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "HomeMovePlan.mpp");

        // in order to manipulate JPEG quality one can use ImageSaveOptions.JpegQuality property.
        // The allowed value range is 0..100.
        ImageSaveOptions options = new ImageSaveOptions(SaveFileFormat.Jpeg);
        options.setJpegQuality(50);

        project.save(outDir + "image_out.jpeg", options);
    }
}
