/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import java.io.IOException;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class SaveAsSVG
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveAsSVG.class);

        SavingProjectDataAsSVG(dataDir + "Homemoveplan.mpp");

        UsingSvgOptions(dataDir + "Homemoveplan.mpp");

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void SavingProjectDataAsSVG(String projectName) throws IOException
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveAsSVG.class);

       //Read the input Project file
        Project project = new Project(projectName);
        //Save the Project as SVG
        project.save(dataDir + "Project5.SVG", SaveFileFormat.SVG);
    }

    public static void UsingSvgOptions(String projectName) throws IOException
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(SaveAsSVG.class);

        //Read the input Project file
        Project project = new Project(projectName);

        SaveOptions opt = new SvgOptions();
        opt.setFitContent(true);
        opt.setTimescale(Timescale.ThirdsOfMonths);
        project.save(dataDir + "FileName5.svg", opt);
    }
}




