/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithformulae.writingandreadingformula.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class writingandreadingformula
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithformulae/writingandreadingformula/data/";

        writingformulasinextendedattributes();

	readingformulasinlocalandenterpriseextendedattributes();

	readonlyaccesstocustomfieldvalues();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void writingformulasinextendedattributes()
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithformulae/writingandreadingformula/data/";


	Project project = new Project(dataDir + "New project 2010.mpp");
	project.set(Prj.NEW_TASKS_ARE_MANUAL, new NullableBool(false));

	// create new custom field (Task Text1) with formula which will double task cost
	ExtendedAttributeDefinition attr = new ExtendedAttributeDefinition();
	project.getExtendedAttributes().add(attr);

	attr.setFieldId(Integer.toString(ExtendedAttributeTask.Text1));
	attr.setAlias("Double Costs");
	//
	attr.setFormula("[Cost]*2");

	// add a task to see the result in MSP
	Task task = project.getRootTask().getChildren().add("Task");
	// set task cost
	task.set(Tsk.COST, BigDecimal.valueOf(100));
	// see the result in the attached screenshot (result.jpg)
	project.save("saved.mpp", SaveFileFormat.MPP);
        
    }

    public static void readingformulasinlocalandenterpriseextendedattributes()
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithformulae/writingandreadingformula/data/";

        Project proj = new Project(dataDir + "FormulaField.mpp"); // attached test mpp
	ExtendedAttributeDefinition attr = proj.getExtendedAttributes().get(0);

	System.out.println("Attribute Formula: " + attr.getFormula());
    }    

    public static void readonlyaccesstocustomfieldvalues()
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithformulae/writingandreadingformula/data/";

	Project project = new Project();

	ExtendedAttributeDefinition attr = new ExtendedAttributeDefinition();
	attr.setFieldId(Integer.toString(ExtendedAttributeTask.Text1));
	attr.setFormula("[Cost]-[Actual Cost]");
	project.getExtendedAttributes().add(attr);

	Task task = project.getRootTask().getChildren().add("Task");

	ExtendedAttribute a = attr.createExtendedAttribute();
	task.getExtendedAttributes().add(a);

	System.out.println(a.getValueReadOnly() == true ? "Value is Read only" : "Value is not read only");

	//This should not work
	a.setValue("Invalid");

	System.out.println(a.getValue() == "" ? "Formula values are read-only" : "Values are not read-only");

    }  
 
}




