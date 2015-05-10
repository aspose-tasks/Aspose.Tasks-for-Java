/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.printingprojectpagestoseparateimage.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class PrintingProjectPagesToSeparateImage
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/printingprojectpagestoseparateimage/data/";
	
	Project project = new Project(dataDir + "CustomerFeedback.mpp");
	ImageSaveOptions saveOptions = new ImageSaveOptions(SaveFileFormat.PNG);

	java.util.Calendar cal = java.util.Calendar.getInstance();
	cal.setTime(project.getStartDate());
	cal.add(java.util.Calendar.DATE, -3);

	saveOptions.setStartDate(cal.getTime());
	saveOptions.setEndDate(project.getFinishDate());

	saveOptions.setMarkCriticalTasks(true);
	saveOptions.setLegendOnEachPage(false);

	saveOptions.setGridlines(new ArrayList<Gridline>());

	Gridline gridline = new Gridline();
	gridline.setGridlineType(GridlineType.GanttRow);
	gridline.setColor(Color.BLUE);
	gridline.setPattern(LinePattern.Dashed);
	saveOptions.getGridlines().add(gridline);

	// Save the whole project layout to one file
	project.save("CustomerFeedback.png", saveOptions);

	// Save project layout to separate files
	saveOptions.setSaveToSeparateFiles(true);
	project.save("CustomerFeedback_.png", saveOptions);	        
    }
}




