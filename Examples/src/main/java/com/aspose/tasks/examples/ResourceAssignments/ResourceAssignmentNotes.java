/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.ResourceAssignments;

import com.aspose.tasks.Asn;
import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceAssignment;
import com.aspose.tasks.Task;
import com.aspose.tasks.examples.Utils;

public class ResourceAssignmentNotes {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ResourceAssignmentNotes.class);

        Project prj = new Project(dataDir + "UpdateResourceAssignment.mpp");

        Task task = prj.getRootTask().getChildren().getById(1);
        Resource rsc = prj.getResources().getById(1);

        // Create resource assignment
        ResourceAssignment assn = prj.getResourceAssignments().add(task, rsc);

        // Set resource assignment notes
        assn.set(Asn.NOTES_TEXT, "Newly added assignment");

        System.out.println("Notes text: " + assn.get(Asn.NOTES_TEXT));
        System.out.println("Notes RTF: " + assn.get(Asn.NOTES_RTF));

        // Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}
