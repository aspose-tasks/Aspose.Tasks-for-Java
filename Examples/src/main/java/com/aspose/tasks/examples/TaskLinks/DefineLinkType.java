/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.TaskLinks;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class DefineLinkType {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(DefineLinkType.class);

		settingLinkType();
		gettingLinkType();

		// Display result of conversion.
		System.out.println("Process completed Successfully");
	}

	public static void settingLinkType() {

		// ExStart: setting-link-types
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(DefineLinkType.class);

		Project project = new Project();
		Task pred = project.getRootTask().getChildren().add("Task 1");
		Task succ = project.getRootTask().getChildren().add("Task 2");
		TaskLink link = project.getTaskLinks().add(pred, succ);
		link.setLinkType(TaskLinkType.StartToStart);

		// ExEnd: setting-link-types
	}

	public static void gettingLinkType() {
		// ExStart: getting-link-types
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(DefineLinkType.class);

		Project project = new Project("Input.mpp");
		TaskLinkCollection allinks = project.getTaskLinks();
		for (TaskLink tsklnk : allinks) {
			System.out.println(tsklnk.getLinkType());
		}
		// ExEnd: getting-link-types

	}
}
