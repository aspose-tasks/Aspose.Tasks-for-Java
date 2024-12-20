/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Gridline;
import com.aspose.tasks.GridlineType;
import com.aspose.tasks.ImageSaveOptions;
import com.aspose.tasks.LegendDrawingOptions;
import com.aspose.tasks.LinePattern;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

import java.awt.*;
import java.util.ArrayList;

public class PrintPagesToSeparateImage {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "CustomerFeedback.mpp");
        ImageSaveOptions saveOptions = new ImageSaveOptions(SaveFileFormat.Png);

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(project.get(Prj.START_DATE));
        cal.add(java.util.Calendar.DATE, -3);

        saveOptions.setStartDate(cal.getTime());
        saveOptions.setEndDate(project.get(Prj.FINISH_DATE));

        saveOptions.setMarkCriticalTasks(true);
        saveOptions.setLegendDrawingOptions(LegendDrawingOptions.NoLegend);

        saveOptions.setGridlines(new ArrayList<Gridline>());

        Gridline gridline = new Gridline();
        gridline.setGridlineType(GridlineType.GanttRow);
        gridline.setColor(Color.BLUE);
        gridline.setPattern(LinePattern.Dashed);
        saveOptions.getGridlines().add(gridline);

        // Save the whole project layout to one file
        project.save(outDir + "CustomerFeedback.png", saveOptions);

        // Save project layout to separate files
        saveOptions.setRenderToSinglePage(false);
        project.save(outDir + "CustomerFeedback_.png", saveOptions);
    }
}




