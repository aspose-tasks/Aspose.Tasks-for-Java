/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.ResourceAssignments;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.math.BigDecimal;

public class AssignmentCost {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(AssignmentCost.class);

        getResourceAssignmentCosts(dataDir);

        setResourceAssignmentCosts();
    }

    public static void getResourceAssignmentCosts(String dataDir) {
        Project project = new Project(dataDir + "project.mpp");

        for (ResourceAssignment ra : project.getResourceAssignments()) {
            System.out.println(ra.get(Asn.COST));
            System.out.println(ra.get(Asn.ACWP));

            // CV = BCWP - ACWP
            System.out.println(ra.get(Asn.CV));

            System.out.println(ra.get(Asn.BCWP));
            System.out.println(ra.get(Asn.BCWS));

            // SV = BCWP - BCWS
            System.out.println(ra.get(Asn.SV));
        }
    }

    public static void setResourceAssignmentCosts() {
        Project project = new Project();

        Task task = project.getRootTask().getChildren().add("New task");
        task.setDuration(project.getDuration(0.625/*15h*/, TimeUnitType.Day));
        Resource resource = project.getResources().add("Resource");
        resource.setStandardRate(BigDecimal.valueOf(10));

        ResourceAssignment assignment = project.getResourceAssignments().add(task, resource);

        assignment.setWork(project.getDuration(0.5/*12h*/, TimeUnitType.Day));
        assignment.setActualWork(project.getDuration(0.125/*3h*/, TimeUnitType.Day));

        System.out.println("Now assignment's cost are auto calculated:");
        System.out.println("Actual Cost: " + assignment.getActualCost());
        System.out.println("Remaining Cost: " + assignment.getRemainingCost());
        System.out.println("Cost: " + assignment.getCost());

        project.setAutoCalculateAssignmentCosts(false);
        assignment.setActualCost(BigDecimal.valueOf(123));
        assignment.setRemainingCost(BigDecimal.valueOf(456));
        assignment.setCost(BigDecimal.valueOf(555));

        System.out.println("Now auto calculation of assignment's cost is turned off.");
        System.out.println("Actual Cost: " + assignment.getActualCost());
        System.out.println("Remaining Cost: " + assignment.getRemainingCost());
        System.out.println("Cost: " + assignment.getCost());
    }
}




