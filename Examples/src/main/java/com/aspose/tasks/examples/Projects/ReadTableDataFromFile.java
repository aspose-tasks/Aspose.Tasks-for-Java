/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Project;
import com.aspose.tasks.Table;
import com.aspose.tasks.TableField;
import com.aspose.tasks.examples.Utils;

public class ReadTableDataFromFile {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        Project project = new Project(dataDir + "Project2003.mpp");

        Table t1 = project.getTables().toList().get(0);
        System.out.println("Table Fields Count: " + t1.getTableFields().size());
        System.out.println();

        for (TableField f : t1.getTableFields()) {
            System.out.println("Field width: " + f.getWidth());
            System.out.println("Field Title: " + f.getTitle());
            System.out.println("Field Title Alignment: " + f.getAlignTitle());
            System.out.println("Field Align Data: " + f.getAlignData());
            System.out.println();
        }
    }
}




