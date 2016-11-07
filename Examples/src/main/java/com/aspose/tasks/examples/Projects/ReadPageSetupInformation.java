/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.PageInfo;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

public class ReadPageSetupInformation {
	public static void main(String[] args) throws Exception {

		// ExStart: reading-a-page-setup
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReadPageSetupInformation.class);

		Project project = new Project(dataDir + "HeaderFooter2007_3.mpp"); // Attached
		// test
		// project
		PageInfo info = project.getDefaultView().getPageInfo();

		// Header Footer information
		System.out.println(info.getHeader().getLeftText());
		System.out.println(info.getHeader().getCenteredText());
		System.out.println(info.getHeader().getRightText());
		System.out.println(info.getFooter().getLeftText());
		System.out.println(info.getFooter().getCenteredText());
		System.out.println(info.getFooter().getRightText());

		// Page Settings information
		System.out.println(info.getPageSettings().isPortrait());
		System.out.println(info.getPageSettings().getAdjustToPercentOfNormalSize());
		System.out.println(info.getPageSettings().getPercentOfNormalSize());
		System.out.println(info.getPageSettings().getPagesInWidth());
		System.out.println(info.getPageSettings().getPagesInHeight());
		System.out.println(info.getPageSettings().getPaperSize());

		// Page View Settings
		System.out.println(info.getPageViewSettings().getPrintAllSheetColumns());
		System.out.println(info.getPageViewSettings().getPrintFirstColumnsCountOnAllPages());
		System.out.println(info.getPageViewSettings().getFirstColumnsCount());
		System.out.println(info.getPageViewSettings().getPrintNotes());
		System.out.println(info.getPageViewSettings().getPrintBlankPages());
		System.out.println(info.getPageViewSettings().getFitTimescaleToEndOfPage());

		// Page Margins
		System.out.println(info.getMargins().getLeft());
		System.out.println(info.getMargins().getTop());
		System.out.println(info.getMargins().getRight());
		System.out.println(info.getMargins().getBottom());
		System.out.println(info.getMargins().getBorders());

		// Page Legend
		System.out.println(info.getLegend().getLeftText());
		System.out.println(info.getLegend().getCenteredText());
		System.out.println(info.getLegend().getRightText());
		System.out.println(info.getLegend().getLegendOn());
		System.out.println(info.getLegend().getWidth());

		// ExEnd: reading-a-page-setup

	}
}
