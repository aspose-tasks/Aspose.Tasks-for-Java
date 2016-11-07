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
import com.aspose.tasks.examples.Utils;

public class CurrencySymbols {
	public static void main(String[] args) throws Exception {
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CurrencySymbols.class);

		settingCurrencySymbol();
		gettingCurrencySymbol();

		// Display result of conversion.
		System.out.println("Process completed Successfully");
	}

	public static void settingCurrencySymbol() {
		// ExStart: set-currency-symbol
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CurrencySymbols.class);

		Project project = new Project();
		project.set(Prj.CURRENCY_SYMBOL, "$$");
		// ExEnd: set-currency-symbol
	}

	public static void gettingCurrencySymbol() {
		// ExStart: get-currency-symbol
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(CurrencySymbols.class);

		Project project = new Project(dataDir + "project5.mpp");
		System.out.println(project.get(Prj.CURRENCY_SYMBOL));
		// ExEnd: get-currency-symbol
	}
}
