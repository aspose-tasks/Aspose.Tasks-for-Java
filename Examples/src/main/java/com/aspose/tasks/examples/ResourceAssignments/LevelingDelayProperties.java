package com.aspose.tasks.examples.ResourceAssignments;

import com.aspose.tasks.Asn;
import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.ResourceAssignment;
import com.aspose.tasks.Task;
import com.aspose.tasks.TimeUnitType;
import com.aspose.tasks.Tsk;

import java.util.Calendar;

public class LevelingDelayProperties {
    public static void main(String[] args) {
        Project prj = new Project();

        Task task = prj.getRootTask().getChildren().add("Task 1");
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2000, Calendar.JANUARY, 3, 8, 0, 0);
        task.set(Tsk.START, cal.getTime());
        task.set(Tsk.DURATION, prj.getDuration(8));

        Resource resource = prj.getResources().add("Resource 1");

        // Create resource assignment
        ResourceAssignment assignment = prj.getResourceAssignments().add(task, resource);

        assignment.set(Asn.DELAY, prj.getDuration(0, TimeUnitType.Day));

        System.out.println("Delay: " + assignment.get(Asn.DELAY));
        System.out.println("Leveling Delay: " + assignment.get(Asn.LEVELING_DELAY));

        // Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}
