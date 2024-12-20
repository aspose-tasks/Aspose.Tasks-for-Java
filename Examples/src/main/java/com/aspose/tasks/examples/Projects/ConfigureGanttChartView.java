/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ConfigureGanttChartView {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

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
        attrField.setAlignTitle(HorizontalStringAlignment.Center);
        attrField.setAlignData(HorizontalStringAlignment.Center);

        Table table = project.getTables().toList().get(0);
        table.getTableFields().add(3, attrField);

        // The result of opening of saved project in MSP2010 is in attached screenshot
        project.save(outDir + "saved.mpp", SaveFileFormat.Mpp);
    }
}




