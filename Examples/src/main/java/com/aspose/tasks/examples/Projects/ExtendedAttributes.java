/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import java.util.Date;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ExtendedAttributes {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project prj = new Project(dataDir + "project5.mpp");
        ExtendedAttributeDefinitionCollection eads = prj.getExtendedAttributes();

        // Create extended attribute definition
        ExtendedAttributeDefinition attributeDefinition = ExtendedAttributeDefinition.createTaskDefinition(CustomFieldType.Start, ExtendedAttributeTask.Start7, "Start 7");
        prj.getExtendedAttributes().add(attributeDefinition);

        eads.add(attributeDefinition);

        // Get zero index task
        Task tsk = prj.getRootTask().getChildren().getById(1);
        ExtendedAttributeCollection eas = tsk.getExtendedAttributes();

        // Add extended attribute
        ExtendedAttribute ea = attributeDefinition.createExtendedAttribute();

        Date date = new Date();
        ea.setDateValue(date);

        eas.add(ea);

        prj.save(outDir + "project5_out.xml", SaveFileFormat.Xml);

        // Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}
