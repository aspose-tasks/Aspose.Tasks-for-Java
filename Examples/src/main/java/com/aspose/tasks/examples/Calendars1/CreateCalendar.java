/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.Calendars1;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class CreateCalendar
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateCalendar.class);

        //Create a project instance
        Project prj = new Project();

        //Define Calendar
        Calendar cal1 = prj.getCalendars().add("no info");
        Calendar cal2 = prj.getCalendars().add("no name");
        Calendar cal3 = prj.getCalendars().add("cal3");

        //Save the Project
        prj.save(dataDir + "Project.Xml",SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");

   }
}




