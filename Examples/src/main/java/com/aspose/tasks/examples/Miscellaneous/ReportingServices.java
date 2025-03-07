/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Miscellaneous;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ReportingServices {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        //Project OverView
        Project project3 = new Project(dataDir + "Cyclic structure.mpp");
        project3.saveReport(outDir + "ProjectOverView.pdf", ReportType.ProjectOverview);
        //Resource Cost Overview

        Project project4 = new Project(dataDir + "OzBuild 16 Orig.mpp");
        project4.saveReport(outDir + "ResourceCostOverview.pdf", ReportType.ResourceCostOverview);

        //Cost Overview
        Project project5 = new Project(dataDir + "OzBuild 16 Orig.mpp");
        project5.saveReport(outDir + "CostOverview.pdf", ReportType.CostOverview);

        //Work Overview
        Project project6 = new Project(dataDir + "Residential Construction.mpp");
        project6.saveReport(outDir + "WorkOverview.pdf", ReportType.WorkOverview);

        //Critical Tasks
        Project project7 = new Project(dataDir + "Residential Construction.mpp");
        project7.saveReport(outDir + "CriticalTasks.pdf", ReportType.CriticalTasks);

        //Milestones
        Project project8 = new Project(dataDir + "Residential Construction.mpp");
        project8.saveReport(outDir + "Milestones.pdf", ReportType.Milestones);

        //Late Tasks
        Project project9 = new Project(dataDir + "Residential Construction.mpp");
        project9.saveReport(outDir + "LateTasks.pdf", ReportType.LateTasks);

        //Resource Overview
        Project project10 = new Project(dataDir + "Software Development Plan.mpp");
        project10.saveReport(outDir + "ResourceOverview.pdf", ReportType.ResourceOverview);

        //Cost Overruns
        Project project11 = new Project(dataDir + "Software Development.mpp");
        project11.saveReport(outDir + "CostOverruns.pdf", ReportType.CostOverruns);

        //Upcoming Task
        Project project12 = new Project(dataDir + "UpcomingTasks.mpp");
        project12.saveReport(outDir + "UpcomingTasks.pdf", ReportType.UpcomingTask);

        //Task Cost Overview
        Project project13 = new Project(dataDir + "Software Development.mpp");
        project13.saveReport(outDir + "TaskCostOverview.pdf", ReportType.TaskCostOverview);

        //Over allocated Resources
        Project project14 = new Project(dataDir + "Software Development Plan.mpp");
        project14.saveReport(outDir + "OverAllocatedResources.pdf", ReportType.OverallocatedResources);

        //Slipping Tasks
        Project project15 = new Project(dataDir + "Cyclic structure.mpp");
        project15.saveReport(outDir + "SlippingTasks.pdf", ReportType.SlippingTasks);

        //Best Practice Analyzer
        Project project16 = new Project(dataDir + "Cyclic structure.mpp");
        project16.saveReport(outDir + "BestPracticeAnalyzer.pdf", ReportType.BestPracticeAnalyzer);

        //Burn down
        Project project17 = new Project(dataDir + "Cyclic structure.mpp");
        project17.saveReport(outDir + "Burndown.pdf", ReportType.Burndown);

        //Cash Flow
        Project project18 = new Project(dataDir + "OzBuild 16 Orig.mpp");
        project18.saveReport(outDir + "CashFlow.pdf", ReportType.CashFlow);
    }
}




