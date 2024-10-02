/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Resources;

import com.aspose.tasks.Calendar;
import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceCollection;
import com.aspose.tasks.Rsc;
import com.aspose.tasks.examples.Utils;

public class ResourceAndCalendars {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ResourceAndCalendars.class);

        settingResourceCalendar();
        gettingResourceCalendar(dataDir);

        // Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingResourceCalendar() {
        Project project = new Project();
        Resource res = project.getResources().add("Resource1");

        // add standard calendar
        Calendar cal = project.getCalendars().add("Resource1");
        res.set(Rsc.CALENDAR, cal);
    }

    public static void gettingResourceCalendar(String dataDir) {
        Project project = new Project(dataDir + "ResourceCalendar.mpp");
        ResourceCollection alRes = project.getResources();
        for (Resource res : alRes) {
            if (res.get(Rsc.NAME) != null) {
                //code to display res.Calendar properties
            }
        }
    }
}


