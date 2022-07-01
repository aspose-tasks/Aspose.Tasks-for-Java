/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.PdfSaveOptions;
import com.aspose.tasks.PresentationFormat;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveOptions;
import com.aspose.tasks.examples.Utils;

public class RenderTaskSheet {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RenderTaskSheet.class);

        Project project = new Project(dataDir + "NewProductDev.mpp");
        SaveOptions options = new PdfSaveOptions();
        options.setPresentationFormat(PresentationFormat.TaskSheet);
        // See the result attached
        project.save(dataDir + "taskSheet.pdf", options);
    }
}




