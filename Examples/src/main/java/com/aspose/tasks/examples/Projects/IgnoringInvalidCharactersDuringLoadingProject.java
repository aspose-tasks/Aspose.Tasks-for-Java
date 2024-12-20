/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Duration;
import com.aspose.tasks.ParseErrorArgs;
import com.aspose.tasks.ParseErrorCallback;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.TimeUnitType;
import com.aspose.tasks.examples.Utils;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

public class IgnoringInvalidCharactersDuringLoadingProject {
    public static void main(String[] args) {
        // For complete examples and data files, please go to https://github.com/aspose-tasks/Aspose.Tasks-for-Java

        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        InputStream stream = new ByteArrayInputStream(getModifiedXml(dataDir).getBytes(StandardCharsets.UTF_8));

        Project project = new Project(stream, new ParseErrorCallback() {
            public Object invoke(Object sender, ParseErrorArgs args) {
                return customDurationHandler(sender, args);
            }
        });

        project.save(outDir + "project1_out.xml", SaveFileFormat.Xml);
    }

    private static String getModifiedXml(String dataDir) {
        StringBuilder xml = new StringBuilder();

        BufferedReader reader;
        String line;
        try {
            reader = new BufferedReader(new InputStreamReader(Files.newInputStream(Paths.get(dataDir + "NewProductDev.xml")), StandardCharsets.UTF_8));
            while ((line = reader.readLine()) != null) {
                xml.append(line).append("\n");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return xml.toString().replaceAll("PT(\\d+)H(\\d+)M(\\d+)S", "**$1Hrs$2Mins$3Secs**");
    }

    private static Object customDurationHandler(Object sender, ParseErrorArgs args) {
        System.err.printf("Object field : %s; Invalid value : %s; ", args.getFieldName(), args.getInvalidValue());
        String duration = args.getInvalidValue().replaceAll("[*]{2}(\\d+)Hrs(\\d+)Mins(\\d+)Secs[*]{2}", "PT$1H$2M$3S");
        double newValue = Duration.parseTimeSpan(duration) * 0.001 / 60 / 60;
        System.err.printf("New value : %s%n", duration);
        Project project = new Project();
        return project.getDuration(newValue, TimeUnitType.Hour);
    }
}
