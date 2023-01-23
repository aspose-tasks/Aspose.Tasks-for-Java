/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Currencies;

import com.aspose.tasks.Prj;
import com.aspose.tasks.Project;
import com.aspose.tasks.examples.Utils;

public class CurrencyCodes {
    public static void main(String[] args) {
        settingCurrency();

        gettingCurrencyCode();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingCurrency() {
        Project prj = new Project();
        prj.set(Prj.CURRENCY_CODE, "USD");
    }

    public static void gettingCurrencyCode() {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(CurrencyCodes.class);

        Project prj = new Project(dataDir + "project.mpp");
        System.out.println(prj.get(Prj.CURRENCY_CODE));
    }
}




