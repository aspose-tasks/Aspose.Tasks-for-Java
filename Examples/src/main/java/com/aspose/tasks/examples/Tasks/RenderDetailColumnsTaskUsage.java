/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.StringAlignment;
import com.aspose.tasks.UsageView;
import com.aspose.tasks.examples.Utils;

public class RenderDetailColumnsTaskUsage {
	public static void main(String[] args) throws Exception {
		//ExStart: render-detail-column-task-usage
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(RenderTaskUsage.class);
		Project project = new Project(dataDir + "Advanced Tracking C_Start.mpp"); // attached test project
		// Default view in this mpp is TaskUsageView
		UsageView view = (UsageView) project.getDefaultView();// as TaskUsageView;

		// details header column will not be displayed
		view.setDisplayDetailsHeaderColumn(false);
		view.setRepeatDetailsHeaderOnAllRows(false);
		view.setAlignDetailsData(StringAlignment.Near);
		project.save("task usage1.pdf", SaveFileFormat.PDF);

		// display details header column
		view.setDisplayDetailsHeaderColumn(true);
		// Repeat details header on all assignments rows
		view.setRepeatDetailsHeaderOnAllRows(true);
		view.setAlignDetailsData(StringAlignment.Far);
		project.save("task usage2.pdf", SaveFileFormat.PDF);
		project.save("task usage2.pdf", SaveFileFormat.PDF);
		//ExEnd: render-detail-column-task-usage

	}
}
