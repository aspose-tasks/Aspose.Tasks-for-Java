/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.PrimaveraReadOptions;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.Task;
import com.aspose.tasks.examples.Utils;

public class PrimaveraRead {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(PrimaveraRead.class);

        readXmlFileWithMultipleProjects1(dataDir);

        readPrimaveraXmlFileAndAccessPrimaveraSpecificProperties(dataDir);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void readXmlFileWithMultipleProjects1(String dataDir)
    {
        // ExStart:ReadXMLFileWithMultipleProjects
        // ExFor: PrimaveraReadOptions
        // ExFor: PrimaveraReadOptions.ProjectUid
        // ExSummary: Shows how to read a project from a Primavera XML or Primavera XER file containing multiple projects.
        PrimaveraReadOptions options = new PrimaveraReadOptions();
        options.setProjectUid(3881);

        // Returns project with special Uid
        Project project = new Project(dataDir + "PrimaveraProject.xml", options);
        System.out.println(project.get(Prj.NAME));

        // ExEnd:ReadXMLFileWithMultipleProjects
    }

    public static void readPrimaveraXmlFileAndAccessPrimaveraSpecificProperties(String dataDir)
    {
        // ExStart:ReadPrimaveraXmlFileAndAccessPrimaveraSpecificProperties
        // ExFor: Task.PrimaveraProperties
        // ExSummary: Shows how to read a project from a Primavera XML and examine tasks' Primavera-specific properties.
        PrimaveraReadOptions options = new PrimaveraReadOptions();
        options.setProjectUid(3883);

        // Returns project with special Uid
        Project project = new Project(dataDir + "PrimaveraProject.xml", options);

        for (Task task : project.enumerateAllChildTasks())
        {
            System.out.println("Task '" + task.getName() + "'");

            if (task.isSummary())
            {
                System.out.println("WBS Sequence number: " + task.getPrimaveraProperties().getSequenceNumber());
            }
            else
            {
                System.out.println("Task ActivityId: " + task.getPrimaveraProperties().getActivityId());
            }

            System.out.println("Task RemainingEarlyStart: " + task.getPrimaveraProperties().getRemainingEarlyStart());
            System.out.println("Task RemainingEarlyFinish: " + task.getPrimaveraProperties().getRemainingEarlyFinish());
        }

        // ExEnd:ReadPrimaveraXmlFileAndAccessPrimaveraSpecificProperties
    }
}




