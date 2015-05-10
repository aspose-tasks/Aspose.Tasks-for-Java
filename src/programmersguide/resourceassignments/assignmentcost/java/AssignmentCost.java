/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.resourceassignments.assignmentcost.java;

import com.aspose.tasks.*;

public class AssignmentCost
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/resourceassignments/assignmentcost/data/";

	Project project = new Project(dataDir + "EarnedValues2010.mpp");

	for (int i=0;i<project.getResourceAssignments().getCount(); i++)
	{
		ResourceAssignment ra = project.getResourceAssignments().getByUid(0);
		System.out.println(ra.get(Asn.COST));
		System.out.println(ra.get(Asn.ACWP));
		System.out.println(ra.get(Asn.BCWP));
		System.out.println(ra.get(Asn.BCWS));
	}
        
        
    }
}




