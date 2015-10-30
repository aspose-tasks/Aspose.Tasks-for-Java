/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ExtendedTaskAttributes
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExtendedTaskAttributes.class);

        Project project = new Project(dataDir + "Input.mpp");

        for (Task tsk:project.getRootTask().getChildren())
        {
                for (ExtendedAttribute ea:tsk.getExtendedAttributes())
                {
                       System.out.println(ea.getFieldId());
                       System.out.println(ea.getValue());
                       System.out.println(ea.getValueGuid());
                }
        }
 
    }
}




