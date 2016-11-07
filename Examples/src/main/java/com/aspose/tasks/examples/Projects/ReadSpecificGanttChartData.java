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

import java.awt.*;

public class ReadSpecificGanttChartData {
	public static void main(String[] args) throws Exception {
		// ExStart: reading-speficific-gant-chart-data
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReadSpecificGanttChartData.class);
		Project project = new Project(dataDir + "Project2003.mpp");
		GanttChartView view = (GanttChartView) project.getViews().toList().get(1);
		System.out.println("View.BarRounding: " + view.getBarRounding());
		System.out.println("view.ShowBarSplits: " + view.getShowBarSplits());
		System.out.println("view.ShowDrawings: " + view.getShowDrawings());
		System.out.println("view.RollUpGanttBars: " + view.getRollUpGanttBars());
		System.out.println("view.HideRollupBarsWhenSummaryExpanded: " + view.getHideRollupBarsWhenSummaryExpanded());
		System.out.println("view.BarSize: " + view.getBarSize());
		System.out.println("view.BarStyles count: " + view.getBarStyles().size());

		int i = 0;
		for (GanttBarStyle barStyle : view.getBarStyles()) {
			System.out.println(barStylesNames[i] + ": " + barStyle.getName());
			System.out.println(barStylesShowFor[i] + ":" + barStyle.getShowFor());
			System.out.println(barStylesFrom[i] + ":" + barStyle.getFrom());
			System.out.println(barStylesTo[i] + ":" + barStyle.getTo());
			System.out.println(barStylesMiddleShape[i] + ":" + barStyle.getMiddleShape());
			System.out.println(barStylesMiddleColor[i] + ":" + barStyle.getMiddleShapeColor());
			System.out.println(barStylesStartShape[i] + ":" + barStyle.getStartShape());
			System.out.println(barStylesEndShape[i] + ":" + barStyle.getEndShape());
			System.out.println(barStylesEndShapeColor[i] + ":" + barStyle.getEndShapeColor());
			i++;
		}

		System.out.println("Gridlines count: " + view.getGridlines().size());
		Gridlines gridlines = view.getGridlines().get(0);

		System.out.println("Gridlines.Type: " + gridlines.getType());
		System.out.println("Gridlines interval: " + gridlines.getInterval());
		System.out.println("Gridlines.NormalColor: " + gridlines.getNormalColor());
		System.out.println("Gridlines.NormalPattern: " + gridlines.getNormalPattern());
		System.out.println("Gridlines.IntervalPattern: " + gridlines.getIntervalPattern());
		System.out.println("Gridlines.IntervalColor: " + gridlines.getIntervalColor());

		System.out.println("View Text Styles: " + view.getTextStyles());

		System.out.println("ProgressLInes.BeginAtDate: " + view.getProgressLines().getBeginAtDate().toString());
		System.out.println("ProgressLines.isBaselinePlan: " + view.getProgressLines().isBaselinePlan());
		System.out.println("ProgressLines.DisplaySelected: " + view.getProgressLines().getDisplaySelected());
		System.out.println("ProgressLines.SelectedDates.Count: " + view.getProgressLines().getSelectedDates().size());

		System.out.println("ProgressLines.DisplayAtRecurringIntervals: "
				+ view.getProgressLines().getDisplayAtRecurringIntervals());
		System.out.println("ProgressLines.RecurringInterval.Interval: "
				+ view.getProgressLines().getRecurringInterval().getInterval());
		System.out.println("ProgressLines.RecurringInterval.WeeklyDays.Count"
				+ view.getProgressLines().getRecurringInterval().getWeeklyDays().size());
		System.out.println("RecurringInterval.DayType.Friday: "
				+ (int) view.getProgressLines().getRecurringInterval().getWeeklyDays().get(1));
		System.out.println("RecurringInterval.DayType.Saturday: "
				+ (int) view.getProgressLines().getRecurringInterval().getWeeklyDays().get(2));
		System.out.println("RecurringInterval.DayType.Sunday: "
				+ (int) view.getProgressLines().getRecurringInterval().getWeeklyDays().get(0));

		System.out.println("ProgressLines.ShowDate" + view.getProgressLines().getShowDate());

		System.out.println("ProgressLines.ProgressPointShape: " + view.getProgressLines().getProgressPointShape());
		System.out.println("ProgressLines.ProgressPointColor: " + view.getProgressLines().getProgressPointColor());
		System.out.println("ProgressLines.LineColor: " + view.getProgressLines().getLineColor());
		System.out.println("ProgressLines.LinePattern" + view.getProgressLines().getLinePattern());

