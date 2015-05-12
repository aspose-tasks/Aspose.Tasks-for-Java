/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
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
	
	Project prj = new Project(dataDir + "project5.mpp");
	for (Resource res: prj.getResources())
	{
  	    if(res.get(Rsc.NAME) != null)
  	    {
    		System.out.println(res.get(Rsc.COST));
    		System.out.println(res.get(Rsc.ACWP));
    		System.out.println(res.get(Rsc.BCWS));
    		System.out.println(res.get(Rsc.BCWP));
  	    }
	}        
    }
}




