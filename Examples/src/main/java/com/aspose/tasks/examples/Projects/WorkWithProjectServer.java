/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectInfo;
import com.aspose.tasks.ProjectServerCredentials;
import com.aspose.tasks.ProjectServerManager;
import com.aspose.tasks.examples.Utils;

public class WorkWithProjectServer {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(WorkWithProjectServer.class);

        CreateProjectOnline(dataDir);
        ReadProjectOnline();
    }

    private static void CreateProjectOnline(String dataDir) throws Exception {
        // ExStart:CreateProjectOnline
        String sharepointDomainAddress = "https://contoso.sharepoint.com";
        String userName = "admin@contoso.onmicrosoft.com";
        String password = "MyPassword";

        ProjectServerCredentials credentials = new ProjectServerCredentials(sharepointDomainAddress, userName, password);
        Project project = new Project(dataDir + "sample.mpp");

        ProjectServerManager manager = new ProjectServerManager(credentials);
        manager.createNewProject(project);
        // ExEnd:CreateProjectOnline
    }

    private static void ReadProjectOnline() throws Exception {
        // ExStart:ReadProjectOnline
        String sharepointDomainAddress = "https://contoso.sharepoint.com";
        String userName = "admin@contoso.onmicrosoft.com";
        String password = "MyPassword";

        ProjectServerCredentials credentials = new ProjectServerCredentials(sharepointDomainAddress, userName, password);
        ProjectServerManager reader = new ProjectServerManager(credentials);

        for (ProjectInfo p : (Iterable<ProjectInfo>) reader.getProjectList()) {
            System.out.println("Project Name:" + p.getName());
            System.out.println("Project Created Date:" + p.getCreatedDate());
            System.out.println("Project Last Saved Date:" + p.getLastSavedDate());
        }

        for (ProjectInfo p : (Iterable<ProjectInfo>) reader.getProjectList()) {
            Project project = reader.getProject(p.getId());
            System.out.println("Project " + p.getName() + " loaded.");
            System.out.println("Resources count:" + project.getResources().size());
        }
        // ExEnd:ReadProjectOnline
    }
}
