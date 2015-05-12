/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithresources.renderingresourceusageandsheetview.java;

import com.aspose.tasks.*;

public class RenderingResourceUsageandsheetView
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithresources/renderingresourceusageandsheetview/data/";
        
	resourceusage();

	resourcesheetview();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void resourceusage()
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithresources/renderingresourceusageandsheetview/data/";
        
	//Read the source Project
	Project project = new Project(dataDir + "RenderMe.mpp");
	//Define the SaveOptions with required TimeScale settings as Days
	SaveOptions options = new PdfSaveOptions();
	options.setTimescale(Timescale.Days);
	//Set the Presentation format to ResourceUsage
	options.setPresentationFormat(PresentationFormat.ResourceUsage);
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
    }

    public static void resourcesheetview()
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithresources/renderingresourceusageandsheetview/data/";
       	
	//Read the source Project
	Project project = new Project(dataDir + "TASKSNET_33285.mpp");
	//Define the SaveOptions
	SaveOptions options = new PdfSaveOptions();

	//Set the Presentation format to ResourceSheet
	options.setPresentationFormat(PresentationFormat.ResourceSheet);
        project.save("result.pdf", options);

        
    }
}




