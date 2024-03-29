/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.TaskLinks;

import com.aspose.tasks.Project;
import com.aspose.tasks.TaskLink;
import com.aspose.tasks.examples.Utils;

public class CrossProjectPredecessors {
    public static void main(String[] args) {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CrossProjectPredecessors.class);

        Project prj = new Project(dataDir + "project5.mpp");

        for (TaskLink tsklnk : prj.getTaskLinks()) {
            if (tsklnk.isCrossProject()) {
                System.out.println(tsklnk.getCrossProjectName());
            }
        }
    }
}




