/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.weekdayproperties.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Month;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;

public class WeekdayProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/weekdayproperties/data/";

        Project project = new Project(dataDir + "project.mpp");

        //Display week days properties
        System.out.println("Week Start Date : " + project.getWeekStartDay());
        System.out.println("Days Per Month : " + project.getDaysPerMonth());
        System.out.println("Minutes Per Day : " + project.getMinutesPerDay());
        System.out.println("Minutes Per Week : " + project.getMinutesPerWeek());

        //Create a project instance
        Project prj = new Project();

        //Set week days properties
        prj.setWeekStartDay(DayType.Monday);
        prj.setDaysPerMonth(24);
        prj.setMinutesPerDay(540);
        prj.setMinutesPerWeek(3240);

        //Save the project as XML project file
        prj.save(dataDir + "savedProject.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




