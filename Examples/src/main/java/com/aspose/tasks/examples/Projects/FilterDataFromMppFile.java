/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Filter;
import com.aspose.tasks.FilterCollection;
import com.aspose.tasks.FilterCriteria;
import com.aspose.tasks.ItemType;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

import java.util.List;

public class FilterDataFromMppFile {
    public static void main(String[] args) throws Exception {
        filterDefinitionData();

        filterCriteriaData();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void filterDefinitionData() {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(FilterDataFromMppFile.class);

        Project project = new Project(dataDir + "ReadFilterDefinitionData.mpp");
        FilterCollection taskFilters = project.getTaskFilters();
        System.out.println("Task Filters Count: " + taskFilters.size());
        for (Filter filter : taskFilters) {
            System.out.println("Uid: " + filter.getUid());
            System.out.println("Index: " + filter.getIndex());
            System.out.println("Name: " + filter.getName());
            System.out.println("Type: " + ItemType.getName(ItemType.class, filter.getFilterType()));
            System.out.println("Show In Menu: " + filter.getShowInMenu());
            System.out.println("Show Related Summary Rows: " + filter.getShowRelatedSummaryRows());
            System.out.println("Parent project: " + filter.getParentProject().get(Prj.NAME));
        }

        List<Filter> rscFilters = project.getResourceFilters().toList();

        System.out.println("Project.ResourceFilters count: " + rscFilters.size());
        System.out.println("Resource Filter Item Type: Item.ResourceType: " + ItemType.getName(ItemType.class, rscFilters.get(0).getFilterType()));
        System.out.println("Resource filter ShowInMenu" + rscFilters.get(0).getShowInMenu());
        System.out.println("Resource filter ShowRelatedSummaryRows: " + rscFilters.get(0).getShowRelatedSummaryRows());
    }

    public static void filterCriteriaData() {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(FilterDataFromMppFile.class);

        Project project = new Project(dataDir + "Project2003.mpp");

        Filter filter = project.getTaskFilters().toList().get(1);
        System.out.println(filter.getCriteria().getCriteriaRows().size());
        System.out.println(filter.getCriteria().getOperation());

        FilterCriteria criteria1 = filter.getCriteria().getCriteriaRows().get(0);
        System.out.println(criteria1.getTest());
        System.out.println(criteria1.getField());
        //System.out.println(criteria1.getValues().getValues().get(0).toString());

        FilterCriteria criteria2 = filter.getCriteria().getCriteriaRows().get(1);
        System.out.println(criteria2.getOperation());
        System.out.println(criteria2.getCriteriaRows().size());

        FilterCriteria criteria21 = criteria2.getCriteriaRows().get(0);
        System.out.println(criteria21.getTest());
        System.out.println(criteria21.getField());

        FilterCriteria criteria22 = criteria2.getCriteriaRows().get(1);
        System.out.println(criteria22.getTest());
        System.out.println(criteria22.getField());

        System.out.println(filter.getCriteria());
    }
}






        