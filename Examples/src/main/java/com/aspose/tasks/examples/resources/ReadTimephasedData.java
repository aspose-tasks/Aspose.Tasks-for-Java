/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.resources;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ReadTimephasedData
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadTimephasedData.class);
           
        // Read Microsoft Project template file
        String fileName = "SampleProject.mpp";

        //Read the input file as Project
        Project project = new Project(dataDir + "SampleProject.mpp");

        //Get the Resource by its ID
        Resource resource = project.getResources().getByUid(1);

        // Print Timephased data of ResourceWork
        System.out.println("Timephased data of ResourceWork");
        for (TimephasedData td:resource.getTimephasedData(project.get(Prj.START_DATE), project.get(Prj.FINISH_DATE)))
        {
                System.out.println("Start: " + td.getStart().toString());
                System.out.println(" Work: " + td.getValue());
        }
        // Print Timephased data of ResourceCost
        System.out.println("Timephased data of ResourceCost");
        for (TimephasedData td:resource.getTimephasedData(project.get(Prj.START_DATE), project.get(Prj.FINISH_DATE), TimephasedDataType.ResourceCost))
        {
                System.out.println("Start: " + td.getStart().toString());
                System.out.println(" Cost: " + td.getValue());
        }


    }
}




