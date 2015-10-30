/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.Resources1;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ResourceAndCalendars
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ResourceAndCalendars.class);
        
	    settingresourcecalendar();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingresourcecalendar()
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ResourceAndCalendars.class);

        Project project = new Project();
        Resource res = project.getResources().add("Resource1");

        // add standard calendar
        Calendar cal = project.getCalendars().add("Resource1");
        res.set(Rsc.CALENDAR, cal);
        
    }

    public static void gettingresourcecalendar()
    
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ResourceAndCalendars.class);

        Project project = new Project(dataDir + "input.mpp");
        ResourceCollection alRes = project.getResources();
        for (Resource res:alRes)
        {
            if(res.get(Rsc.NAME)!=null)
            {
                    //code to display res.Calendar properties
            }
        }
    }    
}


