/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.readingprojectfiles.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class ReadingProjectFiles
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/readingprojectfiles/data/";

        //Create a project reader instance
        ProjectReader projectReader = new ProjectReader();
        Project existingProject = null;
        FileInputStream prjStream = null;
        try
        {
            prjStream = new FileInputStream( dataDir+ "project.mpp");
            existingProject = projectReader.read(prjStream);
            prjStream.close();
        }
        catch(Exception ex)
        {

        }
        System.out.println("Calendar : " + existingProject.getName());

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




