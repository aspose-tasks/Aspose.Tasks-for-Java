/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.generalprojectproperties.WritingProjectInformation.java;
import com.aspose.tasks.*;
import com.aspose.tasks.Project;
import com.aspose.tasks.Calendar;

public class WritingProjectInformation
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/generalprojectproperties/writingprojectinformation/data/";

        //Create a project instance
        Project prj = new Project();

//Set project information properties
        prj.isScheduleFromStart(true);
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2014, 7, 10);
        prj.setStartDate(cal.getTime());
        prj.setCurrentDate(cal.getTime());
        prj.setStatusDate(cal.getTime());
        Calendar TaskCal =  Calendar.makeStandardCalendar();
        TaskCal.setName("Standard");
        prj.getCalendars().add(TaskCal);

        //Save the Project as XML
        prj.save(dataDir+ "input.xml", SaveFileFormat.XML);
        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




