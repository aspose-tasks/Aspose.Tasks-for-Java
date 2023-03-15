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
import com.aspose.tasks.TimeDelta;
import com.aspose.tasks.examples.Utils;

public class PrimaveraRead {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(PrimaveraRead.class);

        readXmlFileWithMultipleProjects1(dataDir);

        readPrimaveraXmlFileAndAccessPrimaveraSpecificProperties(dataDir);

        accessPrimaveraSpecificProjectProperties(dataDir);

        // Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void readXmlFileWithMultipleProjects1(String dataDir) {
        // Shows how to read a project from a Primavera XML or Primavera XER file containing multiple projects.
        PrimaveraReadOptions options = new PrimaveraReadOptions();
        options.setProjectUid(3881);

        // Returns project with special Uid
        Project project = new Project(dataDir + "PrimaveraProject.xml", options);
        System.out.println(project.get(Prj.NAME));
    }

    public static void readPrimaveraXmlFileAndAccessPrimaveraSpecificProperties(String dataDir) {
        // Shows how to read a project from a Primavera XML and examine tasks' Primavera-specific properties.
        PrimaveraReadOptions options = new PrimaveraReadOptions();
        options.setProjectUid(3883);

        // Returns project with special Uid
        Project project = new Project(dataDir + "PrimaveraProject.xml", options);

        for (Task task : project.enumerateAllChildTasks()) {
            System.out.println("Task '" + task.getName() + "'");

            if (task.isSummary()) {
                System.out.println("WBS Sequence number: " + task.getPrimaveraProperties().getSequenceNumber());
            } else {
                System.out.println("Task ActivityId: " + task.getPrimaveraProperties().getActivityId());
            }

            System.out.println("Activity Type: " + task.getPrimaveraProperties().getActivityType());
            System.out.println("Duration Type: " + task.getPrimaveraProperties().getDurationType());
            System.out.println("Percent Complete Type: " + task.getPrimaveraProperties().getPercentCompleteType());
            System.out.println("Original Duration: " + TimeDelta.fromMilliseconds(task.getDuration().getTimeSpan()).getTotalHours());
            System.out.println("At Complete Duration: " +
                    (TimeDelta.fromMilliseconds(task.getActualDuration().getTimeSpan()).getTotalHours() + TimeDelta.fromMilliseconds(task.getRemainingDuration().getTimeSpan()).getTotalHours()));
            System.out.println("Duration % Complete: " + task.getPrimaveraProperties().getDurationPercentComplete());
            System.out.println("Physical % Complete: " + task.getPrimaveraProperties().getPhysicalPercentComplete());

            System.out.println("Task RemainingEarlyStart: " + task.getPrimaveraProperties().getRemainingEarlyStart());
            System.out.println("Task RemainingEarlyFinish: " + task.getPrimaveraProperties().getRemainingEarlyFinish());

            System.out.println("Actual costs:");
            System.out.println(task.getPrimaveraProperties().getActualExpenseCost() + ", "
                            + task.getPrimaveraProperties().getActualLaborCost() + ", "
                            + task.getPrimaveraProperties().getActualMaterialCost() + ", "
                            + task.getPrimaveraProperties().getActualNonlaborCost() + ", Total: "
                            + task.getPrimaveraProperties().getActualTotalCost());

            System.out.println("Labor Units:");
            System.out.println(task.getPrimaveraProperties().getActualLaborUnits() + ", " +
                    task.getPrimaveraProperties().getActualNonLaborUnits() + ", " +
                    task.getPrimaveraProperties().getRemainingLaborUnits() + ", " +
                    task.getPrimaveraProperties().getRemainingNonLaborUnits());

            System.out.println("Units % Complete: " + task.getPrimaveraProperties().getUnitsPercentComplete());
        }
    }

    public static void accessPrimaveraSpecificProjectProperties(String dataDir)
    {
        // Shows how to read a project from a Primavera file and examine project's Primavera-specific properties.

        PrimaveraReadOptions options = new PrimaveraReadOptions();
        options.setProjectUid(4861);

        // Returns project with special Uid
        Project project = new Project(dataDir + "ScheduleOptions.xer", options);

        // PrimaveraProperties can be null if project's schedule options have default values.
        if (project.getPrimaveraProperties() != null)
        {
            System.out.println("Project's schedule options:");
            System.out.println("Relationship Lag Calendar: " + project.getPrimaveraProperties().getRelationshipLagCalendar());
            System.out.println("Make Open Ended Activities Critical: " + project.getPrimaveraProperties().getMakeOpenEndedActivitiesCritical());
            System.out.println("Ignore Other Project Relationships: " + project.getPrimaveraProperties().getIgnoreOtherProjectRelationships());
            System.out.println("Use Expected Finish Dates: " + project.getPrimaveraProperties().getUseExpectedFinishDates());
        }
    }
}




