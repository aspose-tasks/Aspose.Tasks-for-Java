/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.MspDbSettings;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.examples.Utils;

import java.io.File;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
import java.util.UUID;

public class ReadingProjectDatafromMicrosoftProjectDatabase {
    public static void main(String[] args) throws Exception {
        // ExStart: ReadingProjectDatafromMicrosoftProjectDatabase
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(ReadingProjectDatafromMicrosoftProjectDatabase.class);

        String url = "jdbc:sqlserver://";
        String serverName = "192.168.56.2\\MSSQLSERVER";
        String portNumber = "1433";
        String databaseName = "ProjectServer_Published";
        String userName = "sa";
        String password = "***";
        MspDbSettings settings = new MspDbSettings(url + serverName + ":" + portNumber + ";databaseName=" + databaseName + ";user=" + userName + ";password=" + password, UUID.fromString("E6426C44-D6CB-4B9C-AF16-48910ACE0F54"));

        addJDBCDriver(new File("c:\\Program Files (x86)\\Microsoft JDBC Driver 4.0 for SQL Server\\sqljdbc_4.0\\enu\\sqljdbc4.jar"));

        Project project = new Project(settings);
        project.save(dataDir + "project1.xml", SaveFileFormat.Xml);
        // ExEnd: ReadingProjectDatafromMicrosoftProjectDatabase
    }

    // ExStart: addJDBCDriver
    private static void addJDBCDriver(File file) throws Exception {
        Method method = URLClassLoader.class.getDeclaredMethod("addURL", new Class[] {URL.class});
        method.setAccessible(true);
        method.invoke(ClassLoader.getSystemClassLoader(), new Object[] {file.toURI().toURL()});
    }
    // ExEnd: addJDBCDriver
}
