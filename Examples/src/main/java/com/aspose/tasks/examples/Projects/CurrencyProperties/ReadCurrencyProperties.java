/*
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects.CurrencyProperties;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class ReadCurrencyProperties {
	public static void main(String[] args) throws Exception {
		// ExStart: read-currency-properties
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReadCurrencyProperties.class);

		// Create a project reader instance
		Project project = new Project(dataDir + "project.mpp");

		// Display currency properties
		System.out.println("Currency Code : " + project.get(Prj.CURRENCY_CODE).toString());
		System.out.println("<br>Currency Digits : " + project.get(Prj.CURRENCY_DIGITS).toString());
		System.out.println("<br>Currency Symbol : " + project.get(Prj.CURRENCY_SYMBOL).toString());
		System.out.println("Currency Symbol Position" + project.get(Prj.CURRENCY_SYMBOL_POSITION).toString());

		// Display result of conversion.
		System.out.println("Process completed Successfully");
		// ExEnd: read-currency-properties
	}
}
