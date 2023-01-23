/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.ResourceAssignments;

import com.aspose.tasks.Asn;
import com.aspose.tasks.Project;
import com.aspose.tasks.RateScaleType;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceAssignment;
import com.aspose.tasks.ResourceType;
import com.aspose.tasks.Rsc;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.Task;
import com.aspose.tasks.examples.Utils;

import java.io.IOException;

public class ReadWriteRateScaleForResourceAssignment {
    public static void main(String[] args) {
        //ExStart: ReadWriteRateScaleForResourceAssignment
        String dataDir = Utils.getDataDir(ReadWriteRateScaleForResourceAssignment.class);

        Project project = new Project(dataDir + "New project 2013.mpp");

        Task task = project.getRootTask().getChildren().add("t1");

        Resource materialResource = project.getResources().add("materialResource");
        materialResource.set(Rsc.TYPE, ResourceType.Material);

        Resource nonMaterialResource = project.getResources().add("nonMaterialResource");
        nonMaterialResource.set(Rsc.TYPE, ResourceType.Work);

        ResourceAssignment materialResourceAssignment = project.getResourceAssignments().add(task, materialResource);
        materialResourceAssignment.set(Asn.RATE_SCALE, RateScaleType.Week);

        ResourceAssignment nonMaterialResourceAssignment = project.getResourceAssignments().add(task, nonMaterialResource);
        nonMaterialResourceAssignment.set(Asn.RATE_SCALE, RateScaleType.Week);

        project.save("output.mpp", SaveFileFormat.Mpp);

        Project resavedProject = new Project("output.mpp");

        ResourceAssignment resavedMaterialResourceAssignment = resavedProject.getResourceAssignments().getByUid(1);
        System.out.println(resavedMaterialResourceAssignment.get(Asn.RATE_SCALE));

        // only material resource assignments can have non-zero rate scale value.
        ResourceAssignment resavedNonMaterialResourceAssignment = resavedProject.getResourceAssignments().getByUid(2);
        //ExEnd:ReadWriteRateScaleForResourceAssignment
    }
}
