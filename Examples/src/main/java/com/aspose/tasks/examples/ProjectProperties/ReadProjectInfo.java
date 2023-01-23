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

public class ReadProjectInfo {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadProjectInfo.class);
        //ExStart:ReadProjectInfo
        Project project = new Project(dataDir + "ReadProjectInfo.mpp");
		if (project.get(Prj.SCHEDULE_FROM_START).getValue()) {
			System.out.println("Project Start Date: " + project.get(Prj.START_DATE));
		} else {
			System.out.println("Project Finish Date: " + project.get(Prj.FINISH_DATE));
		}
        String strSchdl = (project.get(Prj.SCHEDULE_FROM_START).getValue()) ? "Project Start Date" : "Project Finish Date";

        System.out.println("Project Schedule From: " + strSchdl);
        System.out.println("Current Date: " + project.get(Prj.CURRENT_DATE));
        System.out.println("Status Date: " + project.get(Prj.STATUS_DATE));
        System.out.println("Calendar: " + project.get(Prj.CALENDAR).getName());
        //ExEnd:ReadProjectInfo
    }
}