/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.PageSize;
import com.aspose.tasks.PdfSaveOptions;
import com.aspose.tasks.Project;
import com.aspose.tasks.Timescale;
import com.aspose.tasks.View;
import com.aspose.tasks.ViewScreen;
import com.aspose.tasks.examples.Utils;

import java.awt.*;
import java.util.Calendar;

/**
 * Shows how to specify the page size and orientation using View settings or using SaveOptions.
 */
public class WorkWithIsPortrait {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        //Read the MPP file.
        Project project = new Project(dataDir + "EstimatedMilestoneTasks.mpp");

        View view = null;
        for (View v : project.getViews()) {
            if (v.getScreen() == ViewScreen.Gantt) {
                view = v;
                break;
            }
        }

        System.out.println(view.getName());

        PdfSaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setTimescale(Timescale.DefinedInView);
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2012, Calendar.DECEMBER, 22, 0, 0, 0);
        saveOptions.setStartDate(cal.getTime());
        cal.set(2013, Calendar.MAY, 10, 0, 0, 0);
        saveOptions.setEndDate(cal.getTime());
        saveOptions.setViewSettings(view);

        saveOptions.setPageSize(PageSize.DefinedInView);

        System.out.println(view.getPageInfo().getPageSettings().getPaperSizeId());

        // In this case the page size and orientation applied from view.getPageInfo().getPageSettings().getPaperSize() and view.getPageInfo().getPageSettings().isPortrait().
        //project.save(dataDir + "WorkWithIsPortrait_out1.pdf", saveOptions);

        saveOptions.setPageSize(PageSize.A4);
        saveOptions.setPortrait(true);

        // In this case the page size and orientation applied from SaveOptions.
        project.save(outDir + "WorkWithIsPortrait_out2.pdf", saveOptions);

        saveOptions.setCustomPageSize(new Dimension(400, 600));

        // In this case the page size applied with SaveOptions.setCustomPageSize(). isPortrait() is not taken into account.
        project.save(outDir + "WorkWithIsPortrait_out3.pdf", saveOptions);
    }
}
