/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.settingattributesfornewtasks.java;

import com.aspose.tasks.*;

import java.io.FileOutputStream;

public class SettingAttributesForNewTasks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/settingattributesfornewtasks/data/";

        //create a prject instance
        Project prj = new Project();

        //set new task property
        prj.setNewTaskStartDate(TaskStartDateType.CurrentDate);

        //save the project in XML format
        prj.save(dataDir + "project1.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Project file generated Successfully");
    }
}




