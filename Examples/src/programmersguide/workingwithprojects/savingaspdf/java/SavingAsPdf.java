/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.savingaspdf.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class SavingAsPdf
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/savingaspdf/data/";

		// Read the input Project file
		Project project = new Project(dataDir + "Homemoveplan.mpp");

		// Save the Project as PDF
		project.save(dataDir + "Project5.pdf", SaveFileFormat.PDF);

		// Fitting contents to cell size
		Project project1 = new Project("project6.mpp");
		SaveOptions o = new PdfSaveOptions();

		// Set the LegendOnEachPage property to false to hide legends

		// Set the row height to fit cell content
		o.setFitContent(true);
		o.setTimescale(Timescale.Months);
		o.setPresentationFormat(PresentationFormat.TaskUsage);
		project1.save("result_months.pdf", o);
		o.setLegendOnEachPage(false);
		project1.save(dataDir + "result_months_WithoutLegend.pdf", o);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




