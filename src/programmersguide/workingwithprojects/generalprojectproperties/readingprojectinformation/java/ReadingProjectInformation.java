/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.generalprojectproperties.readingprojectinformation.java;

import com.aspose.tasks.Project;

public class ReadingProjectInformation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/generalprojectproperties/readingprojectinformation/data/";

        Project prj = new Project(dataDir + "input.xml");
        if(prj.isScheduleFromStart())
            System.out.println("Project Start Date : " + prj.getStartDate());
        else
            System.out.println("Project Finish Date : " + prj.getFinishDate());
        String strSchdl = (prj.isScheduleFromStart())?"Project Start Date":"Project Finish Date";

        System.out.println("Project Schedule From : " + strSchdl);
        System.out.println("Current Date : " + prj.getCurrentDate());
        System.out.println("Status Date : " + prj.getStatusDate());

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




