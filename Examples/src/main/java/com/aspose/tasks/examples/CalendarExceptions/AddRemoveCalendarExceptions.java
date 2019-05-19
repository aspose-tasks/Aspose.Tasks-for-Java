/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.CalendarExceptions;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class AddRemoveCalendarExceptions
{
    public static void main(String[] args) throws Exception
    {
    	// ExStart: AddRemoveCalendarExceptions
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AddRemoveCalendarExceptions.class);

        Project project = new Project(dataDir + "input.mpp");

        //Remove an exception
        Calendar cal = project.getCalendars().toList().get(0);
        if (cal.getExceptions().size() > 1)
        {
                CalendarException exc = cal.getExceptions().toList().get(0);
                cal.getExceptions().remove(exc);
        }

        //Add an exception
        CalendarException calExc = new CalendarException();

        java.util.Calendar calObject = java.util.Calendar.getInstance();
        calObject.set(2009, 1, 1, 0, 0, 0);
        calExc.setFromDate(calObject.getTime());

        calObject.set(2009, 1, 3, 0, 0, 0);
        calExc.setToDate(calObject.getTime());

        cal.getExceptions().add(calExc);

        //Display exceptions
        for(CalendarException calExc1:cal.getExceptions())
        {
            System.out.println("From" + calExc1.getFromDate().toString());
            System.out.println("To" + calExc1.getToDate().toString());
        }
        // ExEnd: AddRemoveCalendarExceptions
     }

}




