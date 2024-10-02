/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Currencies;

import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

public class CurrencySymbols {
    public static void main(String[] args) {
        settingCurrencySymbol();

        gettingCurrencySymbol();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingCurrencySymbol() {
        Project project = new Project();
        project.set(Prj.CURRENCY_SYMBOL, "$$");
    }

    public static void gettingCurrencySymbol() {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CurrencySymbols.class);

        Project project = new Project(dataDir + "project.mpp");
        System.out.println(project.get(Prj.CURRENCY_SYMBOL));
    }
}




