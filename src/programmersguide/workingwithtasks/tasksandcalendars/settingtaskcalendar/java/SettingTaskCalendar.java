/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.tasksandcalendars.settingtaskcalendar.java;

import com.aspose.tasks.*;

import java.util.List;

public class SettingTaskCalendar
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasks/tasksandcalendars/settingtaskcalendar/data/";

        Project prj = new Project();
        Task tsk = prj.addTask("Task 1");
        Calendar cal = new Calendar("TaskCal1");
        Calendar.makeStandardCalendar(cal);
        tsk.setCalendar(cal);
        prj.save(dataDir + "project.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




