/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithresources.creatingresources.createresourceaddtoproject.java;

import com.aspose.tasks.Project;
import com.aspose.tasks.Resource;
import com.aspose.tasks.SaveFileFormat;

public class createresourceaddtoproject
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithresources/creatingresources/createresourceaddtoproject/data/";

        Project project = new Project();
        Resource rsc1 = project.addResource("R1");
        Resource rsc2 = project.addResource("R2 ", rsc1.getId());
        project.save(dataDir+ "Resources.xml", SaveFileFormat.XML);
    }
}




