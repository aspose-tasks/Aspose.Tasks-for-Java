/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Resources;

import com.aspose.tasks.PdfSaveOptions;
import com.aspose.tasks.PresentationFormat;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveOptions;
import com.aspose.tasks.Timescale;
import com.aspose.tasks.examples.Utils;

import java.io.IOException;

public class RenderResourceUsageAndSheetView {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        resourceUsage(dataDir, outDir);

        resourceSheetView(dataDir, outDir);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void resourceUsage(String dataDir, String outDir) {
        //Read the source Project
        Project project = new Project(dataDir + "ResourceUsageView.mpp");
        //Define the SaveOptions with required TimeScale settings as Days
        SaveOptions options = new PdfSaveOptions();
        options.setTimescale(Timescale.Days);
        //Set the Presentation format to ResourceUsage
        options.setPresentationFormat(PresentationFormat.ResourceUsage);
        String days = "result_days.pdf";
        //Save the Project
        project.save(outDir + days, options);

        //Set the Tiemscale settings to ThirdsOfMonths
        options.setTimescale(Timescale.ThirdsOfMonths);
        String thirds = "result_thirdsOfMonths.pdf";
        //Save the Project
        project.save(outDir + thirds, options);

        //Set the Timescale settings to Months
        options.setTimescale(Timescale.Months);
        String months = "result_months.pdf";
        //Save the project
        project.save(outDir + months, options);
    }

    public static void resourceSheetView(String dataDir, String outDir) {
        //Read the source Project
        Project project = new Project(dataDir + "ResourceUsageView.mpp");
        //Define the SaveOptions
        SaveOptions options = new PdfSaveOptions();

        //Set the Presentation format to ResourceSheet
        options.setPresentationFormat(PresentationFormat.ResourceSheet);
        project.save(outDir + "result.pdf", options);
    }
}




