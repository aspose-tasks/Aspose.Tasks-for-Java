/* 
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.resources;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

import java.util.ArrayList;
import java.util.Date;
import java.util.TimeZone;


public class ExtendedResourceAttributes
{

    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ExtendedResourceAttributes.class);


        Project prj = new Project(dataDir + "project5.mpp");

        Resource res = prj.getResources().toList().get(0);

        ExtendedAttribute ea = new ExtendedAttribute();
        ea.setFieldId("11");
        ea.setValue("MyValueEA");
        ea.setValueGuid("MyValueGuidEA");
        res.getExtendedAttributes().add(ea);
        
    }

}





