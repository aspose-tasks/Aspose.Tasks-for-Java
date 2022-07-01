/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ConfigureGanttChartView {
    public static void main(String[] args) throws Exception {
        // ExStart:ConfigureGantChart
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ConfigureGanttChartView.class);

        Project project = new Project(dataDir + "project.mpp");

        // Create a new project task
        Task task = project.getRootTask().getChildren().add("New Activity");

        // Define new custom attribute
        ExtendedAttributeDefinition text1Definition = ExtendedAttributeDefinition.createTaskDefinition(ExtendedAttributeTask.Text1, null);
        project.getExtendedAttributes().add(text1Definition);
        // Add custom text attribute to created task.
        task.getExtendedAttributes().add(text1Definition.createExtendedAttribute("Activity attribute"));

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
        project.save("saved.mpp", SaveFileFormat.Mpp);
        // ExEnd:ConfigureGantChart
    }
}




