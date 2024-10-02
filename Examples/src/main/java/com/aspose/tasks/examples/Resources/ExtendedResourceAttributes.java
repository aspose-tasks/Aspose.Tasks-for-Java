/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Resources;

import com.aspose.tasks.ExtendedAttribute;
import com.aspose.tasks.ExtendedAttributeDefinition;
import com.aspose.tasks.ExtendedAttributeResource;
import com.aspose.tasks.ExtendedAttributeTask;
import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

import java.math.BigDecimal;

public class ExtendedResourceAttributes {
    public static void main(String[] args) {
        // ExStart: ExtendedResourceAttributes
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExtendedResourceAttributes.class);

        Project prj = new Project(dataDir + "ResourceWithExtAttribs.xml");

        // Define extended attribute
        ExtendedAttributeDefinition myNumber1 = prj.getExtendedAttributes().getById((int) ExtendedAttributeTask.Number1);
        if (myNumber1 == null) {
            myNumber1 = ExtendedAttributeDefinition.createResourceDefinition(ExtendedAttributeResource.Number1, "Age");
            prj.getExtendedAttributes().add(myNumber1);
        }

        // Create extended attribute and set its value
        ExtendedAttribute number1Resource = myNumber1.createExtendedAttribute();
        number1Resource.setNumericValue(BigDecimal.valueOf(30.5345));

        // Add a new resource and its extended attribute
        Resource rsc = prj.getResources().add("R1");
        rsc.getExtendedAttributes().add(number1Resource);

        prj.save(dataDir + "project5.xml", SaveFileFormat.Xml);

        // Display result of conversion.
        System.out.println("Process completed Successfully");
        // ExEnd: ExtendedResourceAttributes
    }
}
