/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.handlingtaskconstraints.settingconstraints.java;

import com.aspose.tasks.*;

public class SettingConstraints
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasks/handlingtaskconstraints/settingconstraints/data/";

        Project project = new Project(dataDir + "project.mpp");
        SaveOptions saveOptions = new PdfSaveOptions();
        saveOptions.setStartDate(project.getStartDate());
        saveOptions.setTimescale(Timescale.ThirdsOfMonths);
        Task summary = project.getTaskById(1);
        summary.setConstraintType(ConstraintType.StartNoEarlierThan);
        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2013, 6, 3, 9, 0, 0);
        summary.setConstraintDate(cal.getTime());
        Task.recalculate(project.getRootTask());
        project.save(dataDir + "output.pdf", saveOptions);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




