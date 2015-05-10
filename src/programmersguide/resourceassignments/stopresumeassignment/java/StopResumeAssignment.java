/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.resourceassignments.stopresumeassignment.java;

import com.aspose.tasks.*;

public class StopResumeAssignment
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/resourceassignments/stopresumeassignment/data/";
        
        Project prj = new Project(dataDir + "project5.mpp");

	for (ResourceAssignment ra:prj.getResourceAssignments())
	{
  		if (ra.get(Asn.STOP).toString() == "1/1/2000")
     		System.out.println("NA");
  		else
     		System.out.println(ra.get(Asn.STOP).toString());
  		if (ra.get(Asn.RESUME).toString() == "1/1/2000")
     		System.out.println("NA");
  		else
     		System.out.println(ra.get(Asn.RESUME).toString());
    	}
    }
}




