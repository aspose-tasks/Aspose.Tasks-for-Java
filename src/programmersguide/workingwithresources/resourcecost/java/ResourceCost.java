/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithresources.resourcecost.java;

import com.aspose.tasks.*;

public class ResourceCost
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithresources/resourcecost/data/";
        Project project = new Project(dataDir+ "project.mpp");

        for (int i=0;i<project.getResources().size();i++)
        {
            Resource res = project.getResources().get(i);
            System.out.println("Cost: " + res.getPercentWorkComplete());
            System.out.println("ACWP: " + res.getAcwp());
            System.out.println("BCWP: " + res.getBcwp());
            System.out.println("BCWS: " + res.getBcws());
            System.out.println("Accrue At: " + res.getAccrueAt());
        }
        
    }
}




