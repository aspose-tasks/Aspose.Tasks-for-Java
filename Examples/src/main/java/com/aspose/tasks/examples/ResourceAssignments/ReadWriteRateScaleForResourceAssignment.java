package com.aspose.tasks.examples.ResourceAssignments;

import java.io.IOException;

import com.aspose.tasks.Asn;
import com.aspose.tasks.Project;
import com.aspose.tasks.RateScaleType;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceAssignment;
import com.aspose.tasks.ResourceType;
import com.aspose.tasks.Rsc;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.Task;
import com.aspose.tasks.examples.Utils;

public class ReadWriteRateScaleForResourceAssignment {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		//ExStart: ReadWriteRateScaleForResourceAssignment
		String dataDir = Utils.getDataDir(AssignmentCost.class);
		
		Project project = new Project(dataDir + "New project 2013.mpp");

		Task task = project.getRootTask().getChildren().add("t1");

		Resource materialResource = project.getResources().add("materialResource");
		materialResource.set(Rsc.TYPE, ResourceType.Material);

		Resource nonMaterialResource = project.getResources().add("nonMaterialResource");
		nonMaterialResource.set(Rsc.TYPE, ResourceType.Work);

		ResourceAssignment materialResourceAssignment = project.getResourceAssignments().add(task, materialResource);
		materialResourceAssignment.set(Asn.RATE_SCALE, RateScaleType.Week);

		ResourceAssignment nonMaterialResourceAssignment = project.getResourceAssignments().add(task, nonMaterialResource);
		nonMaterialResourceAssignment.set(Asn.RATE_SCALE, RateScaleType.Week);

		project.save("output.mpp", SaveFileFormat.MPP);

		Project resavedProject = new Project("output.mpp");

		ResourceAssignment resavedMaterialResourceAssignment = resavedProject.getResourceAssignments().getByUid(1);
		System.out.println(resavedMaterialResourceAssignment.get(Asn.RATE_SCALE));

		// only material resource assignments can have non-zero rate scale value.
		ResourceAssignment resavedNonMaterialResourceAssignment = resavedProject.getResourceAssignments().getByUid(2);
		//ExEnd:ReadWriteRateScaleForResourceAssignment
	}

}
