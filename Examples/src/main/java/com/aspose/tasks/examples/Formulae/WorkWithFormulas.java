/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Formulae;

import com.aspose.tasks.*;

import java.util.Calendar;

public class WorkWithFormulas {
    public static void main(String[] args) {
        TaskFieldsFormula();
        UsingArithmeticExpression();
        UsingTaskNumberFields();
        FormulaWithBooleanValues();
        FormulaWithProjectFields();
    }

    private static void TaskFieldsFormula() {
        // ExStart: TaskFieldsFormula
        // see this helper method below
        Project project = CreateTestProjectWithCustomField();

        ExtendedAttributeDefinition attr = project.getExtendedAttributes().get(0);
        attr.setAlias("Days from finish to deadline");
        attr.setFormula("[Deadline] - [Finish]");

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2015, Calendar.MARCH, 26, 8, 0, 0);

        Task task = project.getRootTask().getChildren().getById(1);
        task.set(Tsk.DEADLINE, cal.getTime());

        project.save("SaveFile.mpp", SaveFileFormat.Mpp);
        // ExEnd: TaskFieldsFormula
    }

    private static Project CreateTestProjectWithCustomField() {
        // ExStart: CreateTestProjectWithCustomField
        // Create new project instance
        Project project = new Project();

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2015, Calendar.MARCH, 26, 8, 0, 0);

        project.set(Prj.START_DATE, cal.getTime());

        // Add new task with extended attribute
        Task task = project.getRootTask().getChildren().add("Task");
        ExtendedAttributeDefinition extendedAttributeDefinition = ExtendedAttributeDefinition.createTaskDefinition(CustomFieldType.Text, ExtendedAttributeTask.Text5, "My Ext Attr");
        project.getExtendedAttributes().add(extendedAttributeDefinition);
        ExtendedAttribute extendedAttribute = extendedAttributeDefinition.createExtendedAttribute();
        task.getExtendedAttributes().add(extendedAttribute);

        // Add resource and resource assignment
        Resource rsc = project.getResources().add("Rsc");
        project.getResourceAssignments().add(task, rsc);
        return project;
        // ExEnd: CreateTestProjectWithCustomField
    }

    private static void UsingArithmeticExpression() {
        // ExStart:UsingArithmeticExpression
        Project project = CreateTestProjectWithCustomField();

        // Set arithmetic formula for extended attribute
        ExtendedAttributeDefinition attr = project.getExtendedAttributes().get(0);
        attr.setAlias("Arithmetic Expression");
        attr.setFormula("(1+3*(2+ -5)+8/2)^3");

        // Display extended attribute value
        Task task = project.getRootTask().getChildren().getById(1);
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());
        // ExEnd:UsingArithmeticExpression
    }

    private static void UsingTaskNumberFields() {
        // ExStart:UsingTaskNumberFields
        Project project = CreateTestProjectWithCustomField();

        // Set Formula
        ExtendedAttributeDefinition attr = project.getExtendedAttributes().get(0);
        attr.setAlias("Task number fields");
        attr.setFormula("(([Outline Level] + [Priority] + [% Complete])/2");

        Task task = project.getRootTask().getChildren().getById(1);

        // Print extended attribute value before and after updating task percent complete
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        task.set(Tsk.PERCENT_COMPLETE, 50);
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());
        // ExEnd:UsingTaskNumberFields
    }

    private static void FormulaWithBooleanValues() {
        // ExStart:FormulaWithBooleanValues
        Project project = CreateTestProjectWithCustomField();

        // Set formula for extended attribute
        project.getExtendedAttributes().get(0).setFormula("[Critical]-[Marked]+4+[Active]-Not [Active]");

        // Print value of extended attribute
        Task task = project.getRootTask().getChildren().getById(1);
        System.out.println("Formula with boolean values" + task.getExtendedAttributes().get(0).getTextValue());
        // ExEnd:FormulaWithBooleanValues
    }

    private static void FormulaWithProjectFields() {
        // ExStart:FormulaWithProjectFields
        Project project = CreateTestProjectWithCustomField();

        // Set formula for extended attribute
        project.getExtendedAttributes().get(0).setFormula("\"Total tasks: \" & [Task Count] & \" Total resources: \" & [Resource Count]");

        // Print value of extended attribute
        Task task = project.getRootTask().getChildren().getById(1);
        System.out.println("Formula with boolean values" + task.getExtendedAttributes().get(0).getTextValue());
        // ExEnd:FormulaWithProjectFields
    }
}
