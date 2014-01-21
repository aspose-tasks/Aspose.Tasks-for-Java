/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.retrievingcalendarinformation.java;

import com.aspose.tasks.*;

import java.util.List;

public class RetrievingCalendarInformation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/retrievingcalendarinformation/data/";

        long OneSec = 10000000;//microsecond * 10
        long OneMin = 60 * OneSec;
        long OneHour = 60 * OneMin;
        Project prj = new Project(dataDir + "project.mpp");

        //Retrieve Calendars Information
        List alCals =  prj.getCalendars();
        for (int i = 0 ; i < alCals.size(); i++)
        {
            Calendar cal = (Calendar)alCals.get(i);
            if (cal != null)
            {
                System.out.println("Calendar UID : " + cal.getUid());
                System.out.println("Calendar Name : " + cal.getName());
                List alDays = cal.getDays();
                for(int j = 0; j < alDays.size(); j++)
                {
                    WeekDay wd = (WeekDay)alDays.get(j);
                    double ts = wd.getWorkingTime();
                    double time = ts / (OneHour);
                    if (wd.getDayWorking())
                    {
                        System.out.print(wd.getDayType() + ":");
                        System.out.print("Working Time:" + time + " Hours");
                        System.out.println(", Ticks = " + ts);
                    }
                }
            }
        }


        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




