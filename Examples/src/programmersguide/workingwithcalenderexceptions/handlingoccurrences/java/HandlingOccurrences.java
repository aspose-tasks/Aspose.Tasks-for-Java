/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithcalendarexceptions.handlingoccurrences.java;

import com.aspose.tasks.*;

public class HandlingOccurrences
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithcalendarexception/handlingoccurrences/data/";

	CalendarException except = new CalendarException();
	except.setEnteredByOccurrences(true);
	except.setOccurrences(5);
	except.setType(CalendarExceptionType.YearlyByDay);
    }

}




