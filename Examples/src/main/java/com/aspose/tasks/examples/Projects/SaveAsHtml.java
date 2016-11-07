/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import java.util.ArrayList;

import com.aspose.tasks.HtmlSaveOptions;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

public class SaveAsHtml {
	public static void main(String[] args) throws Exception {
		saveAsHTML();
		saveAsHTMLWithDocumentHeaders();
	}
	
	private static void saveAsHTML(){
		//ExStart: save-as-html
		String dataDir = Utils.getDataDir(SaveAsCsvTextAndTemplate.class);
		Project project = new Project(dataDir + "sample.mpp");
		HtmlSaveOptions htmlSaveOptions = new HtmlSaveOptions();

		//Determines whether to include project name in HTML title (true by default)
		htmlSaveOptions.setIncludeProjectNameInTitle(true);

		//Determines whether to include project name in HTML page header  (true by default)
		htmlSaveOptions.setIncludeProjectNameInPageHeader(false);

		htmlSaveOptions.setPages(new ArrayList());
		htmlSaveOptions.getPages().add(1);
		project.save("output.html", htmlSaveOptions);
		//ExEnd: save-as-html
	}
	

	private static void saveAsHTMLWithDocumentHeaders(){
		//ExStart: export-html-document-headers
		String dataDir = Utils.getDataDir(SaveAsCsvTextAndTemplate.class);
		Project project = new Project(dataDir + "sample.mpp");
		HtmlSaveOptions htmlSaveOptions = new HtmlSaveOptions();

		//Determines whether to include project name in HTML title (true by default)
		htmlSaveOptions.setIncludeProjectNameInTitle(true);

		//Determines whether to include project name in HTML page header  (true by default)
		htmlSaveOptions.setIncludeProjectNameInPageHeader(false);


		htmlSaveOptions.setPages(new ArrayList());
		htmlSaveOptions.getPages().add(1);
		project.save("output.html", htmlSaveOptions);
		//ExEnd: export-html-document-headers
	}
}
