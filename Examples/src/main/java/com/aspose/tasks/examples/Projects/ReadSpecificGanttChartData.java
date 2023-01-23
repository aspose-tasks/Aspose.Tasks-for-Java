/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.DateLabel;
import com.aspose.tasks.DayType;
import com.aspose.tasks.Field;
import com.aspose.tasks.FontStyles;
import com.aspose.tasks.GanttBarEndShape;
import com.aspose.tasks.GanttBarMiddleShape;
import com.aspose.tasks.GanttBarShowFor;
import com.aspose.tasks.GanttBarSize;
import com.aspose.tasks.GanttBarStyle;
import com.aspose.tasks.GanttChartView;
import com.aspose.tasks.GridlineType;
import com.aspose.tasks.Gridlines;
import com.aspose.tasks.Interval;
import com.aspose.tasks.LinePattern;
import com.aspose.tasks.Project;
import com.aspose.tasks.TextStyle;
import com.aspose.tasks.TimescaleUnit;
import com.aspose.tasks.examples.Utils;

public class ReadSpecificGanttChartData {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadSpecificGanttChartData.class);

        Project project = new Project(dataDir + "ReadSpecificGantChartViewData.mpp");

        GanttChartView view = (GanttChartView) project.getViews().toList().get(0);

        System.out.println("View.BarRounding: " + view.getBarRounding());
        System.out.println("view.ShowBarSplits: " + view.getShowBarSplits());
        System.out.println("view.ShowDrawings: " + view.getShowDrawings());
        System.out.println("view.RollUpGanttBars: " + view.getRollUpGanttBars());
        System.out.println("view.HideRollupBarsWhenSummaryExpanded: " + view.getHideRollupBarsWhenSummaryExpanded());
        System.out.println("view.BarSize: " + GanttBarSize.getName(GanttBarSize.class, view.getBarSize()));
        System.out.println("view.BarStyles count: " + view.getBarStyles().size());

        System.out.println("\n*** Bar Styles ***\n");

        for (int i = 0; i < view.getBarStyles().size(); i++) {
            GanttBarStyle barStyle = view.getBarStyles().get(i);

            System.out.println("#" + i);
            System.out.println("Name: " + barStyle.getName());
            System.out.println("Show for: " + formatShowForCategories(barStyle.getShowForCategories()));
            System.out.println("From: " + Field.getName(Field.class, barStyle.getFrom()));
            System.out.println("To: " + Field.getName(Field.class, barStyle.getTo()));
            System.out.println("Middle shape: " + GanttBarMiddleShape.getName(GanttBarMiddleShape.class, barStyle.getMiddleShape()));
            System.out.println("Middle shape color: " + barStyle.getMiddleShapeColor());
            System.out.println("Start shape: " + GanttBarEndShape.getName(GanttBarEndShape.class, barStyle.getStartShape()));
            System.out.println("End shape: " + GanttBarEndShape.getName(GanttBarEndShape.class, barStyle.getEndShape()));
            System.out.println("End shape color: " + barStyle.getEndShapeColor());
            System.out.println();
        }

        System.out.println("Gridlines count: " + view.getGridlines().size());
        Gridlines gridlines = view.getGridlines().get(0);

        System.out.println("Gridlines[0].Type: " + GridlineType.getName(GridlineType.class, gridlines.getType()));
        System.out.println("Gridlines[0].Interval: " + gridlines.getInterval());
        System.out.println("Gridlines[0].NormalColor: " + gridlines.getNormalColor());
        System.out.println("Gridlines[0].NormalPattern: " + LinePattern.getName(LinePattern.class, gridlines.getNormalPattern()));
        System.out.println("Gridlines[0].IntervalPattern: " + LinePattern.getName(LinePattern.class, gridlines.getIntervalPattern()));
        System.out.println("Gridlines[0].IntervalColor: " + gridlines.getIntervalColor());

        System.out.println("\nView Text Styles:");
        for (TextStyle textStyle : view.getTextStyles()) {
            System.out.printf(
                    "%s, %.0fpt, %s, %s%n",
                    textStyle.getFont().getFontFamily(),
                    textStyle.getFont().getSize(),
                    FontStyles.getName(FontStyles.class, textStyle.getFont().getStyle()),
                    textStyle.getColor()
            );
        }
        System.out.println();

        System.out.println("ProgressLInes.BeginAtDate: " + view.getProgressLines().getBeginAtDate());
        System.out.println("ProgressLines.isBaselinePlan: " + view.getProgressLines().isBaselinePlan());
        System.out.println("ProgressLines.DisplaySelected: " + view.getProgressLines().getDisplaySelected());
        System.out.println("ProgressLines.SelectedDates.Count: " + view.getProgressLines().getSelectedDates().size());

        System.out.println("ProgressLines.DisplayAtRecurringIntervals: " + view.getProgressLines().getDisplayAtRecurringIntervals());
        System.out.println("ProgressLines.RecurringInterval.Interval: " + Interval.getName(Interval.class, view.getProgressLines().getRecurringInterval().getInterval()));
        System.out.println("ProgressLines.RecurringInterval.WeeklyDays.Count: " + view.getProgressLines().getRecurringInterval().getWeeklyDays().size());
        System.out.println("RecurringInterval.DayType: " + DayType.getName(DayType.class, view.getProgressLines().getRecurringInterval().getWeeklyDays().get(0)));

        System.out.println("ProgressLines.ShowDate: " + view.getProgressLines().getShowDate());

        System.out.println("ProgressLines.ProgressPointShape: " + GanttBarEndShape.getName(GanttBarEndShape.class, view.getProgressLines().getProgressPointShape()));
        System.out.println("ProgressLines.ProgressPointColor: " + view.getProgressLines().getProgressPointColor());
        System.out.println("ProgressLines.LineColor: " + view.getProgressLines().getLineColor());
        System.out.println("ProgressLines.LinePattern: " + LinePattern.getName(LinePattern.class, view.getProgressLines().getLinePattern()));
        System.out.println("ProgressLines.OtherProgressPointShape: " + GanttBarEndShape.getName(GanttBarEndShape.class, view.getProgressLines().getOtherProgressPointShape()));
        System.out.println("ProgressLines.OtherProgressPointColor: " + view.getProgressLines().getOtherProgressPointColor().toString());
        System.out.println("ProgressLines.OtherLineColor: " + view.getProgressLines().getOtherLineColor());
        System.out.println();

        System.out.println("BottomTimescaleTier.Count: " + view.getBottomTimescaleTier().getCount());
        System.out.println("BottomTimescaleTier.Unit: " + TimescaleUnit.getName(TimescaleUnit.class, view.getBottomTimescaleTier().getUnit()));
        System.out.println("BottomTimescaleTier.UsesFiscalYear: " + view.getBottomTimescaleTier().getUsesFiscalYear());
        System.out.println("BottomTimescaleTier.Alignment: " + view.getBottomTimescaleTier().getAlignment());
        System.out.println("BottomTimescaleTier.ShowTicks: " + view.getBottomTimescaleTier().getShowTicks());
        System.out.println("BottomTimescaleTier.Label: " + DateLabel.getName(DateLabel.class, view.getBottomTimescaleTier().getLabel()));
        System.out.println();

        System.out.println("MiddleTimescaleTier.Count: " + view.getMiddleTimescaleTier().getCount());
        System.out.println("MiddleTimescaleTier.Unit: " + TimescaleUnit.getName(TimescaleUnit.class, view.getMiddleTimescaleTier().getUnit()));
        System.out.println("MiddleTimescaleTier.Alignment: " + view.getMiddleTimescaleTier().getAlignment());
        System.out.println("MiddleTimescaleTier.ShowTicks: " + view.getMiddleTimescaleTier().getShowTicks());
        System.out.println("MiddleTimescaleTier.Label: " + DateLabel.getName(DateLabel.class, view.getMiddleTimescaleTier().getLabel()));
        System.out.println();

        System.out.println("TopTimescaleTier.Unit: " + TimescaleUnit.getName(TimescaleUnit.class, view.getTopTimescaleTier().getUnit()));
        System.out.println("TopTimescaleTier.UsesFiscalYear: " + view.getTopTimescaleTier().getUsesFiscalYear());
        System.out.println("TopTimescaleTier.Alignment: " + view.getTopTimescaleTier().getAlignment());
        System.out.println("TopTimescaleTier.ShowTicks: " + view.getTopTimescaleTier().getShowTicks());
        System.out.println("TopTimescaleTier.Label: " + DateLabel.getName(DateLabel.class, view.getTopTimescaleTier().getLabel()));
        System.out.println();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    private static String formatShowForCategories(Iterable</*GanttBarShowFor*/Integer> categories) {
        java.lang.StringBuilder result = new StringBuilder();
        for (int category : categories) {
            if (result.length() > 0) {
                result.append(", ");
            }
            result.append(GanttBarShowFor.getName(GanttBarShowFor.class, category));
        }
        return result.length() == 0 ? "<None>" : result.toString();
    }
}






        