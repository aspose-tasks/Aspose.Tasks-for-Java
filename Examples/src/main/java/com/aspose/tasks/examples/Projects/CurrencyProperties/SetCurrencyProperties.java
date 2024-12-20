/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects.CurrencyProperties;

import com.aspose.tasks.CurrencySymbolPositionType;
import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class SetCurrencyProperties {
    public static void main(String[] args) {
        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        //Create a project instance
        Project project = new Project();

        //Set currency properties
        project.set(Prj.CURRENCY_CODE, "AUD");
        project.set(Prj.CURRENCY_DIGITS, 2);
        project.set(Prj.CURRENCY_SYMBOL, "$");
        project.set(Prj.CURRENCY_SYMBOL_POSITION, CurrencySymbolPositionType.After);

        //Save the project as XML project file
        project.save(outDir + "project_out.xml", SaveFileFormat.Xml);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




