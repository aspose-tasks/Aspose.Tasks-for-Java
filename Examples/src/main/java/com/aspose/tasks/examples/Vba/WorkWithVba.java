/*
 * Copyright 2001-2022 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Vba;

import com.aspose.tasks.IVbaModule;
import com.aspose.tasks.Project;
import com.aspose.tasks.VbaProject;
import com.aspose.tasks.VbaReference;
import com.aspose.tasks.VbaReferenceCollection;
import com.aspose.tasks.examples.Utils;

public class WorkWithVba {
    public static void main(String[] args) throws Exception {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(WorkWithVba.class);

        ReadVBAProjectInformation(dataDir);
        ReadReferencesInformation(dataDir);
        ReadModulesInformation(dataDir);
        ReadModuleAttributesInformation(dataDir);
    }

    private static void ReadVBAProjectInformation(String dataDir) throws Exception {
        //ExStart:ReadVBAProjectInformation
        // Load project file
        Project project = new Project(dataDir + "VbaProject1.mpp");

        VbaProject vbaProject = project.getVbaProject();

        System.out.println("VbaProject.Name " + vbaProject.getName());
        System.out.println("VbaProject.Description " + vbaProject.getDescription());
        System.out.println("VbaProject.CompilationArguments" + vbaProject.getCompilationArguments());
        System.out.println("VbaProject.HelpContextId" + vbaProject.getHelpContextId());
        //ExEnd:ReadVBAProjectInformation
    }

    private static void ReadReferencesInformation(String dataDir) throws Exception {
        //ExStart: ReadReferencesInformation
        // Load project file
        Project project = new Project(dataDir + "VbaProject1.mpp");

        VbaProject vbaProject = project.getVbaProject();
        VbaReferenceCollection references = vbaProject.getReferences();
        System.out.println("Reference count " + references.size());

        VbaReference reference = vbaProject.getReferences().toList().get(0);
        System.out.println("Identifier: " + reference.getLibIdentifier());
        System.out.println("Name: " + reference.getName());

        reference = vbaProject.getReferences().toList().get(1);
        System.out.println("Identifier: " + reference.getLibIdentifier());
        System.out.println("Name: " + reference.getName());

        reference = vbaProject.getReferences().toList().get(2);
        System.out.println("Identifier: " + reference.getLibIdentifier());
        System.out.println("Name: " + reference.getName());
        //ExEnd: ReadReferencesInformation
    }

    private static void ReadModulesInformation(String dataDir) throws Exception {
        //ExStart: ReadModulesInformation
        // Load project file
        Project project = new Project(dataDir + "VbaProject1.mpp");

        VbaProject vbaProject = project.getVbaProject();
        System.out.println("Total Modules Count: " + vbaProject.getModules().size());

        IVbaModule vbaModule = vbaProject.getModules().toList().get(0);
        System.out.println("Module Name: " + vbaModule.getName());
        System.out.println("Source Code: " + vbaModule.getSourceCode());
        //ExEnd: ReadModulesInformation
    }

    private static void ReadModuleAttributesInformation(String dataDir) throws Exception {
        //ExStart: ReadModuleAttributesInformation
        // Load project file
        Project project = new Project(dataDir + "VbaProject1.mpp");

        VbaProject vbaProject = project.getVbaProject();
        IVbaModule vbaModule = vbaProject.getModules().toList().get(0);

        System.out.println("Attributes Count: " + vbaModule.getAttributes().size());
        System.out.println("VB_Name: " + vbaModule.getAttributes().toList().get(0).getKey());
        System.out.println("Module1: " + vbaModule.getAttributes().toList().get(0).getValue());
        //ExEnd: ReadModuleAttributesInformation
    }
}
