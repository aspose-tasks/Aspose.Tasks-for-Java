/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Currencies;

import java.io.IOException;

import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

public class CurrencyDigits {
    public static void main(String[] args) {
        settingCurrencyDigits();

        gettingCurrencyDigits();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingCurrencyDigits() {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CurrencyDigits.class);

        Project project = new Project();
        project.set(Prj.CURRENCY_DIGITS, 2);
        project.save(dataDir + "ProjectCurrDigits.mpp", SaveFileFormat.Mpp);
    }

    public static void gettingCurrencyDigits() {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CurrencyDigits.class);

        Project project = new Project(dataDir + "project.mpp");
        System.out.println(project.get(Prj.CURRENCY_DIGITS));
    }
}




