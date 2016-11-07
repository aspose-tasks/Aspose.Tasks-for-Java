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

public class HandleOccurrences {
	public static void main(String[] args) throws Exception {
		// ExStart: handling-occuracnes-for-exceptions
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(HandleOccurrences.class);

		CalendarException except = new CalendarException();
		except.setEnteredByOccurrences(true);
		except.setOccurrences(5);
		except.setType(CalendarExceptionType.YearlyByDay);
		// ExEnd: handling-occuracnes-for-exceptions

	}

}
