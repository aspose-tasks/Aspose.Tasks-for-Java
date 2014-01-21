/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.fiscalyearproperties.java;

import com.aspose.tasks.Month;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;

public class FiscalYearProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/fiscalyearproperties/data/";

        Project project = new Project(dataDir + "project.mpp");

        //Display fiscal year properties
        System.out.println("Fiscal Year Start Date : " + project.getFyStartDate());
        System.out.println("Fiscal Year Numbering : " + project.getFiscalYearStart());

        //Create a project instance
        Project prj = new Project();

        //Set fiscal year properties
        prj.setFyStartDate(Month.July);
        prj.setFiscalYearStart(true);

        //Save the project as XML project file
        prj.save(dataDir + "savedProject.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




