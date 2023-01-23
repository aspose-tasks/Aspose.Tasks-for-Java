/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.TaskLinks;

import com.aspose.tasks.Project;
import com.aspose.tasks.Task;
import com.aspose.tasks.TaskLink;
import com.aspose.tasks.TaskLinkCollection;
import com.aspose.tasks.TaskLinkType;
import com.aspose.tasks.examples.Utils;

public class DefineLinkType {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(DefineLinkType.class);

        settinglinktype();
        gettinglinktype(dataDir);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settinglinktype() {
        Project project = new Project();
        Task pred = project.getRootTask().getChildren().add("Task 1");
        Task succ = project.getRootTask().getChildren().add("Task 2");
        TaskLink link = project.getTaskLinks().add(pred, succ);
        link.setLinkType(TaskLinkType.StartToStart);
    }

    public static void gettinglinktype(String dataDir) {
        Project project = new Project(dataDir + "project.xml");
        TaskLinkCollection allinks = project.getTaskLinks();
        for (TaskLink tsklnk : allinks) {
            System.out.println(tsklnk.getLinkType());
        }
    }
}




