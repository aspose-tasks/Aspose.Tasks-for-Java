/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.addingandremovingresources.java;

import com.aspose.tasks.*;

import java.util.List;

public class AddingAndRemovingResources
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/addingandremovingresources/data/";

        Project prj = new Project(dataDir + "project.mpp");

        //remove resources
        List resources = prj.getResources();
        for(int i = 1 ; i < resources.size(); i++)
            prj.getResources().remove(i);

        //add a resource
        Resource recADD = prj.addResource("Added");
        recADD.setType(ResourceType.Work);

        //Display resources
        List alRecs = prj.getResources();
        for(int i = 0; i < alRecs.size(); i++)
        {
            Resource rec = (Resource)alRecs.get(i);
            if (rec.getName() != null)
            {
                System.out.println("Res Name = " + rec.getName());
                if(rec.getType() == ResourceType.Work)
                    System.out.println("Res Type = Work");
                else if(rec.getType() == ResourceType.Material)
                    System.out.println("Res Type = Material");

            }
        }

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




