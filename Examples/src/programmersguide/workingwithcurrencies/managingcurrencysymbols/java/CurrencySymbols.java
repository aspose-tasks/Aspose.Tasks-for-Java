/*
 * Copyright 2001-2015 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package programmersguide.workingwithcurrencies.currencysymbols.java;

import com.aspose.tasks.DayType;
import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectReader;
import com.aspose.tasks.SaveFileFormat;

import java.io.FileInputStream;

public class CurrencySymbols
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithcurrencies/currencysymbols/data/";

        settingcurrencysymbol();

	gettingcurrencysymbol();

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }

    public static void settingcurrencysymbol()
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithcurrencies/currencysymbols/data/";
        
	Project project = new Project();
	project.set(Prj.CURRENCY_SYMBOL, "$$");        
    }

    public static void gettingcurrencysymbol()
    {
        // The path to the documents directory.
	String dataDir = "src/programmersguide/workingwithcurrencies/currencysymbols/data/";
       	
	Project project = new Project(dataDir + "project5.mpp");
	System.out.println(project.get(Prj.CURRENCY_SYMBOL));  
    }    
}




