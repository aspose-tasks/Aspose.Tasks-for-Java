/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.Project;
import com.aspose.tasks.Task;
import com.aspose.tasks.TaskCollection;
import com.aspose.tasks.Tsk;
import com.aspose.tasks.examples.Utils;

public class PercentageCompleteCalculations {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "Software Development.mpp");

        TaskCollection alTasks = project.getRootTask().getChildren();
        for (Task tsk : alTasks) {
            System.out.println(tsk.get(Tsk.PERCENT_COMPLETE));
            System.out.println(tsk.get(Tsk.PERCENT_WORK_COMPLETE).toString());
            System.out.println(tsk.get(Tsk.PHYSICAL_PERCENT_COMPLETE).toString());
        }
    }
}




