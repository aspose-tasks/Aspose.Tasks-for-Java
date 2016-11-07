/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Date;

import com.aspose.tasks.DateFormat;
import com.aspose.tasks.PdfSaveOptions;
import com.aspose.tasks.PresentationFormat;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.SaveOptions;
import com.aspose.tasks.TextItemType;
import com.aspose.tasks.TextStyle;
import com.aspose.tasks.Timescale;
import com.aspose.tasks.examples.Utils;

public class SaveAsPdf {
	public static void main(String[] args) throws Exception {
		// ExStart: saving-as-pdf
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(SaveAsPdf.class);

		// Read the input Project file
		Project project = new Project(dataDir + "project6.mpp");

		// Save the Project as PDF
		project.save(dataDir + "Project5.pdf", SaveFileFormat.PDF);

		// Fitting contents to cell size
		Project project1 = new Project(dataDir + "project6.mpp");
		SaveOptions o = new PdfSaveOptions();

		// Set the LegendOnEachPage property to false to hide legends

		// Set the row height to fit cell content
		o.setFitContent(true);
		o.setTimescale(Timescale.Months);
		o.setPresentationFormat(PresentationFormat.TaskUsage);
		project1.save("result_months.pdf", o);
		o.setLegendOnEachPage(false);
		project1.save(dataDir + "result_months_WithoutLegend.pdf", o);

		// Display result of conversion.
		System.out.println("Process completed Successfully");
		// ExEnd: saving-as-pdf

		// ExStart: save-to-multiple-pdf-pages
		Project project2 = new Project("RenderMe.mpp");
		PdfSaveOptions saveOptions = new PdfSaveOptions();
		saveOptions.setSaveToSeparateFiles(true);
		ArrayList<Integer> arl = new ArrayList<Integer>();
		saveOptions.setPages(arl);
		saveOptions.getPages().add(1);
		saveOptions.getPages().add(4);
		project2.save("result.pdf", saveOptions);
		// ExEnd: save-to-multiple-pdf-pages

		// ExStart: customizing-text-style-for-project-data
		Project project3 = new Project("Advanced Assignments A_Start.mpp");
		SaveOptions options = new PdfSaveOptions();
		options.setPresentationFormat(PresentationFormat.ResourceSheet);

		TextStyle style = new TextStyle();
		style.setColor(Color.ORANGE);
		style.setFontStyle(1);
		style.setItemType(TextItemType.OverallocatedResources);

		options.setTextStyles(new ArrayList<TextStyle>());
		options.getTextStyles().add(style);
		project3.save("temp.pdf", options);
		// ExEnd: customizing-text-style-for-project-data

		/*
		Project project4 = new Project();
		Date dt = new Date();
		project4.setStartDate(dt);
		// By default project.DateFormat == DateFormat.Date_ddd_mm_dd_yy (Mon 09/22/14)

		// customize DateFormat (September 22, 2014)
		project4.setDateFomrat(DateFormat.DateMmmmDdYyyy);
		project4.save("saved.pdf", SaveFileFormat.PDF);

		//Export to date format 19/07/2016
		project4.setDateFomrat(DateFormat.DateDdMmYyyy);
		project4.save("p2.pdf", SaveFileFormat.PDF);*/
		 

	}
}
