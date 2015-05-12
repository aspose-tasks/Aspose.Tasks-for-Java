/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithcalendars.calendarproperties.java;

import com.aspose.tasks.*;

public class CalendarProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithcalendars/calendarproperties/data/";
	
	long OneSec = 10000000;//microsecond * 10
	long OneMin = 60 * OneSec;
	long OneHour = 60 * OneMin;

	Project project = new Project(dataDir + "prj.mpp");

	for (Calendar cal:project.getCalendars())
	{
		if (cal.getName().toString() != null)
  		{
    			for(WeekDay wd:cal.getWeekDays())
      			{
 				double ts = wd.getWorkingTime();
 				double time = ts / (OneHour);
        			System.out.println("Day Type"+ wd.getDayType() + "Hours" + ts);
      			}

    			System.out.println("Base Calendar : ");
    			if (cal.isBaseCalendar())
      			System.out.println("Self");
    			else
    			System.out.println(cal.getBaseCalendar().getName());

    			System.out.println("UID : " + cal.getUid());
    			System.out.println("Name : " + cal.getName());
  		}
	}

   }
}




