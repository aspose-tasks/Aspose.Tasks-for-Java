/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.ProjectProperties;

import com.aspose.tasks.BuiltInProjectProperty;
import com.aspose.tasks.CustomProjectProperty;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;
import com.aspose.tasks.examples.Tasks.ActualProperties;

public class ReadMetaProperties {
    public static void main(String[] args) {
        // The path to the !!OTHER!! document directory.
        String dataDir = Utils.getDataDir(ActualProperties.class);

        // Create a project reader instance
        Project project = new Project(dataDir + "project.mpp");

        // Custom properties are available through the typed collection:
        for (CustomProjectProperty property : project.getCustomProps()) {
            System.out.println(property.getType());
            System.out.println(property.getName());
            System.out.println(property.getValue());
        }

        // Built-in properties are available directly:
        System.out.println(project.getBuiltInProps().getAuthor());
        System.out.println(project.getBuiltInProps().getTitle());

        // or as an item of built-in property collection:
        for (BuiltInProjectProperty property : project.getBuiltInProps()) {
            System.out.println(property.getName());
            System.out.println(property.getValue());
        }
    }
}