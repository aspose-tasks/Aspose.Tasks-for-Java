package com.aspose.tasks.examples.ResourceAssignments;

import java.io.IOException;
import java.math.BigDecimal;

import com.aspose.tasks.CustomFieldType;
import com.aspose.tasks.ExtendedAttribute;
import com.aspose.tasks.ExtendedAttributeDefinition;
import com.aspose.tasks.ExtendedAttributeResource;
import com.aspose.tasks.ExtendedAttributeTask;
import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceAssignment;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.Task;
import com.aspose.tasks.Value;
import com.aspose.tasks.examples.Utils;

public class AddExtendedAttributesToResourceAssignments {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		AddPlainExtendedAttributeToResourceAssignment();
		AddLookUpExtendedAttributeToResourceAssignment();
	}

	public static void AddPlainExtendedAttributeToResourceAssignment() throws IOException {
		String dataDir = Utils.getDataDir(AddExtendedAttributesToResourceAssignments.class);

		// ExStart: AddPlainExtendedAttributeToResourceAssignment
		Project project = new Project(dataDir + "Blank2010.mpp");

		// Add new task and resource
		Task task1 = project.getRootTask().getChildren().add("Task");
		Resource rsc1 = project.getResources().add("Rsc");

		// Assign the resource desired task
		ResourceAssignment assn = project.getResourceAssignments().add(task1, rsc1);

		ResourceAssignment assignment = project.getResourceAssignments().toList().get(0);

		// Custom attributes which is visible in "Resource Usage" view can be created
		// with ExtendedAttributeDefinition.CreateResourceDefinition method.
		ExtendedAttributeDefinition resCostAttr = ExtendedAttributeDefinition
				.createResourceDefinition(CustomFieldType.Cost, ExtendedAttributeResource.Cost5, "My cost");

		project.getExtendedAttributes().add(resCostAttr);

		ExtendedAttribute value = resCostAttr.createExtendedAttribute();
		value.setNumericValue(BigDecimal.valueOf(1500));
		assignment.getExtendedAttributes().add(value);

		// Custom attributes which is visible in "Task Usage" view can be created with
		// ExtendedAttributeDefinition.CreateTaskDefinition method
		ExtendedAttributeDefinition resCostAttr2 = ExtendedAttributeDefinition
				.createTaskDefinition(CustomFieldType.Cost, ExtendedAttributeTask.Cost5, "My cost for task");

		project.getExtendedAttributes().add(resCostAttr2);

		value = resCostAttr2.createExtendedAttribute();
		value.setNumericValue(BigDecimal.valueOf(2300));

		assignment.getExtendedAttributes().add(value);

		project.save(dataDir + "AddExtendedAttributesToResourceAssignment_out.mpp", SaveFileFormat.MPP);
		// ExEnd: AddPlainExtendedAttributeToResourceAssignment
	}

	public static void AddLookUpExtendedAttributeToResourceAssignment() throws IOException {
		String dataDir = Utils.getDataDir(AddExtendedAttributesToResourceAssignments.class);
		// ExStart: AddLookUpExtendedAttributeToResourceAssignment
		Project project = new Project(dataDir + "Blank2010.mpp");

		ExtendedAttributeDefinition resCostAttr = ExtendedAttributeDefinition.createLookupResourceDefinition(
				CustomFieldType.Cost, ExtendedAttributeResource.Cost5, "My lookup cost");

		Value value1 = new Value();
		value1.setNumericValue(BigDecimal.valueOf(1500));
		value1.setDescription("Val 1");
		value1.setId(1);
		value1.setVal("1500");

		resCostAttr.addLookupValue(value1);

		Value value2 = new Value();
		value1.setNumericValue(BigDecimal.valueOf(2500));
		value1.setDescription("Val 2");
		value1.setId(2);

		resCostAttr.addLookupValue(value2);

		project.getExtendedAttributes().add(resCostAttr);

		ExtendedAttribute value = resCostAttr.createExtendedAttribute(value1);
		value.setNumericValue(BigDecimal.valueOf(1500));
		project.save(dataDir + "AddExtendedAttributesToRAWithLookUp_out.mpp", SaveFileFormat.MPP);
		// ExEnd: AddLookUpExtendedAttributeToResourceAssignment
	}
}
