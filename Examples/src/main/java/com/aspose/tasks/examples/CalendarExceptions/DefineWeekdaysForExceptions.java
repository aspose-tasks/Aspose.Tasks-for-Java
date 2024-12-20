/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.CalendarExceptions;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.util.GregorianCalendar;

public class DefineWeekdaysForExceptions {
    public static void main(String[] args) {
        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // Create a project instance
        Project project = new Project();

        // Define Calendar
        Calendar cal = project.getCalendars().add("Calendar1");

        // Define week days exception for Christmas
        CalendarException except = new CalendarException();
        except.setEnteredByOccurrences(false);
        except.setFromDate(new GregorianCalendar(2009, java.util.Calendar.DECEMBER, 24, 0, 0, 0).getTime());
        except.setToDate(new GregorianCalendar(2009, java.util.Calendar.DECEMBER, 31, 23, 59, 0).getTime());
        except.setType(CalendarExceptionType.Daily);
        except.setDayWorking(false);
        cal.getExceptions().add(except);

        // Save the Project
        project.save(outDir + "project_out.xml", SaveFileFormat.Xml);
    }
}




