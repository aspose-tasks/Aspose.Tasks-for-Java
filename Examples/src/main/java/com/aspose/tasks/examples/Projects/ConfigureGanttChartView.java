/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ConfigureGanttChartView {
	public static void main(String[] args) throws Exception {
		// ExStart: configure-gantt-view
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ConfigureGanttChartView.class);

		Project project = new Project(dataDir + "New project 2010.mpp");

		// Create a new project task
		Task task = project.getRootTask().getChildren().add("New Activity");

		// Add custom text attribute to created task.
		ExtendedAttribute attr = new ExtendedAttribute();
		attr.setFieldId(String.valueOf((int) ExtendedAttributeTask.Text1));
		attr.setValue("Activity attribute");

		task.getExtendedAttributes().add(attr);

		// Customize table by adding text attribute field
		TableField attrField = new TableField();
		attrField.setField(Field.TaskText1);
		attrField.setWidth(20);
		attrField.setTitle("Custom attribute");
		attrField.setAlignTitle(StringAlignment.Center);
		attrField.setAlignData(StringAlignment.Center);

		Table table = project.getTables().toList().get(0);
		table.getTableFields().add(3, attrField);

		// The result of opening of saved project in MSP2010 is in attached
		// screenshot
		project.save("saved.mpp", SaveFileFormat.MPP);

		// ExEnd: configure-gantt-view

	}
}
