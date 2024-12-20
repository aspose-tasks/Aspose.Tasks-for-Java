/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.SaveOptions;
import com.aspose.tasks.SvgOptions;
import com.aspose.tasks.Timescale;
import com.aspose.tasks.examples.Utils;

import java.io.IOException;

public class SaveAsSvg {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        SavingProjectDataAsSVG(dataDir, outDir);

        UsingSvgOptions(dataDir, outDir);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void SavingProjectDataAsSVG(String dataDir, String outDir) {
        // Read the input Project file
        Project project = new Project(dataDir + "HomeMovePlan.mpp");
        // Save the Project as SVG
        project.save(outDir + "project5_out.svg", SaveFileFormat.Svg);
    }

    public static void UsingSvgOptions(String dataDir, String outDir) {
        // Read the input Project file
        Project project = new Project(dataDir + "HomeMovePlan.mpp");

        SaveOptions opt = new SvgOptions();
        opt.setFitContent(true);
        opt.setTimescale(Timescale.ThirdsOfMonths);
        project.save(outDir + "FileName5.svg", opt);
    }
}




