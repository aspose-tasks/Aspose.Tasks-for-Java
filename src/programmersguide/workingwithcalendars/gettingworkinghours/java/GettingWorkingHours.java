/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithcalendars.gettingworkinghours.java;

import com.aspose.tasks.*;

public class GettingWorkingHours
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithcalendars/gettingworkinghours/data/";

        long OneSec = 10000000;//microsecond * 10
        long OneMin = 60 * OneSec;
        long OneHour = 60 * OneMin;

        Project project = new Project(dataDir + "Project.mpp");
        Task task = project.getTaskById(1);

        Calendar taskCalendar = task.getCalendar();

        java.util.Calendar calStartDate = java.util.Calendar.getInstance();
        calStartDate.setTime(task.getStart());

        java.util.Calendar calEndDate = java.util.Calendar.getInstance();
        calEndDate.setTime(task.getFinish());

        java.util.Calendar tempDate = java.util.Calendar.getInstance();
        tempDate = calStartDate;

        Resource resource = project.getResourceByUid(1);
        Calendar resourceCalendar = resource.getCalendar();

        //TimeSpan timeSpan;
        long timeSpan = 0;

        //Get Duration in Minutes
        double durationInMins = 0;

        while (tempDate.before(calEndDate))
        {
            if (taskCalendar.isDayWorking(tempDate.getTime()) && resourceCalendar.isDayWorking(tempDate.getTime()))
            {
                timeSpan = taskCalendar.getWorkingHours(tempDate.getTime());
                durationInMins = durationInMins + (timeSpan / OneMin);
            }
            tempDate.add(java.util.Calendar.DATE, 1);
        }
        tempDate.setTime(task.getStart());

        //Get Duration in Hours
        double durationInHours = 0;

        while (tempDate.before(calEndDate))
        {
            if (taskCalendar.isDayWorking(tempDate.getTime()) && resourceCalendar.isDayWorking(tempDate.getTime()))
            {
                timeSpan = taskCalendar.getWorkingHours(tempDate.getTime());
                durationInHours = durationInHours + (timeSpan / OneHour);
            }
            tempDate.add(java.util.Calendar.DATE, 1);
        }
        tempDate.setTime(task.getStart());

        //Get Duration in Days
        double durationInDays = 0;

        while (tempDate.before(calEndDate))
        {
            if (taskCalendar.isDayWorking(tempDate.getTime()) && resourceCalendar.isDayWorking(tempDate.getTime()))
            {
                timeSpan = taskCalendar.getWorkingHours(tempDate.getTime());
                if ((timeSpan / OneHour) > 0)
                    durationInDays = durationInDays + (timeSpan/OneHour/8.0);
            }
            tempDate.add(java.util.Calendar.DATE, 1);
        }
        tempDate = calStartDate;

        System.out.println("Duration in Minutes = " + durationInMins);
        System.out.println("Duration in Hours = " + durationInHours);
        System.out.println("Duration in Days = " + durationInDays);
        System.out.println();

    }
}




