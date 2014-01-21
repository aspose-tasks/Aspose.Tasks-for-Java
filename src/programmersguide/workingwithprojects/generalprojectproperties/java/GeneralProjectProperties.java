/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.generalprojectproperties.java;

import com.aspose.tasks.Calendar;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.Task;

import java.util.Date;
import java.util.List;

public class GeneralProjectProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/generalprojectproperties/data/";

        // 1.
        // Read General Project Properties
        Project prj = new Project(dataDir + "project.mpp");
        if(prj.isScheduleFromStart())
            System.out.println("Project Start Date : " + prj.getStartDate());
        else
            System.out.println("Project Finish Date : " + prj.getFinishDate());
        String strSchdl = (prj.isScheduleFromStart())?"Project Start Date":"Project Finish Date";

        System.out.println("Project Schedule From : " + strSchdl);
        System.out.println("Current Date : " + prj.getCurrentDate());
        System.out.println("Status Date : " + prj.getStatusDate());
        System.out.println("Calendar : " + prj.getCalendar().getName());

        //2.
        //Writing general properties
        //Create a project instance
        Project prj2 = new Project();

        //Set project information properties
        prj2.isScheduleFromStart(true);
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2014, 7, 10);
        prj2.setStartDate(cal.getTime());
        prj2.setCurrentDate(cal.getTime());
        prj2.setStatusDate(cal.getTime());
        Calendar TaskCal =  Calendar.makeStandardCalendar();
        TaskCal.setName("Standard");
        prj2.getCalendars().add(TaskCal);

        //Save the Project as XML
        prj2.save(dataDir + "project.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




