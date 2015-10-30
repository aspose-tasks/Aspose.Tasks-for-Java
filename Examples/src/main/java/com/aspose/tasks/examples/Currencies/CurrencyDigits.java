/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Currencies;

import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class CurrencyDigits
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CurrencyDigits.class);

        settingcurrencydigits();

	    gettingcurrencydigits();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingcurrencydigits()
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CurrencyDigits.class);

        Project project = new Project();
        project.set(Prj.CURRENCY_DIGITS, 2);
        project.save(dataDir + "ProjectCurrDigits.mpp", SaveFileFormat.MPP);
    }

    public static void gettingcurrencydigits()
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CurrencyDigits.class);

        Project project = new Project(dataDir + "project5.mpp");
        System.out.println(project.get(Prj.CURRENCY_DIGITS));
    }    
}




