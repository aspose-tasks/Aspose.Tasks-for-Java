/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.savingprojectascsvtextandtemplate.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class SavingProjectAsCsvTextAndTemplate
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/savingprojectascsvtextandtemplate/data/";

        savingprojectascsv();

	savingprojectastext();

	savingprojectastemplate();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void savingprojectascsv()
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/savingprojectascsvtextandtemplate/data/";

	Project project = new Project(dataDir + "Project5.mpp");
	project.save("Project5.csv", SaveFileFormat.CSV);
        
    }

    public static void savingprojectastext()
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/savingprojectascsvtextandtemplate/data/";
		
	Project project = new Project(dataDir + "Project5.mpp");
	project.save("Project5.txt", SaveFileFormat.TXT);
           
    }    

    public static void savingprojectastemplate()
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/savingprojectascsvtextandtemplate/data/";

	String projectName = "Blank2010.mpp"; // any mpp file (here 2010 format used)
	Project project = new Project(projectName);
	ProjectFileInfo projectFileInfo = new ProjectReader().readProjectFileInfo(projectName);
	if (FileFormat.MPP14 == projectFileInfo.getProjectFileFormat())
	{
	    System.out.println("Project file format is ok");
	}
	SaveTemplateOptions options = new SaveTemplateOptions();
	options.setRemoveActualValues(true);
	options.setRemoveBaselineValues(true);

	String templateName = "result.mpt";
	project.saveAsTemplate(templateName);

	ProjectFileInfo templateFileInfo = new ProjectReader().readProjectFileInfo(templateName);
	if (FileFormat.MPT14 == templateFileInfo.getProjectFileFormat())
	{
	    System.out.println("Template FileFormat is ok");
	}

    }
}




