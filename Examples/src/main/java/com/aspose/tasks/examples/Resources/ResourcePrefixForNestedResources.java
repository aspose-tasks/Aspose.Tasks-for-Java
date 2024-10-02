/*
 * Copyright 2001-2024 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Tasks. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */

package com.aspose.tasks.examples.Resources;

import com.aspose.tasks.CssSavingArgs;
import com.aspose.tasks.FontFaceType;
import com.aspose.tasks.FontSavingArgs;
import com.aspose.tasks.HtmlSaveOptions;
import com.aspose.tasks.ICssSavingCallback;
import com.aspose.tasks.IFontSavingCallback;
import com.aspose.tasks.IImageSavingCallback;
import com.aspose.tasks.ImageSavingArgs;
import com.aspose.tasks.PageSize;
import com.aspose.tasks.Project;
import com.aspose.tasks.ResourceExportType;
import com.aspose.tasks.Timescale;
import com.aspose.tasks.examples.Utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

//ExStart: ResourcePrefixForNestedResources
public class ResourcePrefixForNestedResources implements IFontSavingCallback, ICssSavingCallback, IImageSavingCallback {
    public static String dataDir = Utils.getDataDir(ResourcePrefixForNestedResources.class);

    public static void main(String[] args) throws IOException {
        FileInputStream fs = new FileInputStream(dataDir + "project1.mpp");
        Project project = new Project(fs);
        HtmlSaveOptions options = GetSaveOptions(1);
        FileOutputStream stream = new FileOutputStream(dataDir + "document.html");
        project.save(stream, options);
    }

    public void cssSaving(CssSavingArgs args) {
        FileOutputStream stream;
        try {
            stream = new FileOutputStream(dataDir + "css/" + args.getFileName());
            args.setStream(stream);
            args.setKeepStreamOpen(false);
            args.setUri(dataDir + "css/" + args.getFileName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void fontSaving(FontSavingArgs args) {
        FileOutputStream stream;
        try {
            stream = new FileOutputStream(dataDir + "fonts/" + args.getFileName());
            args.setStream(stream);
            args.setKeepStreamOpen(false);
            args.setUri(dataDir + "fonts/" + args.getFileName());
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void imageSaving(ImageSavingArgs args) {
        if (args.getFileName().endsWith("png")) {
            FileOutputStream stream1;
            try {
                stream1 = new FileOutputStream(dataDir + "nestedResources/" + args.getFileName());
                args.setStream(stream1);
                args.setKeepStreamOpen(false);
                args.setUri(dataDir + "resources/" + args.getFileName());
                //args.setNestedUri(dataDir + "nestedResources/" + args.getFileName());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        } else {
            FileOutputStream stream2;
            try {
                stream2 = new FileOutputStream(dataDir + "resources/" + args.getFileName());
                args.setStream(stream2);
                args.setKeepStreamOpen(false);
                args.setUri(dataDir + "resources/" + args.getFileName());
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }
    }

    private static HtmlSaveOptions GetSaveOptions(int pageNumber) {
        HtmlSaveOptions saveOptions = new HtmlSaveOptions();
        saveOptions.setIncludeProjectNameInPageHeader(false);
        saveOptions.setIncludeProjectNameInTitle(false);
        saveOptions.setPageSize(PageSize.A3);
        saveOptions.setTimescale(Timescale.ThirdsOfMonths);
        saveOptions.setReduceFooterGap(true);
        saveOptions.setFontFaceTypes(FontFaceType.Ttf);
        saveOptions.setExportCss(ResourceExportType.AsFile);
        saveOptions.setExportFonts(ResourceExportType.AsFile);
        saveOptions.setExportImages(ResourceExportType.AsFile);

        ResourcePrefixForNestedResources program = new ResourcePrefixForNestedResources();
        saveOptions.setFontSavingCallback(program);
        saveOptions.setCssSavingCallback(program);
        saveOptions.setImageSavingCallback(program);

        saveOptions.getPages().clear();
        saveOptions.getPages().add(pageNumber);

        File dirFonts = new File(dataDir + "fonts");
        if (!dirFonts.exists()) {
            dirFonts.mkdir();
        }

        File dirResources = new File(dataDir + "resources");
        if (!dirResources.exists()) {
            dirResources.mkdir();
        }

        File dirNResources = new File(dataDir + "nestedResources");
        if (!dirNResources.exists()) {
            dirNResources.mkdir();
        }

        File dirCSS = new File(dataDir + "css");
        if (!dirCSS.exists()) {
            dirCSS.mkdir();
        }

        return saveOptions;
    }
}
//ExEnd: ResourcePrefixForNestedResources