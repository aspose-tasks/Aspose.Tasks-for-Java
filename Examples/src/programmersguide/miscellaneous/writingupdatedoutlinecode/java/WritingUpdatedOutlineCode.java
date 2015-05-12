/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.miscellaneous.writingupdatedoutlinecode.java;

import com.aspose.tasks.*;

public class WritingUpdatedOutlineCode
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/miscellaneous/writingupdatedoutlinecode/data/";
	

	String newFile = "New Project 2013.mpp";

	String resultFile = "OutputMPP.mpp";

	Project project = new Project(newFile);
	ArrayList projectOutlCodes = new ArrayList();
	Project project = new Project(dataDir + "New project 2010.mpp");

	OutlineCodeDefinition code1 = new OutlineCodeDefinition();
	code1.setAlias("New task outline code1");
	code1.setFieldId(String.valueOf((int) ExtendedAttributeTask.OutlineCode1));
	code1.setFieldName("Outline Code1");

	OutlineMask mask = new OutlineMask();
	mask.setSeparator("+");
	mask.setLevel(1);
	mask.setType(MaskType.Numbers);
	
	code1.getMasks().add(mask);

	OutlineValue value = new OutlineValue();
	value.setDescription("Value description");
	value.setValueId(1);
	value.setValue("123456");
	value.setType(OutlineValueType.Number);

	code1.getValues().add(value);

	project.getOutlineCodes().add(code1);

	OutlineCodeDefinition code2 = new OutlineCodeDefinition();
	code2.setAlias("New rsc outline code2");
	code2.setFieldId(String.valueOf((int)ExtendedAttributeResource.OutlineCode2));
	code2.setFieldName("Outline Code2");
	
	OutlineMask mask2 = new OutlineMask();
	mask2.setSeparator("/");
	mask2.setLevel(1);
	mask2.setType(MaskType.Numbers);

	code2.getMasks().add(mask2);

	OutlineValue value2 = new OutlineValue();
	value2.setDescription("Value2 description");
	value2.setValueId(2);
	value2.setValue("987654");
	value2.setType(OutlineValueType.Number);

	//Save the Project
	project.save("Project.Mpp", SaveFileFormat.MPP);
  
        
    }
}




