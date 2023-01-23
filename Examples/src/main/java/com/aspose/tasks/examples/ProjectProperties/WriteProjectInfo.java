/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.ProjectProperties;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.util.Calendar;

public class WriteProjectInfo {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(WriteProjectInfo.class);
        //ExStart:WriteProjectInfo
        //Create a project instance
        Project project = new Project();
        //Set project information properties
        project.set(Prj.SCHEDULE_FROM_START, new NullableBool(true));
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2014, Calendar.JULY, 10);
        project.set(Prj.START_DATE, cal.getTime());
        project.set(Prj.CURRENT_DATE, cal.getTime());
        project.set(Prj.STATUS_DATE, cal.getTime());

        //Save the Project as XML
        project.save(dataDir + "project3.xml", SaveFileFormat.Xml);
        //ExEnd:WriteProjectInfo
    }
}




