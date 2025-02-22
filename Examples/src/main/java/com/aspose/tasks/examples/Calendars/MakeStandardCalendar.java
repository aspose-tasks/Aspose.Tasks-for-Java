/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Calendars;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class MakeStandardCalendar {
    public static void main(String[] args) {
        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        //Create a project instance
        Project project = new Project();

        //Define Calendar and make it standard
        Calendar cal1 = project.getCalendars().add("My Cal");
        Calendar.makeStandardCalendar(cal1);

        //Save the Project
        project.save(outDir + "project_out.xml", SaveFileFormat.Xml);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




