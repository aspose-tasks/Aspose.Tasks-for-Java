package com.aspose.tasks.examples.Projects;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;

import com.aspose.tasks.Duration;
import com.aspose.tasks.ParseErrorArgs;
import com.aspose.tasks.ParseErrorCallback;
import com.aspose.tasks.Project;
import com.aspose.tasks.SaveFileFormat;
import com.aspose.tasks.TimeUnitType;
import com.aspose.tasks.examples.Utils;

public class IgnoringInvalidCharactersDuringLoadingProject {
	// ExStart: IgnoringInvalidCharactersDuringLoadingProject
	public static void main(String[] args) throws IOException {
		// For complete examples and data files, please go to https://github.com/aspose-tasks/Aspose.Tasks-for-Java
		
		// The path to the documents directory.
		String dataDir = Utils.getDataDir(ReadingProjectDatafromMicrosoftProjectDatabase.class);
				
		InputStream stream = null;
	    try
	    {
	        stream = new ByteArrayInputStream(getModifiedXml().getBytes("utf-8"));
	    }
	    catch (UnsupportedEncodingException e)
	    {
	        e.printStackTrace();
	    }
	 
	    Project project = new Project(stream, new ParseErrorCallback()
	    {
	    	public Object invoke(Object sender, ParseErrorArgs args)
	    	{
	    		return customDurationHandler(sender, args);
	    	}
	    });
	    project.save(dataDir + "Project1.xml", SaveFileFormat.XML);
	}

	private static String getModifiedXml()
	{
	    StringBuilder xml = new StringBuilder();
	 
	    BufferedReader reader;
	    String line;
	    try
	    {
	        reader = new BufferedReader(new InputStreamReader(new FileInputStream("NewProductDev.xml"), "UTF8"));
	        while ((line = reader.readLine()) != null)
	        {
	            xml.append(line).append("\n");
	        }
	    }
	    catch (Exception e)
	    {
	        e.printStackTrace();
	    }
	 
	    return xml.toString().replaceAll("PT(\\d+)H(\\d+)M(\\d+)S", "**$1Hrs$2Mins$3Secs**");
	}
	 
	private static Object customDurationHandler(Object sender, ParseErrorArgs args)
	{
	        System.err.print(String.format("Object field : %s; Invalid value : %s; ", args.getFieldName(), args.getInvalidValue()));
	        String duration = args.getInvalidValue().replaceAll("[*]{2}(\\d+)Hrs(\\d+)Mins(\\d+)Secs[*]{2}", "PT$1H$2M$3S");
	        double newValue = Duration.parseTimeSpan(duration)*0.001/60/60;
	        System.err.println(String.format("New value : %s", duration));
	        Project project = new Project();
			return project.getDuration(newValue, TimeUnitType.Hour);
	}
	// ExEnd: IgnoringInvalidCharactersDuringLoadingProject
}
