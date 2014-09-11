/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.creatingtasks.java;

import com.aspose.tasks.*;

public class CreatingTasks
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasks/creatingtasks/data/";

        long OneSec = 10000000;//microsecond * 10
        long OneMin = 60 * OneSec;
        long OneHour = 60 * OneMin;

        Project project = new Project();
        project.setMinutesPerDay(60 * 8);

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2013, 7, 16,8,0,0);
        //Set project Start and Finish Date
        project.setStartDate(cal.getTime());

        System.out.println(cal.getTime());
        cal.set(2013, 07, 20);
        project.setFinishDate(cal.getTime());

        //Add root task
        Task root = new Task();
        project.setRootTask(root);

        //Add child task
        Task task = new Task("This is Task1");
        cal.set(2013, 7, 16, 8, 0, 0);
        task.setActualStart(cal.getTime());

        double val = OneHour * 8.0;
        task.setDuration((long)val);

        task.setDurationFormat(TimeUnitType.Day);
        root.getChildren().add(task);

        //We need to recalculate the IDs only as UIDs were set correctly.
        project.calcTaskIds();
        project.calcTaskUids();

        project.updateReferences();

        //Save the Project
        project.save(dataDir + "Project.Xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




