/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.PdfSaveOptions;
import com.aspose.tasks.PresentationFormat;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveOptions;
import com.aspose.tasks.Timescale;
import com.aspose.tasks.examples.Utils;

public class RenderTaskUsage {
	public static void main(String[] args) throws Exception {
		//ExStart: render-task-usage
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RenderTaskUsage.class);
		//Read the source Project
		Project project = new Project(dataDir + "RenderMe.mpp");
		//Define the SaveOptions with required TimeScale settings as Days
		SaveOptions options = new PdfSaveOptions();
		options.setTimescale(Timescale.Days);
		//Set the Presentation format to ResourceUsage
		options.setPresentationFormat(PresentationFormat.TaskUsage);
		String days = "result_days.pdf";
		//Save the Project
		project.save(days, options);

		//Set the Tiemscale settings to ThirdsOfMonths
		options.setTimescale(Timescale.ThirdsOfMonths);
		String thirds = "result_thirdsOfMonths.pdf";
		//Save the Project
		project.save(thirds, options);

		//Set the Timescale settings to Months
		options.setTimescale(Timescale.Months);
		String months = "result_months.pdf";
		//Save the project
		project.save(months, options);
		//ExEnd: render-task-usage

	}
}
