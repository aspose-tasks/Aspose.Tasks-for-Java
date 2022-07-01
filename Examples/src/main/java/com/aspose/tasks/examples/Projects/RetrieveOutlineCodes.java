/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.OutlineCodeDefinition;
import com.aspose.tasks.OutlineMask;
import com.aspose.tasks.OutlineValue;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

public class RetrieveOutlineCodes {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(RetrieveOutlineCodes.class);

        RetreiveOutlineCodesFromProject(dataDir + "Homemoveplan.mpp");

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    //Aspose.Tasks can retrieve the total number of pages in a project. The getPageCount method offered by Aspose.Tasks'
    //Visualization namespace returns the total page count in a project with options of rendering them based on Timescale.Days,
    //Timescale.Months or Timescale.ThirdsOfMonths.

    public static void RetreiveOutlineCodesFromProject(String projectName) {
        Project project = new Project(projectName);
        for (OutlineCodeDefinition ocd : project.getOutlineCodes()) {
            System.out.println("Alias = " + ocd.getAlias());
            if (ocd.getAllLevelsRequired()) {
                System.out.println("It contains property: must have all levels");
            } else {
                System.out.println("It does not contain property: must have all levels");
            }
            if (ocd.getEnterprise()) {
                System.out.println("It is an enterprise custom outline code.");
            } else {
                System.out.println("It is not an enterprise custom outline code.");
            }
            System.out.println("Reference to another custom field for which this outline code definition is an alias is = " + ocd.getEnterpriseOutlineCodeAlias());
            System.out.println("Field Id = " + ocd.getFieldId());
            System.out.println("Field Name = " + ocd.getFieldName());
            System.out.println("Phonetic Alias = " + ocd.getPhoneticAlias());
            System.out.println("Guid = " + ocd.getGuid());

            //Display outline code masks
            for (OutlineMask m1 : ocd.getMasks()) {
                System.out.println("Level of a mask = " + m1.getLevel());
                System.out.println("Mask = " + m1.toString());
            }

            //Display out line code values
            for (OutlineValue v1 : ocd.getValues()) {
                System.out.println("Description of outline value = " + v1.getDescription());
                System.out.println("Value Id = " + v1.getValueId());
                System.out.println("Value = " + v1.getValue());
                System.out.println("Type = " + v1.getType());
            }
        }
    }
}




