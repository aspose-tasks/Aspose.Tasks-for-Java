/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.ResourceAssignments;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.math.BigDecimal;

public class ResourceAssignmentProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ResourceAssignmentProperties.class);

        settingresourceassignmentproperties();

	    gettingresourceassignmentproperties();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingresourceassignmentproperties()
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ResourceAssignmentProperties.class);

        Project project = new Project();

        Task task = project.getRootTask().getChildren().add("Task");
        Resource rsc = project.getResources().add("Rsc");
        rsc.set(Rsc.STANDARD_RATE, BigDecimal.valueOf(10));
        rsc.set(Rsc.OVERTIME_RATE, BigDecimal.valueOf(15));

        ResourceAssignment assn = project.getResourceAssignments().add(task, rsc);
    }

    public static void gettingresourceassignmentproperties()
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ResourceAssignmentProperties.class);

        Project prj = new Project(dataDir + "input.mpp");
        for (ResourceAssignment ra:prj.getResourceAssignments())
        {
                System.out.println(ra.get(Asn.UID));
                System.out.println(ra.get(Asn.START).toString());
                System.out.println(ra.get(Asn.FINISH).toString());
        }
    }    
}




