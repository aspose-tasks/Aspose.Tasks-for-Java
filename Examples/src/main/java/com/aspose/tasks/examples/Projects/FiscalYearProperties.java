/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class FiscalYearProperties {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(FiscalYearProperties.class);

        Project project = new Project(dataDir + "project.mpp");

        //Display fiscal year properties
        //Display fiscal year properties
        System.out.println("Fiscal Year Start Date : " + project.get(Prj.FY_START_DATE));
        System.out.println("Fiscal Year Numbering : " + project.get(Prj.FISCAL_YEAR_START));

        //------ Setting Project Fiscal Year Properties
        //Create a project instance
        Project prj = new Project();

        //Set fiscal year properties
        prj.set(Prj.FY_START_DATE, Month.July);
        prj.set(Prj.FISCAL_YEAR_START, new NullableBool(true));

        //Save the project as XML project file
        prj.save(dataDir + "savedProject.xml", SaveFileFormat.Xml);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




