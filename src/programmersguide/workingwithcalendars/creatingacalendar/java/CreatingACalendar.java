/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithcalendars.creatingacalendar.java;

import com.aspose.tasks.*;

public class CreatingACalendar
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithcalendars/creatingacalendar/data/";

        //Create a project instance
        Project prj = new Project();

        //Define Calendar
        Calendar cal1 = new Calendar();
        cal1.setName("no info");
        Calendar cal2 = new Calendar(1);
        cal2.setName("no name");
        Calendar cal3 = new Calendar("cal3");
        prj.getCalendars().add(cal1);
        prj.getCalendars().add(cal2);
        prj.getCalendars().add(cal3);

        prj.calcCalendarUids();

        //Save the Project
        prj.save(dataDir + "Project.Xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");

    }
}




