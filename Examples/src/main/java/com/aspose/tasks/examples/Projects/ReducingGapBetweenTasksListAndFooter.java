package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.HtmlSaveOptions;
import com.aspose.tasks.ImageSaveOptions;
import com.aspose.tasks.PageSize;
import com.aspose.tasks.PdfSaveOptions;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.SaveOptions;
import com.aspose.tasks.Timescale;
import com.aspose.tasks.examples.Utils;

public class ReducingGapBetweenTasksListAndFooter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ExStart: ReducingGapBetweenTasksListAndFooter
		String dataDir = Utils.getDataDir(SaveAsPdf.class);

		//Read the MPP file.
		Project project = new Project(dataDir + "Homemoveplan.mpp");

		//Use ReduceFooterGap property to reduce the gap between list of tasks and Footer
		ImageSaveOptions imageSaveOptions =  new ImageSaveOptions(SaveFileFormat.PNG);
		imageSaveOptions.setReduceFooterGap(true);
		imageSaveOptions.setSaveToSeparateFiles(true);
		imageSaveOptions.setPageSize(PageSize.A0);
		imageSaveOptions.setTimescale(Timescale.Days);
		project.save(dataDir + "ReducingGapBetweenTasksListAndFooter_out.png", (SaveOptions)imageSaveOptions);

		PdfSaveOptions pdfSaveOptions = new PdfSaveOptions();
		pdfSaveOptions.setReduceFooterGap(true);
		pdfSaveOptions.setSaveToSeparateFiles(true);
		pdfSaveOptions.setPageSize(PageSize.A0);
		pdfSaveOptions.setTimescale(Timescale.Days);
		project.save(dataDir + "ReducingGapBetweenTasksListAndFooter_out.pdf", (SaveOptions)pdfSaveOptions);

		HtmlSaveOptions htmlSaveOptions = new HtmlSaveOptions();
		htmlSaveOptions.setReduceFooterGap(true); // set to true
		htmlSaveOptions.setIncludeProjectNameInPageHeader(false);
		htmlSaveOptions.setIncludeProjectNameInTitle(false);
		htmlSaveOptions.setPageSize(PageSize.A0);
		htmlSaveOptions.setTimescale(Timescale.Days);
		project.save(dataDir + "ReducingGapBetweenTasksListAndFooter_out.html", htmlSaveOptions);
		//ExEnd: ReducingGapBetweenTasksListAndFooter
	}

}
