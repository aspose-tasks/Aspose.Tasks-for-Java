package com.aspose.tasks.examples.Projects;

import com.aspose.tasks.Project;
import com.aspose.tasks.ProjectInfo;
import com.aspose.tasks.ProjectServerManager;
import com.aspose.tasks.ProjectServerCredentials;

public class ReadingProjectOnline {

	public static void main(String[] args) throws Exception {
		// ExStart:ReadingProjectOnline
        String sharepointDomainAddress = "https://contoso.sharepoint.com";
        String userName = "admin@contoso.onmicrosoft.com";
        String password = "MyPassword";

        ProjectServerCredentials credentials = new ProjectServerCredentials(sharepointDomainAddress, userName, password);
        ProjectServerManager reader = new ProjectServerManager(credentials);

        for (ProjectInfo p : (Iterable<ProjectInfo>)reader.getProjectList())
        {
        	System.out.println("Project Name:" + p.getName());
        	System.out.println("Project Created Date:" + p.getCreatedDate());
        	System.out.println("Project Last Saved Date:" + p.getLastSavedDate());
        }

        for (ProjectInfo p : (Iterable<ProjectInfo>)reader.getProjectList())
        {
        	Project project = reader.getProject(p.getId());
        	System.out.println("Project " + p.getName() + " loaded.");
        	System.out.println("Resources count:" + project.getResources().size());
        }
        
        // ExEnd:ReadingProjectOnline
	}

}
