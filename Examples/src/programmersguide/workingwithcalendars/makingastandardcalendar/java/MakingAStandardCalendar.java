/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
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
	Project project = new Project();

	//Define Calendar and make it standard
	Calendar cal1 = project.getCalendars().add("My Cal");
	Calendar.makeStandardCalendar(cal1);

	//Save the Project
	project.save("Project.Xml", SaveFileFormat.XML);
        //Display result of conversion.
        System.out.println("Process completed Successfully");

    }
}




