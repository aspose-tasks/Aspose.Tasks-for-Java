/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Formulae;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.Objects;

public class WriteReadFormula {
    public static void main(String[] args) {
        writingFormulasInExtendedAttributes();

        readingFormulasInLocalAndEnterpriseExtendedAttributes();

        readOnlyAccessToCustomFieldValues();

        // Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void writingFormulasInExtendedAttributes() {
        // ExStart: writingFormulasInExtendedAttributes
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(WriteReadFormula.class);

        Project project = new Project(dataDir + "project.mpp");
        project.set(Prj.NEW_TASKS_ARE_MANUAL, new NullableBool(false));

        // create new custom field (Task Text1) with formula which will double task cost
        ExtendedAttributeDefinition attr = ExtendedAttributeDefinition.createTaskDefinition(CustomFieldType.Text, ExtendedAttributeTask.Text1, "Custom");
        attr.setAlias("Double Costs");
        attr.setFormula("[Cost]*2");

        project.getExtendedAttributes().add(attr);

        // add a task to see the result in MSP
        Task task = project.getRootTask().getChildren().add("Task");
        // set task cost
        task.set(Tsk.COST, BigDecimal.valueOf(100));
        // see the result in the attached screenshot (result.jpg)
        project.save(dataDir + "saved.mpp", SaveFileFormat.Mpp);
        // ExEnd: writingFormulasInExtendedAttributes
    }

    public static void readingFormulasInLocalAndEnterpriseExtendedAttributes() {
        // ExStart: readingFormulasInLocalAndEnterpriseExtendedAttributes
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(WriteReadFormula.class);

        Project proj = new Project(dataDir + "FormulaField.mpp"); // attached test mpp
        ExtendedAttributeDefinition attr = proj.getExtendedAttributes().get(0);

        System.out.println("Attribute Formula: " + attr.getFormula());
        // ExEnd: readingFormulasInLocalAndEnterpriseExtendedAttributes
    }

    public static void readOnlyAccessToCustomFieldValues() {
        // ExStart: readOnlyAccessToCustomFieldValues
        Project project = new Project();

        ExtendedAttributeDefinition attribute = ExtendedAttributeDefinition.createTaskDefinition(CustomFieldType.Cost, ExtendedAttributeTask.Cost1, "");
        attribute.setFormula("[Cost]-[Actual Cost]");

        project.getExtendedAttributes().add(attribute);

        // Add task
        Task task = project.getRootTask().getChildren().add("Task");

        // Create extended attribute
        ExtendedAttribute extendedAttribute = attribute.createExtendedAttribute();
        task.getExtendedAttributes().add(extendedAttribute);

        // Display if extended attributes are read only or not
        System.out.println(extendedAttribute.getValueReadOnly() ? "Value is Read only" : "Value is not read only");
        extendedAttribute.setTextValue("-36755");
        System.out.println(Objects.equals(extendedAttribute.getTextValue(), " ") ? "Formula values are read-only" : "Values are not read-only");
        // ExEnd: readOnlyAccessToCustomFieldValues
    }
}
