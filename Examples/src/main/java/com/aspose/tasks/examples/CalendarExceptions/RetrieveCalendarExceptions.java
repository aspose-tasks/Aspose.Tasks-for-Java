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

public class RetrieveCalendarExceptions {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "project.mpp");

        for (Calendar cal : project.getCalendars()) {
            for (CalendarException calExc : cal.getExceptions()) {
                System.out.println("From: " + calExc.getFromDate().toString());
                System.out.println("To: " + calExc.getToDate().toString());
            }
        }
    }
}




