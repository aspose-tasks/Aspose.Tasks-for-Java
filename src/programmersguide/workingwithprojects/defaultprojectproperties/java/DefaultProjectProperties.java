/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.defaultprojectproperties.java;

import com.aspose.tasks.*;

import java.util.Date;

public class DefaultProjectProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/defaultprojectproperties/data/";

        // 1.
        // Read Default Project Properties
        Project prj = new Project(dataDir + "project.mpp");

        //Display default properties
        System.out.println("Project Version : " + prj.getSaveVersion());
        System.out.println("New Task Default Start: "+prj.getDefaultStartTime());
        System.out.println("New Task Default Type: "+prj.getDefaultTaskType());
        System.out.println("Resouce Default Standard Rate: "+prj.getDefaultStandardRate());
        System.out.println("Resource Default Overtime Rate: "+prj.getDefaultOvertimeRate());
        System.out.println("Default Task EV Method: "+prj.getDefaultTaskEVMethod());
        System.out.println("Default Cost Accrual: "+prj.getDefaultFixedCostAccrual());


        //2.
        //Writing default properties
        //Create a project instance
        Project prj2 = new Project();

        //Set default properties
        prj2.isScheduleFromStart(true);
        prj2.setStartDate(new Date());
        prj2.setDefaultStartTime(prj.getStartDate());
        prj2.setDefaultTaskType(TaskType.FixedDuration);
        prj2.setDefaultStandardRate(15);
        prj2.setDefaultOvertimeRate(12);
        prj2.setDefaultTaskEVMethod(EarnedValueMethodType.PercentComplete);
        prj2.setDefaultFixedCostAccrual(CostAccrualType.Prorated);

        //Save the project to XML format
        prj.save(dataDir + "Project.xml", SaveFileFormat.XML);


        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




