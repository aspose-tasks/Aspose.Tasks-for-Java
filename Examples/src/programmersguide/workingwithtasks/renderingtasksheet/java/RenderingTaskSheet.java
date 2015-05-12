/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.renderingtasksheet.java;

import com.aspose.tasks.*;

public class RenderingTaskSheet
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithtasks/renderingtasksheet/data/";  

	Project project = new Project(dataDir + "NewProductDev.mpp");
	SaveOptions options = new PdfSaveOptions();
	options.setPresentationFormat(PresentationFormat.TaskSheet);
	// See the result attached
	project.save("taskSheet.pdf", options);
  
    }
}




