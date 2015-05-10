/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithcalendarexceptions.definingweekdaysforexceptions.java;

import com.aspose.tasks.*;

public class DefiningWeekdaysForExceptions
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithcalendarexception/definingweekdaysforexceptions/data/";

	//Create a project instance
	Project project = new Project();

	//Define Calendar
	Calendar cal = project.getCalendars().add("Calendar1");

	//Define week days exception for christmis
	CalendarException except = new CalendarException();
	except.setEnteredByOccurrences(false);

	java.util.Calendar calObject = java.util.Calendar.getInstance();
	calObject.set(2009, 12, 24, 0, 0, 0);
	except.setFromDate(calObject.getTime());
	calObject.set(2009, 12, 31, 23, 59, 0);
	except.setToDate(calObject.getTime());
	except.setType(CalendarExceptionType.Daily);
	except.setDayWorking(false);
	cal.getExceptions().add(except);

	//Save the Project
	project.Save("Project.Xml", SaveFileFormat.XML);
    }

}




