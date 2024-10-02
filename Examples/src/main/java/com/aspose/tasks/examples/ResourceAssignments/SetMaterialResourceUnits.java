/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.ResourceAssignments;

import com.aspose.tasks.Project;
import com.aspose.tasks.RateScaleType;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceAssignment;
import com.aspose.tasks.ResourceType;
import com.aspose.tasks.Rsc;
import com.aspose.tasks.Task;
import com.aspose.tasks.examples.Utils;
import com.aspose.tasks.exceptions.NotSupportedException;

/**
 * Shows how to set variable material consumption (e.g. '10/day' or '1/week') for an assignment of a material resource.
 */
public class SetMaterialResourceUnits {
    public static void main(String[] args) {
        // The path to the documents' directory.
        String dataDir = Utils.getDataDir(SetMaterialResourceUnits.class);

        try {
            Project project = new Project(dataDir + "New project 2013.mpp");

            Task task = project.getRootTask().getChildren().add("t1");

            Resource materialResource = project.getResources().add("materialResource");
            materialResource.set(Rsc.TYPE, ResourceType.Material);

            ResourceAssignment materialResourceAssignment = project.getResourceAssignments().add(task, materialResource);

            // Suppose we want to set '1/week' material consumption.
            materialResourceAssignment.setMaterialResourceUnits(1D, RateScaleType.Week);
        } catch (NotSupportedException ex) {
            System.out.println(ex.getMessage() + "\nThis example will only work if you apply a valid Aspose License. You can purchase full license or get 30 day temporary license from http://www.aspose.com/purchase/default.aspx.");
        }
    }
}




