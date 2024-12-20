/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.CsvOptions;
import com.aspose.tasks.CsvTextDelimiter;
import com.aspose.tasks.FieldHelper;
import com.aspose.tasks.GanttChartColumn;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectView;
import com.aspose.tasks.TableField;
import com.aspose.tasks.View;
import com.aspose.tasks.examples.Utils;

/**
 * Shows how to use com.aspose.tasks.CsvOptions to take the columns of the default Gantt Chart and
 * save them to a CSV file.
 */
public class CsvOptionsCustomizeViewColumns {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "EstimatedMilestoneTasks.mpp");

        CsvOptions options = new CsvOptions();
        options.setTextDelimiter(CsvTextDelimiter.Tab);

        View view = project.getDefaultView();
        options.setView(ProjectView.getDefaultGanttChartView());
        options.getView().getColumns().clear();

        for (TableField t : view.getTable().getTableFields()) {
            String columnTitle = t.getTitle() == null || t.getTitle().trim().length() == 0 ? FieldHelper.getDefaultFieldTitle(t.getField()) : t.getTitle();
            options.getView().getColumns().add(new GanttChartColumn(columnTitle, 10, t.getField()));
        }

        project.save(outDir + "CustomizeViewForCsvOptions_out.csv", options);
    }
}




