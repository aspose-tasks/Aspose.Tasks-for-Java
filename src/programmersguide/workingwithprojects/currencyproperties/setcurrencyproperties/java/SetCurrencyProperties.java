/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package programmersguide.workingwithprojects.currencyproperties.setcurrencyproperties.java;

import com.aspose.tasks.CurrencySymbolPositionType;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;

public class SetCurrencyProperties
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = "src/programmersguide/workingwithprojects/currencyproperties/setcurrencyproperties/data/";

        //Create a project instance
        Project prj = new Project();

        //Set currency properties
        prj.setCurrencyCode("AUD");
        prj.setCurrencyDigits(3);
        prj.setCurrencySymbol("$");
        prj.setCurrencySymbolPosition(CurrencySymbolPositionType.After);

        //Save the project as XML project file
        prj.save(dataDir + "project.xml", SaveFileFormat.XML);

        //Display result of conversion.
        System.out.println("Process completed Successfully");
    }
}




