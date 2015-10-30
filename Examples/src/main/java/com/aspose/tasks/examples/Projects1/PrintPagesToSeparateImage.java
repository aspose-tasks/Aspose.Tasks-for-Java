/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects1;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.awt.*;
import java.util.ArrayList;

public class PrintPagesToSeparateImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(PrintPagesToSeparateImage.class);
	
        Project project = new Project(dataDir + "CustomerFeedback.mpp");
        ImageSaveOptions saveOptions = new ImageSaveOptions(SaveFileFormat.PNG);

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.setTime(project.get(Prj.START_DATE));
        cal.add(java.util.Calendar.DATE, -3);

        saveOptions.setStartDate(cal.getTime());
        saveOptions.setEndDate(project.get(Prj.FINISH_DATE));

        saveOptions.setMarkCriticalTasks(true);
        saveOptions.setLegendOnEachPage(false);

        saveOptions.setGridlines(new ArrayList<Gridline>());

        Gridline gridline = new Gridline();
        gridline.setGridlineType(GridlineType.GanttRow);
        gridline.setColor(Color.BLUE);
        gridline.setPattern(LinePattern.Dashed);
        saveOptions.getGridlines().add(gridline);

        // Save the whole project layout to one file
        project.save(dataDir + "CustomerFeedback.png", saveOptions);

        // Save project layout to separate files
        saveOptions.setSaveToSeparateFiles(true);
        project.save(dataDir + "CustomerFeedback_.png", saveOptions);
    }
}




