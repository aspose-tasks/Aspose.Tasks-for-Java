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

public class ReadingProjectOnline {
    public static void main(String[] args) throws Exception {
        // ExStart:ReadingProjectOnline
        String sharepointDomainAddress = "https://contoso.sharepoint.com";
        String userName = "admin@contoso.onmicrosoft.com";
        String password = "MyPassword";

        ProjectServerCredentials credentials = new ProjectServerCredentials(sharepointDomainAddress, userName, password);
        ProjectServerManager reader = new ProjectServerManager(credentials);

        for (ProjectInfo p : reader.getProjectList()) {
            System.out.println("Project Name:" + p.getName());
            System.out.println("Project Created Date:" + p.getCreatedDate());
            System.out.println("Project Last Saved Date:" + p.getLastSavedDate());
        }

        for (ProjectInfo p : reader.getProjectList()) {
            Project project = reader.getProject(p.getId());
            System.out.println("Project " + p.getName() + " loaded.");
            System.out.println("Resources count:" + project.getResources().size());
        }
        // ExEnd:ReadingProjectOnline
    }
}
