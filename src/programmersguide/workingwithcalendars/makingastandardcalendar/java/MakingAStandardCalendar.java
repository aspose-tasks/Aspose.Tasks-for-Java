/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithcalendars.makingastandardcalendar.java;

import com.aspose.tasks.*;

public class MakingAStandardCalendar
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithcalendars/makingastandardcalendar/data/";

        //Create a project instance
        Project prj = new Project();

        //Define Calendar and make it standard
        Calendar cal1 = new Calendar("My Cal");
        Calendar.makeStandardCalendar(cal1);

        prj.getCalendars().add(cal1);
        prj.calcCalendarUids();

        //Save the Project
        prj.save(dataDir + "Project.Xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");

    }
}




