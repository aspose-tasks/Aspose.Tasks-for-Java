/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Vba;

import com.aspose.tasks.IVbaModule;
import com.aspose.tasks.MPPSaveOptions;
import com.aspose.tasks.Project;
import com.aspose.tasks.VbaProject;
import com.aspose.tasks.VbaReference;
import com.aspose.tasks.VbaReferenceCollection;
import com.aspose.tasks.examples.Utils;

public class WorkWithVba {
    public static void main(String[] args) {
        // The path to the document directory.
        String dataDir = Utils.getDataDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        // The path to the output directory.
        String outDir = Utils.getOutDir(java.lang.invoke.MethodHandles.lookup().lookupClass());

        ReadVBAProjectInformation(dataDir);
        ReadReferencesInformation(dataDir);
        ReadModulesInformation(dataDir);
        ReadModuleAttributesInformation(dataDir);
        ClearVbaInformation(dataDir, outDir);
    }

    private static void ReadVBAProjectInformation(String dataDir) {
        // Load project file
        Project project = new Project(dataDir + "VbaProject1.mpp");

        VbaProject vbaProject = project.getVbaProject();

        System.out.println("VbaProject.Name " + vbaProject.getName());
        System.out.println("VbaProject.Description " + vbaProject.getDescription());
        System.out.println("VbaProject.CompilationArguments" + vbaProject.getCompilationArguments());
        System.out.println("VbaProject.HelpContextId" + vbaProject.getHelpContextId());
    }

    private static void ReadReferencesInformation(String dataDir) {
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
    }

    private static void ReadModulesInformation(String dataDir) {
        // Load project file
        Project project = new Project(dataDir + "VbaProject1.mpp");

        VbaProject vbaProject = project.getVbaProject();
        System.out.println("Total Modules Count: " + vbaProject.getModules().size());

        IVbaModule vbaModule = vbaProject.getModules().toList().get(0);
        System.out.println("Module Name: " + vbaModule.getName());
        System.out.println("Source Code: " + vbaModule.getSourceCode());
    }

    private static void ReadModuleAttributesInformation(String dataDir) {
        // Load project file
        Project project = new Project(dataDir + "VbaProject1.mpp");

        VbaProject vbaProject = project.getVbaProject();
        IVbaModule vbaModule = vbaProject.getModules().toList().get(0);

        System.out.println("Attributes Count: " + vbaModule.getAttributes().size());
        System.out.println("VB_Name: " + vbaModule.getAttributes().toList().get(0).getKey());
        System.out.println("Module1: " + vbaModule.getAttributes().toList().get(0).getValue());
    }

    private static void ClearVbaInformation(String dataDir, String outDir) {
        Project project = new Project(dataDir + "VbaProject1.mpp");
        MPPSaveOptions options = new MPPSaveOptions();
        options.setClearVba(true);
        project.save(outDir + "Vba.cleared.mpp", options);
    }
}
