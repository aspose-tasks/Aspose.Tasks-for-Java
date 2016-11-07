/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.util.List;

public class FilterDataFromMppFile {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(FilterDataFromMppFile.class);

		filterDefinitionData();
		filterCriteriaData();

		// Display result of conversion.
		System.out.println("Process completed Successfully");
	}

	public static void filterDefinitionData() {
		// ExStart: filter-data-definition
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(FilterDataFromMppFile.class);

		Project project = new Project(dataDir + "Project2003.mpp");
		List<Filter> taskFilters = project.getTaskFilters().toList();

		System.out.println("Task Filters Count: " + taskFilters.size());
		System.out.println("All Tasks: " + taskFilters.get(0).getName());
		System.out.println("Task Item: " + taskFilters.get(0).getFilterType());
		System.out.println("Task Filters Show In Menu: " + taskFilters.get(0).getShowInMenu());
		System.out.println("Task filter ShowRelatedSummaryRows: " + taskFilters.get(0).getShowRelatedSummaryRows());

		System.out.println("Task filter type: " + taskFilters.get(1).getFilterType());
		System.out.println("Task Filters Show In Menu: " + taskFilters.get(1).getShowInMenu());
		System.out.println("Task filter ShowRelatedSummaryRows: " + taskFilters.get(1).getShowRelatedSummaryRows());

		System.out.println("NEW FILTER" + taskFilters.get(2).getName());
		System.out.println("Task filter type: " + taskFilters.get(2).getShowInMenu());
		System.out.println("Task Filters Show In Menu: " + taskFilters.get(2).getShowInMenu());
		System.out.println("Task filter ShowRelatedSummaryRows: " + taskFilters.get(2).getShowRelatedSummaryRows());

		System.out.println("Task FilterCriteria:m" + taskFilters.get(2).getCriteria());
		System.out.println("(TaskName Contains T)" + taskFilters.get(2).getCriteria().toString());

		List<Filter> rscFilters = project.getResourceFilters().toList();

		System.out.println("Project.ResourceFilters count: " + rscFilters.size());
		System.out.println("Resource Filter Item Type: Item.ResourceType: " + rscFilters.get(0).getFilterType());
		System.out.println("Resource filter ShowInMenu" + rscFilters.get(0).getShowInMenu());
		System.out.println("Resource filter ShowRelatedSummaryRows: " + rscFilters.get(0).getShowRelatedSummaryRows());
		// ExEnd: filter-data-definition
	}

	public static void filterCriteriaData() {
		// ExStart: filter-data-criteria
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(FilterDataFromMppFile.class);

		Project project = new Project(dataDir + "Task name filter.mpp");

		Filter filter = project.getTaskFilters().toList().get(1);
		System.out.println(filter.getCriteria().getCriteriaRows().size());
		System.out.println(filter.getCriteria().getOperation());

		FilterCriteria criteria1 = filter.getCriteria().getCriteriaRows().get(0);
		System.out.println(criteria1.getTest());
		System.out.println(criteria1.getField());
		// System.out.println(criteria1.getValues().getValues().get(0).toString());

		FilterCriteria criteria2 = filter.getCriteria().getCriteriaRows().get(1);
		System.out.println(criteria2.getOperation());
		System.out.println(criteria2.getCriteriaRows().size());

		FilterCriteria criteria21 = criteria2.getCriteriaRows().get(0);
		System.out.println(criteria21.getTest());
		System.out.println(criteria21.getField());

		FilterCriteria criteria22 = criteria2.getCriteriaRows().get(1);
		System.out.println(criteria22.getTest());
		System.out.println(criteria22.getField());

		FilterCriteria criteria23 = criteria2.getCriteriaRows().get(2);
		System.out.println(criteria23.getTest());
		System.out.println(criteria23.getField());

		FilterCriteria criteria3 = filter.getCriteria().getCriteriaRows().get(2);
		System.out.println(criteria3.getCriteriaRows().size());
		System.out.println(criteria3.getOperation());

		System.out.println(filter.getCriteria());

		// ExEnd: filter-data-criteria
	}
}
