/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.creatingemptyprojectfile.java;

import com.aspose.tasks.*;

import java.io.FileOutputStream;

public class CreatingEmptyProjectFile
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/creatingemptyprojectfile/data/";


        //Create a project instance
        Project newProject = new Project();

        //Create a file stream
        FileOutputStream projectStream = null;
        try
        {
            projectStream = new FileOutputStream("Project1.xml");
            newProject.save(projectStream, SaveFileFormat.XML);
            projectStream.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }

        //Display result of conversion.
        System.out.println("Project file generated Successfully");
    }
}




