/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples;

import java.io.File;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Utils {

    public static String getDataDir(Class c) {
        File dir = new File(System.getProperty("user.dir"));

        // User can open root project or Example subproject
        if (!dir.toPath().endsWith("Examples")) {
            dir = new File(dir, "Examples");
        }

        dir = new File(dir, "src");
        dir = new File(dir, "main");
        dir = new File(dir, "resources");

        for (String s : c.getName().split("\\.")) {
            dir = new File(dir, s);
            if (!dir.isDirectory())
                dir.mkdir();
        }

        System.out.println("Using data directory: " + dir.toString());
        return dir.toString() + File.separator;
    }

    public static String getOutDir(Class c) {
        File dir = new File(System.getProperty("user.dir"));

        // User can open root project or Example subproject
        if (!dir.toPath().endsWith("Examples")) {
            dir = new File(dir, "Examples");
        }

        dir = new File(dir, "test-output");

        for (String s : Arrays.stream(c.getName().split("\\.")).skip(4).collect(Collectors.toList())) {
            dir = new File(dir, s);
            if (!dir.isDirectory())
                dir.mkdir();
        }

        System.out.println("Using out directory: " + dir.toString());
        return dir.toString() + File.separator;
    }
}
