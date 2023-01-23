/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import java.util.Date;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class GetNumberOfPagesInProject {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(GetNumberOfPagesInProject.class);

        getNumberOfPagesInProject(dataDir + "HomeMovePlan.mpp");

        GetNumberOfPagesInDifferentViews(dataDir + "HomeMovePlan.mpp");

        GetPageCountBetweenStartAndEndDates(dataDir + "HomeMovePlan.mpp");
        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    //Aspose.Tasks can retrieve the total number of pages in a project. The getPageCount method offered by Aspose.Tasks'
    //Visualization namespace returns the total page count in a project with options of rendering them based on Timescale.Days,
    //Timescale.Months or Timescale.ThirdsOfMonths.

    public static void getNumberOfPagesInProject(String projectName) {
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
    public static void GetNumberOfPagesInDifferentViews(String projectName) {
        //Read the source Project
        Project project = new Project(projectName);

        //Get number of pages
        System.out.println("Number of Pages = " + project.getPageCount(PresentationFormat.ResourceUsage, Timescale.Days));

        //Get number of pages (Months)
        System.out.println("Number of Pages = " + project.getPageCount(PresentationFormat.ResourceUsage, Timescale.Months));

        //Get number of pages (ThirdsOfMonths)
        System.out.println("Number of Pages = " + project.getPageCount(PresentationFormat.ResourceUsage, Timescale.ThirdsOfMonths));
    }

    public static void GetPageCountBetweenStartAndEndDates(String projectName) {
        //ExStart: GetPageCountBetweenStartAndEndDates
        Project project = new Project(projectName);

        Date dtStartDate, dtEndDate;
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(project.get(Prj.START_DATE));
        cal.add(java.util.Calendar.DAY_OF_MONTH, 7);    //add 7 days from start of project
        dtStartDate = cal.getTime();

        //Get Finish date with 30 days offset
        cal.setTime(project.get(Prj.FINISH_DATE));
        cal.add(java.util.Calendar.DAY_OF_MONTH, -30);
        dtEndDate = cal.getTime();

        ImageSaveOptions options = new ImageSaveOptions(SaveFileFormat.Png);
        {
            options.setRenderToSinglePage(false);
            options.setPageSize(PageSize.A3);
            options.setTimescale(Timescale.Months);
            options.setStartDate(dtStartDate);
            options.setEndDate(dtEndDate);
        }

        int pageCount = project.getPageCount_PageSize(PageSize.A3, Timescale.Months, dtStartDate, dtEndDate);

        System.out.println("Number of Pages = " + pageCount);
        //ExEnd: GetPageCountBetweenStartAndEndDates
    }
}




