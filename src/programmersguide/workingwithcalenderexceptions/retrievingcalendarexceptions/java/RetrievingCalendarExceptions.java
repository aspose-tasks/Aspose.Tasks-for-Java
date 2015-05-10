/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithcalendarexceptions.retrievingcalendarexceptions.java;

import com.aspose.tasks.*;

public class RetrievingCalendarExceptions
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithcalendarexception/retrievingcalendarexceptions/data/";

	Project project = new Project(dataDir + "file.mpp");

	for(Calendar cal:project.getCalendars())
	{
  		for(CalendarException calExc: cal.getExceptions())
  	          {
    			System.out.println("From: " + calExc.getFromDate().toString()) ;
    			System.out.println("To: " + calExc.getToDate().toString()) ;
  		  }
	}
     }

}




