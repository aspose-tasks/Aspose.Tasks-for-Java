/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.determiningprojectversion.java;

import com.aspose.tasks.Project;
import com.aspose.tasks.Task;

import java.util.Date;
import java.util.List;

public class DeterminingProjectVersion
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/determiningprojectversion/data/";

        Project project = new Project(dataDir + "input.xml");

        //Display project version property
        System.out.println("Project Version : " + project.get(Prj.SAVE_VERSION));
        System.out.println("Last Saved : " + project.get(Prj.LAST_SAVED));

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