		System.out.println(
				"ProgressLines.OtherProgressPointShape: " + view.getProgressLines().getOtherProgressPointShape());
		System.out.println("ProgressLines.OtherProgressPointColor: "
				+ view.getProgressLines().getOtherProgressPointColor().toString());
		System.out.println("ProgressLines.OtherLineColor: " + view.getProgressLines().getOtherLineColor());

		System.out.println("BottomTimescaleTier" + view.getBottomTimescaleTier());

		System.out.println("BottomTimescaleTier.Count: " + view.getBottomTimescaleTier().getCount());
		System.out.println("BottomTimescaleTier.Unit: " + view.getBottomTimescaleTier().getUnit());
		System.out.println("BottomTimescaleTier.UsesFiscalYear: " + view.getBottomTimescaleTier().getUsesFiscalYear());
		System.out.println("BottomTimescaleTier.Alignment: " + view.getBottomTimescaleTier().getAlignment());
		System.out.println("BottomTimescaleTier.ShowTicks: " + view.getBottomTimescaleTier().getShowTicks());
		System.out.println("BottomTimescaleTier.Label: " + view.getBottomTimescaleTier().getLabel());

		System.out.println("MiddleTimescaleTier.Count: " + view.getMiddleTimescaleTier().getCount());
		System.out.println("TimescaleUnit.Weeks: " + view.getMiddleTimescaleTier().getUnit());
		System.out.println("MiddleTimescaleTier.Alignment: " + view.getMiddleTimescaleTier().getAlignment());
		System.out.println("MiddleTimescaleTier.ShowTicks: " + view.getMiddleTimescaleTier().getShowTicks());
		System.out.println("MiddleTimescaleTier.Label: " + view.getMiddleTimescaleTier().getLabel());

		System.out.println("TopTimescaleTier.Unit: " + view.getTopTimescaleTier().getUnit());
		System.out.println("TopTimescaleTier.UsesFiscalYear: " + view.getTopTimescaleTier().getUsesFiscalYear());
		System.out.println("TopTimescaleTier.Alignment: " + view.getTopTimescaleTier().getAlignment());
		System.out.println("TopTimescaleTier.ShowTicks: " + view.getTopTimescaleTier().getShowTicks());
		System.out.println("TopTimescaleTier.Label" + view.getTopTimescaleTier().getLabel());

