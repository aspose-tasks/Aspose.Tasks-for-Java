/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.configuringganttchartview.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class ConfiguringGanttChartView
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/configuringganttchartview/data/";

	Project project = new Project(dataDir + "New project 2010.mpp");

	// Create a new project task
	Task task = project.addTask("New Activity");

	// Add custom text attribute to created task.
	ExtendedAttribute attr = new ExtendedAttribute();
	attr.setFieldId(String.valueOf((int) ExtendedAttributeTask.Text1));
	attr.setValue("Activity attribute");

	task.getExtendedAttribute().add(attr);

	// Customize table by adding text attribute field
	TableField attrField = new TableField();
	attrField.setField(Field.TaskText1);
	attrField.setWidth(20);
	attrField.setTitle("Custom attribute");
	attrField.setAlignTitle(StringAlignment.Center);
	attrField.setAlignData(StringAlignment.Center);
	
	Table table = project.getTables().toList().get(0);
	table.getTableFields().add(3, attrField);

	// The result of opening of saved project in MSP2010 is in attached screenshot
	project.save("saved.mpp", SaveFileFormat.MPP);
	
    }
}




