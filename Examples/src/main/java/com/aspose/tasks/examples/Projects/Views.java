package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Field;
import com.aspose.tasks.GanttChartView;
import com.aspose.tasks.MPPSaveOptions;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.StringAlignment;
import com.aspose.tasks.TableField;
import com.aspose.tasks.View;
import com.aspose.tasks.examples.Utils;

public class Views {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(PrimaveraRead.class);

        modifyViewAddColumn(dataDir);

        workWithView(dataDir);

        // Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void modifyViewAddColumn(String dataDir)
    {
        // Shows how to work with Project's view and add column to the default view (which is shown when MPP file is opened in MS Project).

        // Create an empty project without views
        Project project = new Project();
        project.set(Prj.NAME, "Test View Project");

        // Modify the default view (it's a Gantt chart view).
        // Or you can select view by name or by View Screen using project.View collection.
        GanttChartView view = (GanttChartView) project.getDefaultView();

        TableField newColumn = new TableField();
        newColumn.setAlignData(StringAlignment.Center);
        newColumn.setTitle("My new column");
        newColumn.setWidth(30);
        newColumn.setField(Field.TaskActualDuration);

        view.getTable().getTableFields().add(newColumn);

        // WriteViewData flag should be used to persist modifications of view's properties.
        MPPSaveOptions options = new MPPSaveOptions();
        options.setWriteViewData(true);
        project.save(dataDir + "modifyView_output.mpp", options);
    }

    public static void workWithView(String dataDir)
    {
        // Shows how to work with MS Project views.

        // Create an empty project without views
        Project project = new Project();
        project.set(Prj.NAME, "Test View Project");

        // Create a standard Gantt chart view
        View view = new GanttChartView();

        // Set some view properties
        // Set a value indicating whether Microsoft Project shows the single view name in the View or the Other Views drop-down lists in the Ribbon
        view.setShowInMenu(true);
        // Set a value indicating whether Microsoft Project highlights the filter for a single view
        view.setHighlightFilter(true);

        // The writing of the next properties is not supported
        // Sets the filter used in a single view
        view.setFilter(null);
        // Sets the group of the single view
        view.setGroup(null);
        // Sets the table of the single view
        view.setTable(null);

        // Let's tune some view settings
        // Set the number of first columns to be printed on all pages
        view.getPageInfo().getPageViewSettings().setFirstColumnsCount(4);
        // Set a value indicating whether to print a specified number of first columns on all pages
        view.getPageInfo().getPageViewSettings().setPrintFirstColumnsCountOnAllPages(true);

        // Add the view to our project
        project.getViews().add(view);

        // WriteViewData flag should be used to persist modifications of project.Views.
        MPPSaveOptions options = new MPPSaveOptions();
        options.setWriteViewData(true);
        project.save(dataDir + "workWithView_output.mpp", options);
        // Let's check some properties of the newly added view
        // Print the unique identifier of a view
        System.out.println("View Uid: " + view.getUid());
        // Print the screen type for the single view
        System.out.println("View Screen: " + view.getScreen());
        System.out.println("View Type: " + view.getType());
        System.out.println("Parent Project of the view: " + view.getParentProject().get(Prj.NAME));
    }
}
