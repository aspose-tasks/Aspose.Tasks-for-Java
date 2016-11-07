/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ExtendedAttributes {
	public static void main(String[] args) throws Exception {
		// ExStart: extending-attributes
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ExtendedAttributes.class);

		Project prj = new Project(dataDir + "project5.mpp");
		ExtendedAttributeDefinitionCollection eads = prj.getExtendedAttributes();
		// Create extended attribute definition
		ExtendedAttributeDefinition ead = new ExtendedAttributeDefinition();
		ead.setFieldId(Integer.toString(ExtendedAttributeTask.Start7));
		ead.setFieldName("Start7");
		eads.add(ead);

		// Get zero index task

		Task tsk = prj.getRootTask().getChildren().getById(1);
		ExtendedAttributeCollection eas = tsk.getExtendedAttributes();
		String dateTimeFormat = "yyyy-MM-ddTHH:mm:ss";
		ExtendedAttribute ea = new ExtendedAttribute();
		ea.setFieldId(ead.getFieldId());
		ea.setValue("2013-12-05 09:00:00");
		eas.add(ea);

		prj.save(dataDir + "Project5.xml", SaveFileFormat.XML);

		// Display result of conversion.
		System.out.println("Process completed Successfully");
		// ExEnd: extending-attributes
	}
}
