/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.currencyproperties.readingcurrencyproperties.java;

import com.aspose.tasks.*;

import java.util.Date;

public class ReadingCurrencyProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/currencyproperties/readingcurrencyproperties/data/";

        //Create a project reader instance
        Project prj = new Project(dataDir + "project.mpp");

        //Display currency properties
        System.out.println("Currency Code : " + prj.getCurrencyCode());
        System.out.println("Currency Digits : " + prj.getCurrencyDigits());
        System.out.println("Currency Symbol : " + prj.getCurrencySymbol());
        System.out.println("Currency Symbol Position" + prj.getCurrencySymbolPosition());

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




