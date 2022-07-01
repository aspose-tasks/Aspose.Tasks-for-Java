/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Formulae;

import com.aspose.tasks.*;

public class SupportEvaluationFunctions {
    public static void main(String[] args) throws Exception {
        CalculationOfMathExpressions();

        EvaluateChoose();
        EvaluateIsNumeric();
        EvaluateSwitch();

        CalculationOfTextFunctions();
        CalculationOfDateTimeFunctions();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    private static Project CreateTestProjectWithCustomField() {
        Project project = new Project();
        ExtendedAttributeDefinition attr = ExtendedAttributeDefinition.createTaskDefinition(CustomFieldType.Number, ExtendedAttributeTask.Number1, "Sine");
        project.getExtendedAttributes().add(attr);

        Task task = project.getRootTask().getChildren().add("Task");

        ExtendedAttribute a = attr.createExtendedAttribute();
        task.getExtendedAttributes().add(a);
        return project;
    }

    public static void CalculationOfMathExpressions() {
        //ExStart: CalculationOfMathExpressions
        Project project = CreateTestProjectWithCustomField();

        // Set formula Sin(pi/2)
        project.getExtendedAttributes().get(0).setFormula("Sin(3.1415926/2)");

        // Print Calculated value
        Task task = project.getRootTask().getChildren().getById(1);
        System.out.println("Sin(pi/2): {0}" + task.getExtendedAttributes().get(0).getNumericValue());
        //ExEnd: CalculationOfMathExpressions
    }

    //ExStart: CalculationOfGeneralFunctions
    public static void EvaluateChoose() {
        Project project = CreateTestProjectWithCustomField();

        // Set Formula
        project.getExtendedAttributes().get(0).setFormula("Choose(3, \"This is a\", \"right\", \"choice\")");

        // Print extended attribute value
        Task task = project.getRootTask().getChildren().getById(1);
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());
    }

    public static void EvaluateIsNumeric() {
        String[] numericFormulas = {
                "IsNumeric('AAA')",
                "IsNUmeric(1)",
                "IsNumeric(1<0)",
                "IsNumeric(\"1.1\")",
                "IsNumeric(Choose((2 + Sgn(2^-3)), 123, \"one two three\"))"
        };

        Project project = CreateTestProjectWithCustomField();

        for (String numericFormula : numericFormulas) {
            // Set Formula
            project.getExtendedAttributes().get(0).setFormula(numericFormula);

            // Print extended attribute value
            Task task = project.getRootTask().getChildren().getById(1);
            System.out.println(task.getExtendedAttributes().get(0).getNumericValue());
        }
    }

    public static void EvaluateSwitch() {
        Project project = CreateTestProjectWithCustomField();

        // Set Formula
        project.getExtendedAttributes().get(0).setFormula("Switch( 0 < 1, \"0 is lesser than 1\", 0 > 1, \"0 is greater than 1\")");

        // Print extended attribute value
        Task task = project.getRootTask().getChildren().getById(1);
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());
    }
    //ExEnd: CalculationOfGeneralFunctions

    public static void CalculationOfTextFunctions() {
        //ExStart: CalculationOfTextFunctions
        Project project = CreateTestProjectWithCustomField();
        Task task = project.getRootTask().getChildren().getById(1);

        // EvaluateStrConv
        // Set formulas and print extended attribute value
        project.getExtendedAttributes().get(0).setFormula("StrConv(\"sTring and sTRINg\",3)");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        project.getExtendedAttributes().get(0).setFormula("StrConv(\"sTring and sTRINg\",1)");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        project.getExtendedAttributes().get(0).setFormula("StrConv(\"sTring and sTRINg\",2)");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        // EvaluateStringFunction
        // Set formulas and print extended attribute value
        project.getExtendedAttributes().get(0).setFormula("String(5, 40)");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        project.getExtendedAttributes().get(0).setFormula("String(5, \"A\")");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        project.getExtendedAttributes().get(0).setFormula("String(-5, \"A\")");
        // #Error
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());
        //ExEnd: CalculationOfTextFunctions
    }

    public static void CalculationOfDateTimeFunctions() {
        //ExStart: CalculationOfDateTimeFunctions
        Project project = CreateTestProjectWithCustomField();
        Task task = project.getRootTask().getChildren().getById(1);

        ExtendedAttributeDefinition numberDefinition = ExtendedAttributeDefinition.createTaskDefinition(ExtendedAttributeTask.Number1, null);
        project.getExtendedAttributes().add(numberDefinition);

        ExtendedAttribute numberAttribute = numberDefinition.createExtendedAttribute();
        task.getExtendedAttributes().add(numberAttribute);

        // Set ProjDateDiff formula and print extended attribute value
        numberDefinition.setFormula("ProjDateDiff(\"03/23/2015\",\"03/18/2015\")");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        numberDefinition.setFormula("ProjDateDiff(\"03/23/2015\",\"03/25/2015\")");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        ExtendedAttributeDefinition dateDefinition = ExtendedAttributeDefinition.createTaskDefinition(ExtendedAttributeTask.Date1, null);
        project.getExtendedAttributes().add(dateDefinition);
        ExtendedAttribute dateAttribute = dateDefinition.createExtendedAttribute();
        task.getExtendedAttributes().add(dateAttribute);

        ExtendedAttributeDefinition durationDefinition = ExtendedAttributeDefinition.createTaskDefinition(ExtendedAttributeTask.Duration4, "Custom duration field");
        project.getExtendedAttributes().add(durationDefinition);
        ExtendedAttribute durationAttribute = durationDefinition.createExtendedAttribute();
        task.getExtendedAttributes().add(durationAttribute);

        ExtendedAttributeDefinition textDefinition = ExtendedAttributeDefinition.createTaskDefinition(ExtendedAttributeTask.Text5, "Custom text field");
        project.getExtendedAttributes().add(textDefinition);
        ExtendedAttribute textAttribute = textDefinition.createExtendedAttribute();
        task.getExtendedAttributes().add(textAttribute);

        // Set ProjDateSub formula and print extended attribute value
        dateDefinition.setFormula("ProjDateSub(\"3/19/2015\", \"1d\")");
        System.out.println(dateAttribute.getDateValue());

        // We can set ProjDurConv formula to duration-valued attribute as well as to text-valued attribute.

        // Set ProjDurConv formula to duration-valued extended attribute and print its value.
        durationDefinition.setFormula("ProjDurConv([Duration], pjHours)");
        System.out.println(durationAttribute.getDurationValue());

        // Set ProjDurConv formula to text-valued extended attribute and print its value.
        textDefinition.setFormula("ProjDurConv([Duration], pjHours)");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        textDefinition.setFormula("ProjDurConv([Duration], pjWeeks)");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        // Set Second formula and print extended attribute value
        numberDefinition.setFormula("Second(\"4/21/2015 2:53:41 AM\")");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        // Set Weekday formula and print extended attribute value
        numberDefinition.setFormula("Weekday(\"24/3/2015\", 1)");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        numberDefinition.setFormula("Weekday(\"24/3/2015\", 2)");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());

        numberDefinition.setFormula("Weekday(\"24/3/2015\", 3)");
        System.out.println(task.getExtendedAttributes().get(0).getNumericValue());
        //ExEnd: CalculationOfDateTimeFunctions
    }
}




