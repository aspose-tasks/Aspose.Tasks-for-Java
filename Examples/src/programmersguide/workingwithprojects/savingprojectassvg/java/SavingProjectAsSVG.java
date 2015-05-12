/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.savingprojectassvg.java;

import com.aspose.tasks.*;

import java.util.List;

public class SavingProjectAsSVG
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/savingprojectassvg/data/";


        SavingProjectDataAsSVG(dataDir + "Homemoveplan.mpp");

        UsingSvgOptions(dataDir + "Homemoveplan.mpp");

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void SavingProjectDataAsSVG(String projectName)
    {
       //Read the input Project file
        Project project = new Project("Project5.mpp");
        //Save the Project as SVG
        project.save("Project5.SVG", SaveFileFormat.SVG);
    }

    public static void UsingSvgOptions(String projectName)
    {
        //Read the input Project file
        Project project = new Project(projectName);

        SaveOptions opt = new SvgOptions();
        opt.setFitContent(true);
        opt.setTimescale(Timescale.ThirdsOfMonths);
        project.save("FileName5.svg", opt);
    }
}




