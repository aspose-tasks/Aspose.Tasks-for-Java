package com.aspose.tasks.examples.ResourceAssignments;

import java.util.*;  
import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceAssignment;
import com.aspose.tasks.Task;
import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;


public class ReadSharedResourceAssignments {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// The path to the documents directory.
        String dataDir = Utils.getDataDir(CreateResourceAssignments.class);

        // ExStart: ReadSharedResourceAssignments
        // suppose “test.mpp” contains resource from resource pool and assignments from other projects
        Project project = new Project(dataDir + "test.mpp");
        Resource resource = project.getResources().getByUid(1);
        // Units are calculated using assignments from other projects.
        Double units = resource.get(Rsc.PEAK_UNITS); 
        // ExEnd: ReadSharedResourceAssignments
	}

}
