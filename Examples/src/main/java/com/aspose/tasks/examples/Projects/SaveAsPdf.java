/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.LegendDrawingOptions;
import com.aspose.tasks.PdfSaveOptions;
import com.aspose.tasks.PresentationFormat;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.SaveOptions;
import com.aspose.tasks.Timescale;
import com.aspose.tasks.examples.Utils;

public class SaveAsPdf {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // Read the input Project file
        Project project = new Project(dataDir + "HomeMovePlan.mpp");

        // Save the Project as PDF
        project.save(outDir + "Project5_out.pdf", SaveFileFormat.Pdf);

        // Fitting contents to cell size
        Project project1 = new Project(dataDir + "project6.mpp");
        SaveOptions o = new PdfSaveOptions();

        // Set the row height to fit cell content
        o.setFitContent(true);
        o.setTimescale(Timescale.Months);
        o.setPresentationFormat(PresentationFormat.TaskUsage);
        project1.save(outDir + "result_months.pdf", o);

        // Set the LegendOnEachPage property to false to hide legends
        o.setLegendDrawingOptions(LegendDrawingOptions.NoLegend);

        project1.save(outDir + "result_months_WithoutLegend.pdf", o);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




