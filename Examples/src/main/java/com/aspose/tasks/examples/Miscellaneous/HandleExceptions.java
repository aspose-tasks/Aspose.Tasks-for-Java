/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Miscellaneous;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class HandleExceptions {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        try {
            new Project(dataDir + "project.mpp");
        } catch (TasksReadingException ex) {
            System.out.print("Message: ");
            System.out.println(ex.getMessage());
            System.out.print("Log: ");
            System.out.println(ex.getLogText());

            if (ex.getCause() != null) {
                System.out.print("Inner exception message: ");
                System.out.println(ex.getCause().getMessage());
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}




