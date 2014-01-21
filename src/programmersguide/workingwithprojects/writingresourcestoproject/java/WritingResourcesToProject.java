/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.writingresourcestoproject.java;

import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceType;
import com.aspose.tasks.SaveFileFormat;

import java.util.List;

public class WritingResourcesToProject
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/writingresourcestoproject/data/";

        //create a prject instance
        Project prj = new Project();

        Resource res1 = prj.addResource("Res1");
        Resource res2 = prj.addResource("Res2");

        res1.setType(ResourceType.Work);
        res2.setType(ResourceType.Material);
        prj.save(dataDir + "project.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




