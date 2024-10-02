/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.TaskLinks;

import com.aspose.tasks.NullableBool;
import com.aspose.tasks.Project;
import com.aspose.tasks.Task;
import com.aspose.tasks.TaskLink;
import com.aspose.tasks.TaskLinkType;
import com.aspose.tasks.Tsk;

public class CreateCrossProjectTaskLink {
    public static void main(String[] args) {
        // ExStart:CreateCrossProjectTaskLink
        // ExFor: TaskLink.CrossProjectName
        // ExFor: TaskLink.IsCrossProject
        // ExFor: Tsk.IsExternalTask
        // ExFor: Tsk.ExternalUid
        // ExFor: Tsk.ExternalId
        // ExFor: Task.ExternalUid
        // ExFor: Task.ExternalId
        // ExSummary: Shows how to create cross project task link - link to task in another (external) project.
        Project project = new Project();
        Task summary = project.getRootTask().getChildren().add("Summary Task");

        // In order to create a link to a task from another project we should create
        // its duplicate (or "external") task in the current project.

        Task t2 = summary.getChildren().add("External Task");
        t2.set(Tsk.EXTERNAL_TASK_PROJECT, "ExternalProject.mpp"); // here we set path to external project's MPP file.
        t2.set(Tsk.EXTERNAL_ID, 1); // Set External task's Id.
        //t2.set(Tsk.EXTERNAL_UID, 2); // External task's Unique Id should be set.
        t2.set(Tsk.IS_EXTERNAL_TASK, true);
        t2.set(Tsk.IS_MANUAL, new NullableBool(false));
        t2.set(Tsk.IS_SUMMARY, false);

        Task t = summary.getChildren().add("Task");
        TaskLink link = project.getTaskLinks().add(t2, t);
        link.setCrossProject(true);
        link.setLinkType(TaskLinkType.FinishToStart);
        link.setCrossProjectName("ExternalProject.mpp\\1"); // <- here external task's Id is used.
        // ExEnd:CreateCrossProjectTaskLink

        // Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}