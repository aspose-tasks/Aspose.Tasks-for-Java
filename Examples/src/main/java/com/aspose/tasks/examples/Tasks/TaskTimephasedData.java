/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.Asn;
import com.aspose.tasks.BaselineType;
import com.aspose.tasks.NullableBool;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceAssignment;
import com.aspose.tasks.Rsc;
import com.aspose.tasks.Task;
import com.aspose.tasks.TimephasedData;
import com.aspose.tasks.TimephasedDataType;
import com.aspose.tasks.Tsk;
import com.aspose.tasks.WorkContourType;
import com.aspose.tasks.examples.Utils;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class TaskTimephasedData {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "project.xml");

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2013, 7, 17, 8, 0, 0);
        project.set(Prj.START_DATE, cal.getTime());
        project.set(Prj.NEW_TASKS_ARE_MANUAL, new NullableBool(false));

        Task task = project.getRootTask().getChildren().add("Task");
        Resource rsc = project.getResources().add("Rsc");
        rsc.set(Rsc.STANDARD_RATE, BigDecimal.valueOf(10));
        rsc.set(Rsc.OVERTIME_RATE, BigDecimal.valueOf(15));
        // 6 days duration
        task.set(Tsk.DURATION, project.getDuration(6));

        ResourceAssignment assn = project.getResourceAssignments().add(task, rsc);
        Date d = new Date(0);
        assn.set(Asn.STOP, new Date(0));
        assn.set(Asn.RESUME, new Date(0));

        // backloaded contour increases task duration from 6 to 10 days
        assn.set(Asn.WORK_CONTOUR, WorkContourType.BackLoaded);

        project.setBaseline(BaselineType.Baseline);

        task.set(Tsk.PERCENT_COMPLETE, 50);

        List<TimephasedData> td = assn.getTimephasedData(assn.get(Asn.START), assn.get(Asn.FINISH), TimephasedDataType.AssignmentRemainingWork).toList();

        System.out.println(td.size());
        System.out.println(td.get(0).getValue());
        System.out.println(td.get(0).getValue());
        System.out.println(td.get(0).getValue());
        System.out.println(td.get(0).getValue());
        System.out.println(td.get(0).getValue());
        System.out.println(td.get(0).getValue());
        System.out.println(td.get(0).getValue());
    }
}




