/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects1;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class GetNumberOfPagesInProject
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetNumberOfPagesInProject.class);


        GetNumberOfPagesInProject(dataDir + "Homemoveplan.mpp");

        GetNumberOfPagesInDifferentViews(dataDir + "Homemoveplan.mpp");
        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    //Aspose.Tasks can retrieve the total number of pages in a project. The getPageCount method offered by Aspose.Tasks'
    //Visualization namespace returns the total page count in a project with options of rendering them based on Timescale.Days,
    //Timescale.Months or Timescale.ThirdsOfMonths.

    public static void GetNumberOfPagesInProject(String projectName)
    {
        Project project = new Project(projectName);

        //Get number of pages
        int iPages = project.getPageCount();


        //Get number of pages (Timescale.Months)
        iPages = project.getPageCount(0, Timescale.Months);

        //Get number of pages (Timescale.ThirdsOfMonths)
        iPages = project.getPageCount(0, Timescale.ThirdsOfMonths);
    }

    //Aspose.Tasks supports rendering a project's resource usage, resource sheet and task usage to PDF format,
    //and enables users to get the number of pages in the rendered output for these views. This programming sample demonstrates
    //rendering a projects' usage view and getting the number of pages in the rendered output.
    public static void GetNumberOfPagesInDifferentViews(String projectName)
    {
        //Read the source Project
        Project project = new Project(projectName);

        //Get number of pages
        System.out.println("Number of Pages = " + project.getPageCount(PresentationFormat.ResourceUsage, Timescale.Days));

        //Get number of pages (Months)
        System.out.println("Number of Pages = " + project.getPageCount(PresentationFormat.ResourceUsage, Timescale.Months));

        //Get number of pages (ThirdsOfMonths)
        System.out.println("Number of Pages = " + project.getPageCount(PresentationFormat.ResourceUsage, Timescale.ThirdsOfMonths));
    }

}




