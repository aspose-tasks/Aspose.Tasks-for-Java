/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithtasks.readingandwritinggeneralproperties.settinggeneralproperties.java;

import com.aspose.tasks.*;

import java.util.Date;
import java.util.List;

public class SettingGeneralProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithtasks/readingandwritinggeneralproperties/settinggeneralproperties/data/";

        Project project = new Project();
        project.setMinutesPerDay(60 * 8);

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2013, 7, 10);

        //Set project Start and Finish Date
        project.setStartDate(cal.getTime());

        cal.set(2013, 7, 20);
        project.setFinishDate(cal.getTime());

        //Add root task
        Task root = new Task();
        project.setRootTask(root);

        Task tskGen = new Task("Task1");
        tskGen.setId(1);
        tskGen.setUid(1);
        cal.set(2013,7,17,8,0,0);
        tskGen.setStart(cal.getTime());
        cal.set(2013,7,17,17,0,0);
        tskGen.setFinish(cal.getTime());

        root.getChildren().add(tskGen);

        //We need to recalculate the IDs only as UIDs were set correctly.
        project.calcTaskIds();
        project.calcTaskUids();


        project.updateReferences();

        //Save the Project
        project.save(dataDir + "Project.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




