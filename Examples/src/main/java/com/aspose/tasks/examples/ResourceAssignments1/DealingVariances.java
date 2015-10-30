/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.ResourceAssignments1;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class DealingVariances
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(DealingVariances.class);
        
        Project project = new Project(dataDir + "project5.mpp");

        for (ResourceAssignment ra:project.getResourceAssignments())
        {
            System.out.println(ra.get(Asn.WORK_VARIANCE));
                System.out.println(ra.get(Asn.COST_VARIANCE));
                System.out.println(ra.get(Asn.START_VARIANCE));
                System.out.println(ra.get(Asn.FINISH_VARIANCE));
        }
        
    }
}




