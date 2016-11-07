/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Miscellaneous;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ReportingServices {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		// ExStart: reporting-services
		String dataDir = Utils.getDataDir(ReportingServices.class);

		// Project OverView
		Project project3 = new Project(dataDir + "Cyclic stucture.mpp");
		project3.saveReport(dataDir + "ProjectOverView.pdf", ReportType.ProjectOverview);
		// Resource Cost Overview

		Project project4 = new Project(dataDir + "OzBuild 16 Orig.mpp");
		project4.saveReport(dataDir + "ResourceCostOverview.pdf", ReportType.ResourceCostOverview);

		// Cost Overview
		Project project5 = new Project(dataDir + "OzBuild 16 Orig.mpp");
		project5.saveReport(dataDir + "CostOverview.pdf", ReportType.CostOverview);

		// Work Overview
		Project project6 = new Project(dataDir + "Residential Construction.mpp");
		project6.saveReport(dataDir + "WorkOverview.pdf", ReportType.WorkOverview);

		// Critical Tasks
		Project project7 = new Project(dataDir + "Residential Construction.mpp");
		project7.saveReport(dataDir + "CriticalTasks.pdf", ReportType.CriticalTasks);

		// Milestones
		Project project8 = new Project(dataDir + "Residential Construction.mpp");
		project8.saveReport(dataDir + "Milestones.pdf", ReportType.Milestones);

		// Late Tasks
		Project project9 = new Project(dataDir + "Residential Construction.mpp");
		project9.saveReport(dataDir + "LateTasks.pdf", ReportType.LateTasks);

		// Resource Overview
		Project project10 = new Project(dataDir + "Software Development Plan.mpp");
		project10.saveReport(dataDir + "ResourceOverview.pdf", ReportType.ResourceOverview);

		// Cost Overruns
		Project project11 = new Project(dataDir + "Software Development.mpp");
		project11.saveReport(dataDir + "CostOverruns.pdf", ReportType.CostOverruns);

		// Upcoming Task
		Project project12 = new Project(dataDir + "UpcomingTasks.mpp");
		project12.saveReport(dataDir + "UpcomingTasks.pdf", ReportType.UpcomingTask);

		// Task Cost Overview
		Project project13 = new Project(dataDir + "Software Development.mpp");
		project13.saveReport(dataDir + "TaskCostOverview.pdf", ReportType.TaskCostOverview);

		// Over allocated Resources
		Project project14 = new Project(dataDir + "Software Development Plan.mpp");
		project14.saveReport(dataDir + "OverAllocatedResources.pdf", ReportType.OverallocatedResources);

		// Slipping Tasks
		Project project15 = new Project(dataDir + "Cyclic stucture.mpp");
		project15.saveReport(dataDir + "SlippingTasks.pdf", ReportType.SlippingTasks);

		// Best Practice Analyzer
		Project project16 = new Project(dataDir + "Cyclic stucture.mpp");
		project16.saveReport(dataDir + "BestPracticeAnalyzer.pdf", ReportType.BestPracticeAnalyzer);

		// Burn down
		Project project17 = new Project(dataDir + "Cyclic stucture.mpp");
		project17.saveReport(dataDir + "Burndown.pdf", ReportType.Burndown);

		// Cash Flow
		Project project18 = new Project(dataDir + "OzBuild 16 Orig.mpp");
		project18.saveReport(dataDir + "CashFlow.pdf", ReportType.CashFlow);
		// ExEnd: reporting-services

	}
}
