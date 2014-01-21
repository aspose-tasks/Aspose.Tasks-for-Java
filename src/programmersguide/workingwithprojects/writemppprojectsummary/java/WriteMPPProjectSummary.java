/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.writemppprojectsummary.java;

import com.aspose.tasks.*;

import java.util.Date;

public class WriteMPPProjectSummary
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/writemppprojectsummary/data/";

        Project project = new Project(dataDir + "project.mpp");

        //Set some summary information about the project
        project.setAuthor("Muhammad Sabir");
        project.setLastAuthor("Sergey Polshkov");
        project.setRevision(15);

        java.util.Calendar cal = java.util.Calendar.getInstance();
        cal.set(2014,2,15,0,0,0);
        project.setCreationDate(cal.getTime());
        cal.set(2014,3,15,0,0,0);
        project.setKeywords("MPP Aspose");
        cal.set(2014, 3, 16,0,0,0);
        project.setLastPrinted(cal.getTime());
        project.setSubject("Aspose Subject");
        project.setTemplate("Aspose Template");
        project.setComments("Aspose Comments");

        //Save the Project back in MPP format
        project.save(dataDir + "MPPAspose.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




