/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class WeekdayProperties {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "project.mpp");

        //Display week days properties
        System.out.println("Week Start Date : " + project.get(Prj.WEEK_START_DAY).toString());
        System.out.println("Days Per Month : " + project.get(Prj.DAYS_PER_MONTH).toString());
        System.out.println("Minutes Per Day : " + project.get(Prj.MINUTES_PER_DAY).toString());
        System.out.println("Minutes Per Week : " + project.get(Prj.MINUTES_PER_WEEK).toString());

        //---------- Setting Week Day Properties
        //Create a project instance
        Project prj = new Project();

        //Set week days properties
        project.set(Prj.WEEK_START_DAY, DayType.Monday);
        project.set(Prj.DAYS_PER_MONTH, 24);
        project.set(Prj.MINUTES_PER_DAY, 540);
        project.set(Prj.MINUTES_PER_WEEK, 3240);

        //Save the project as XML project file
        prj.save(outDir + "savedProject.xml", SaveFileFormat.Xml);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




