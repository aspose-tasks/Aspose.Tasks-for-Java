/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithcurrencies.currencycodes.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class CurrencyCodes
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithcurrencies/currencycodes/data/";

        settingcurrency();

	gettingcurrencycode();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingcurrency()
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithcurrencies/currencycodes/data/";
        
	Project prj = new Project();
	prj.set(Prj.CURRENCY_CODE, "USD");
        
    }

    public static void gettingcurrencycode()
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithcurrencies/currencycodes/data/";
       	
	prj = new Project(dataDir"project5.mpp");
	System.out.println(prj.get(Prj.CURRENCY_CODE));   
    }    
}