		// ExEnd: reading-speficific-gant-chart-data
		// Display result of conversion.
		System.out.println("Process completed Successfully");
	}

	// ExStart: supporting-functions
	private static String[] barStylesNames = new String[] { "Task", "Split", "Milestone", "Summary", "Project Summary",
			"*Group By Summary", "*Rolled Up Task", "*Rolled Up Split", "*Rolled Up Progress", "*Rolled Up Milestone",
			"*Deliverable Start", "*Deliverable Finish", "*Deliverable Duration", "*Dependency Start",
			"*Dependency Finish", "*Dependency Duration", "External Tasks", "External Milestone", "Deadline",
			"Progress" };
	private static String[] barStylesShowFor = new String[] { "Normal", "Normal;Split",
			"Milestone;Not Group By Summary", "Summary", "Project Summary", "Group By Summary",
			"Normal;Rolled Up;Not Summary", "Normal;Rolled Up;Split;Not Summary", "Normal;Rolled Up;Not Summary",
			"Milestone;Rolled Up;Not Summary", "Deliverable", "Deliverable", "Deliverable", "Dependency", "Dependency",
			"Dependency", "External Tasks;Not Milestone", "Milestone;External Tasks", "", "Normal" };
	private static int[] barStylesFrom = new int[] { Field.TaskStart, Field.TaskStart, Field.TaskFinish,
			Field.TaskStart, Field.TaskStart, Field.TaskStart, Field.TaskStart, Field.TaskStart, Field.TaskStart,
			Field.TaskFinish, Field.TaskDeliverableStart, Field.TaskDeliverableFinish, Field.TaskDeliverableStart,
			Field.TaskDeliverableStart, Field.TaskDeliverableFinish, Field.TaskDeliverableStart, Field.TaskStart,
			Field.TaskFinish, Field.TaskDeadline, Field.TaskActualStart };
	private static int[] barStylesTo = new int[] { Field.TaskFinish, Field.TaskFinish, Field.TaskFinish,
			Field.TaskFinish, Field.TaskFinish, Field.TaskFinish, Field.TaskFinish, Field.TaskFinish,
			Field.TaskCompleteThrough, Field.TaskFinish, Field.TaskDeliverableStart, Field.TaskDeliverableFinish,
			Field.TaskDeliverableFinish, Field.TaskDeliverableStart, Field.TaskDeliverableFinish,
			Field.TaskDeliverableFinish, Field.TaskFinish, Field.TaskFinish, Field.TaskDeadline,
			Field.TaskCompleteThrough };
	private static int[] barStylesMiddleShape = new int[] { GanttBarMiddleShape.RectangleBar,
			GanttBarMiddleShape.LineBottom, GanttBarMiddleShape.None, GanttBarMiddleShape.LineTop,
			GanttBarMiddleShape.LineTop, GanttBarMiddleShape.RectangleMiddle, GanttBarMiddleShape.RectangleBar,
			GanttBarMiddleShape.LineBottom, GanttBarMiddleShape.RectangleMiddle, GanttBarMiddleShape.None,
			GanttBarMiddleShape.None, GanttBarMiddleShape.None, GanttBarMiddleShape.LineBottom,
			GanttBarMiddleShape.None, GanttBarMiddleShape.None, GanttBarMiddleShape.LineTop,
			GanttBarMiddleShape.RectangleBar, GanttBarMiddleShape.None, GanttBarMiddleShape.None,
			GanttBarMiddleShape.RectangleMiddle, };
	private static Color[] barStylesMiddleColor = new Color[] { Color.blue, Color.blue, Color.black, Color.gray,
			new Color(192, 192, 192), Color.gray, Color.blue, Color.blue, Color.blue, Color.black, Color.black,
			Color.black, new Color(128, 0, 128), Color.black, Color.black, new Color(128, 128, 0),
			new Color(192, 192, 192), Color.black, Color.black, Color.blue };
	private static int[] barStylesStartShape = new int[] { GanttBarEndShape.NoBarEndShape,
			GanttBarEndShape.NoBarEndShape, GanttBarEndShape.Diamond, GanttBarEndShape.LineShape,
			GanttBarEndShape.LineShape, GanttBarEndShape.LineShape, GanttBarEndShape.NoBarEndShape,
			GanttBarEndShape.NoBarEndShape, GanttBarEndShape.NoBarEndShape, GanttBarEndShape.Diamond,
			GanttBarEndShape.LineShape, GanttBarEndShape.NoBarEndShape, GanttBarEndShape.NoBarEndShape,
			GanttBarEndShape.LineShape, GanttBarEndShape.NoBarEndShape, GanttBarEndShape.NoBarEndShape,
			GanttBarEndShape.NoBarEndShape, GanttBarEndShape.Diamond, GanttBarEndShape.ArrowDown,
			GanttBarEndShape.NoBarEndShape, };
	private static int[] barStylesEndShape = new int[] { GanttBarEndShape.NoBarEndShape, GanttBarEndShape.NoBarEndShape,
			GanttBarEndShape.NoBarEndShape, GanttBarEndShape.LineShape, GanttBarEndShape.LineShape,
			GanttBarEndShape.LineShape, GanttBarEndShape.NoBarEndShape, GanttBarEndShape.NoBarEndShape,
			GanttBarEndShape.NoBarEndShape, GanttBarEndShape.NoBarEndShape, GanttBarEndShape.NoBarEndShape,
			GanttBarEndShape.LineShape, GanttBarEndShape.NoBarEndShape, GanttBarEndShape.NoBarEndShape,
			GanttBarEndShape.LineShape, GanttBarEndShape.NoBarEndShape, GanttBarEndShape.NoBarEndShape,
			GanttBarEndShape.NoBarEndShape, GanttBarEndShape.NoBarEndShape, GanttBarEndShape.NoBarEndShape };
	private static Color[] barStylesEndShapeColor = new Color[] { Color.black, Color.black, Color.black,
			new Color(128, 128, 128), new Color(192, 192, 192), new Color(128, 128, 128), Color.black, Color.black,
			Color.black, Color.black, Color.black, new Color(128, 0, 128), Color.black, Color.black,
			new Color(128, 128, 0), Color.black, Color.black, Color.black, Color.black, Color.black };

	// ExStart: supporting-functions
}
