/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Resources;

import com.aspose.tasks.IMessageHandler;
import com.aspose.tasks.LevelingOptions;
import com.aspose.tasks.MessageLevel;
import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceLeveler;
import com.aspose.tasks.examples.Utils;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * Shows how to level specific resource, customize leveling options and examine leveling algorithm messages.
 */
public class ResourceLeveler_LevelResources {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "Software Development Plan.mpp");

        LevelingOptions levelingOptions = new LevelingOptions();

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2013, Calendar.MARCH, 10, 0, 0, 0);
        levelingOptions.setStartDate(cal.getTime());
        cal.set(2013, Calendar.APRIL, 30, 0, 0, 0);
        levelingOptions.setFinishDate(cal.getTime());
        List<Resource> resources = new ArrayList<>();
        resources.add(project.getResources().getById(7));
        levelingOptions.setResources(resources);
        levelingOptions.setMessageLevel(MessageLevel.Information);
        levelingOptions.setMessageHandler(new LevelingMessageHandler());

        ResourceLeveler.levelResources(project, levelingOptions);
    }

    private static class LevelingMessageHandler implements IMessageHandler {
        public void message(int level, String message) {
            System.out.printf("[%s] : %s%n", MessageLevel.getName(MessageLevel.class, level), message);
        }
    }
}
