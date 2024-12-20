/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.awt.*;

public class ReadGroupDefinitionData {
	public static void main(String[] args) {
		// The path to the document directory.
		String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

		// The path to the output directory.
		String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

		ReadGroups(dataDir);

		CreateGroups(outDir);
	}

	public static void ReadGroups(String dataDir) {
		Project project = new Project(dataDir + "project.mpp"); // attached test project

		System.out.println("Task Groups Count: " + project.getTaskGroups().size());

		Group taskGroup = project.getTaskGroups().toList().get(1);
		System.out.println("Percent Complete:" + taskGroup.getName());
		System.out.println("Group Criteria count: " + taskGroup.getGroupCriteria().size());

		System.out.println("\n************* Retrieving Task Group's Criterion information *************");
		GroupCriterion criterion = taskGroup.getGroupCriteria().toList().get(0);
		System.out.println("Criterion Field: " + criterion.getField());
		System.out.println("Criterion GroupOn: " + criterion.getGroupOn());
		System.out.println("Criterion Cell Color: " + criterion.getCellColor());
		System.out.println("Criterion Pattern: " + criterion.getPattern());

		if (taskGroup == criterion.getParentGroup())
			System.out.println("Parent Group is equval to task Group.");

		System.out.println("\n*********** Retreivnig Criterion's Font Information ***********");
		System.out.println("Font Family Name: " + criterion.getFont().getFontFamily());
		System.out.println("Font Size: " + criterion.getFont().getSize());
		System.out.println("Font Style: " + criterion.getFont().getStyle());
		System.out.println("Ascending/Dscending: " + criterion.getAscending());
	}

	public static void CreateGroups(String outDir) {
		Project p = new Project();

		{
			Group group = new Group();
			group.setName("My new task group");
			group.setMaintainHierarchy(true);
			group.setShowSummary(true);

			GroupCriterion criterion = new GroupCriterion();
			criterion.setField(Field.TaskDuration1);
			criterion.setFont(new FontDescriptor("Comic Sans MS", 13F, FontStyles.Italic));
			criterion.setGroupOn(GroupOn.DurationMinutes);
			criterion.setStartAt(5);
			criterion.setGroupInterval(3D);
			criterion.setPattern(BackgroundPattern.DarkDiagonalLeft);
			group.getGroupCriteria().add(criterion);

			GroupCriterion criterion2 = new GroupCriterion();
			criterion2.setField(Field.TaskPercentComplete);
			criterion2.setFont(new FontDescriptor("Bodoni MT", 17, FontStyles.Italic | FontStyles.Bold));
			criterion2.setGroupOn(GroupOn.Pct199);
			criterion2.setPattern(BackgroundPattern.LightDither);
			criterion2.setCellColor(Color.GREEN);
			criterion2.setFontColor(Color.RED);
			group.getGroupCriteria().add(criterion2);
			group.setGroupAssignments(true);
			p.getTaskGroups().add(group);
		}
		{
			Group group = new Group();
			group.setName("My new resource group");
			group.setMaintainHierarchy(true);
			group.setShowSummary(true);

			GroupCriterion criterion = new GroupCriterion();
			criterion.setField(Field.ResourceDuration1);
			criterion.setFont(new FontDescriptor("Comic Sans MS", 11F, FontStyles.Bold));
			criterion.setGroupOn(GroupOn.DurationHours);
			criterion.setStartAt(1);
			criterion.setGroupInterval(2D);
			criterion.setPattern(BackgroundPattern.DarkDiagonalLeft);
			group.getGroupCriteria().add(criterion);

			GroupCriterion criterion2 = new GroupCriterion();
			criterion2.setField(Field.ResourceCost);
			criterion2.setFont(new FontDescriptor("Bodoni MT", 12, FontStyles.Italic | FontStyles.Bold));
			criterion2.setGroupOn(GroupOn.Interval);
			criterion2.setStartAt(1D);
			criterion2.setGroupInterval(10D);
			criterion2.setPattern(BackgroundPattern.LightDither);
			criterion2.setCellColor(Color.MAGENTA);
			criterion2.setFontColor(Color.RED);
			group.getGroupCriteria().add(criterion2);
			group.setGroupAssignments(true);
			p.getResourceGroups().add(group);
		}

		MPPSaveOptions options = new MPPSaveOptions();
		options.setWriteGroups(true);
		p.save(outDir + "output.mpp", options);
	}
}




