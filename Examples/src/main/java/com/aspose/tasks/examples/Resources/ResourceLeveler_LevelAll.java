/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Resources;

import com.aspose.tasks.LevelingResult;
import com.aspose.tasks.Project;
import com.aspose.tasks.ResourceLeveler;
import com.aspose.tasks.Task;
import com.aspose.tasks.examples.Utils;

/**
 * Shows how to level all project's resources using default options.
 */
public class ResourceLeveler_LevelAll {
    public static void main(String[] args) {
        // The path to the documents' directory.
        String dataDir = Utils.getDataDir(ResourceLeveler_LevelAll.class);

        Project project = new Project(dataDir + "Software Development Plan.mpp");

        LevelingResult levelingResult = ResourceLeveler.levelAll(project);

        for (Task task : levelingResult.getAffectedTasks())
        {
            System.out.println("Task affected by the leveling operation: " + task.getName());
        }

        project.save(dataDir + "Software Development Plan.leveled.mpp");
        ResourceLeveler.clearLeveling(project);

        System.out.println("Leveling cleared");
    }
}
