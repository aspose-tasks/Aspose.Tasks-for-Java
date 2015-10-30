/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects1;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class WeekdayProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(WeekdayProperties.class);

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
        prj.save(dataDir + "savedProject.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




