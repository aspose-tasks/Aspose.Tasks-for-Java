/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithprojects.readingspecificganttchartdata.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class ReadingSpecificGanttChartData
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/readingspecificganttchartdata/data/";

	readingspecificganttchartdata();

	supportingfunctions();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void readingspecificganttchartdata()
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/readingspecificganttchartdata/data/";

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
	for (GanttBarStyle barStyle : view.getBarStyles())
	{
  	    System.out.println(barStylesNames[i] + ": " +  barStyle.getName());
	    System.out.println(barStylesShowFor[i] + ":" +  barStyle.getShowFor());
	    System.out.println(barStylesFrom[i] + ":" +  barStyle.getFrom());
	    System.out.println(barStylesTo[i] + ":" +   barStyle.getTo());
	    System.out.println(barStylesMiddleShape[i] + ":" +   barStyle.getMiddleShape());
	    System.out.println(barStylesMiddleColor[i] + ":" + barStyle.getMiddleShapeColor());
	    System.out.println(barStylesStartShape[i] + ":" +   barStyle.getStartShape());
	    System.out.println(barStylesEndShape[i] + ":" +   barStyle.getEndShape());
	    System.out.println(barStylesEndShapeColor[i] + ":" + barStyle.getEndShapeColor());
            i++;
	}

	System.out.println("Gridlines count: " + view.getGridlines().size());
	Gridlines gridlines = view.getGridlines().get(0);

	System.out.println("Gridlines.Type: " + gridlines.getType());
	System.out.println("Gridlines interval: " + gridlines.getInterval());
	System.out.println("Gridlines.NormalColor: " + gridlines.getNormalColor());
	System.out.println("Gridlines.NormalPattern: " + gridlines.getNormalPattern() );
	System.out.println("Gridlines.IntervalPattern: " +gridlines.getIntervalPattern());
	System.out.println("Gridlines.IntervalColor: " + gridlines.getIntervalColor());

	System.out.println("View Text Styles: " + view.getTextStyles());

	System.out.println("ProgressLInes.BeginAtDate: " + view.getProgressLines().getBeginAtDate().toString());
	System.out.println("ProgressLines.isBaselinePlan: " + view.getProgressLines().isBaselinePlan());
	System.out.println( "ProgressLines.DisplaySelected: " + view.getProgressLines().getDisplaySelected());
	System.out.println("ProgressLines.SelectedDates.Count: " + view.getProgressLines().getSelectedDates().size());
	

	System.out.println("ProgressLines.DisplayAtRecurringIntervals: " + view.getProgressLines().getDisplayAtRecurringIntervals());
	System.out.println("ProgressLines.RecurringInterval.Interval: " +  view.getProgressLines().getRecurringInterval().getInterval()  );
	System.out.println("ProgressLines.RecurringInterval.WeeklyDays.Count" +  view.getProgressLines().getRecurringInterval().getWeeklyDays().size());
	System.out.println("RecurringInterval.DayType.Friday: "  +  (int) view.getProgressLines().getRecurringInterval().getWeeklyDays().get(1));
	System.out.println("RecurringInterval.DayType.Saturday: "  + (int)view.getProgressLines().getRecurringInterval().getWeeklyDays().get(2));
	System.out.println("RecurringInterval.DayType.Sunday: " +  (int)view.getProgressLines().getRecurringInterval().getWeeklyDays().get(0));

	System.out.println("ProgressLines.ShowDate" + view.getProgressLines().getShowDate());

	System.out.println("ProgressLines.ProgressPointShape: " +  view.getProgressLines().getProgressPointShape());
	System.out.println( "ProgressLines.ProgressPointColor: " +  view.getProgressLines().getProgressPointColor());
	System.out.println("ProgressLines.LineColor: " + view.getProgressLines().getLineColor());
	System.out.println("ProgressLines.LinePattern" +  view.getProgressLines().getLinePattern());
	
	System.out.println("ProgressLines.OtherProgressPointShape: " + view.getProgressLines().getOtherProgressPointShape());
	System.out.println("ProgressLines.OtherProgressPointColor: " + view.getProgressLines().getOtherProgressPointColor().toString());
	System.out.println("ProgressLines.OtherLineColor: " + view.getProgressLines().getOtherLineColor());
	
	System.out.println("BottomTimescaleTier" + view.getBottomTimescaleTier());

	System.out.println("BottomTimescaleTier.Count: " + view.getBottomTimescaleTier().getCount());
	System.out.println("BottomTimescaleTier.Unit: " + view.getBottomTimescaleTier().getUnit());
	System.out.println("BottomTimescaleTier.UsesFiscalYear: " + view.getBottomTimescaleTier().getUsesFiscalYear());
	System.out.println("BottomTimescaleTier.Alignment: " + view.getBottomTimescaleTier().getAlignment());
	System.out.println("BottomTimescaleTier.ShowTicks: " + view.getBottomTimescaleTier().getShowTicks());
	System.out.println("BottomTimescaleTier.Label: " + view.getBottomTimescaleTier().getLabel());
	
	System.out.println("MiddleTimescaleTier.Count: " + view.getMiddleTimescaleTier().getCount());
	System.out.println("TimescaleUnit.Weeks: " +  view.getMiddleTimescaleTier().getUnit());
	System.out.println("MiddleTimescaleTier.Alignment: " + view.getMiddleTimescaleTier().getAlignment());
	System.out.println("MiddleTimescaleTier.ShowTicks: " + view.getMiddleTimescaleTier().getShowTicks());
	System.Out.println("MiddleTimescaleTier.Label: " +  view.getMiddleTimescaleTier().getLabel());

	System.out.println("TopTimescaleTier.Unit: " + view.getTopTimescaleTier().getUnit());
	System.out.println("TopTimescaleTier.UsesFiscalYear: " + view.getTopTimescaleTier().getUsesFiscalYear() );
	System.out.println("TopTimescaleTier.Alignment: " +  view.getTopTimescaleTier().getAlignment());
	System.out.println("TopTimescaleTier.ShowTicks: " + view.getTopTimescaleTier().getShowTicks());
	System.out.println("TopTimescaleTier.Label" + view.getTopTimescaleTier().getLabel());

           
    }

    public static void supportingfunctions()
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/readingspecificganttchartdata/data/";

    }     
}






        