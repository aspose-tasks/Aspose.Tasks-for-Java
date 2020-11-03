/* 
 * Copyright 2001-2013 Aspose Pty Ltd. All Rights Reserved.
 *
 * This file is part of Aspose.Slides. The source code in this file
 * is only intended as a supplement to the documentation, and is provided
 * "as is", without warranty of any kind, either expressed or implied.
 */
 
package com.aspose.tasks.examples.Tasks;

import com.aspose.tasks.*;
import com.aspose.tasks.examples.Utils;

public class HandleTaskConstraints
{
    public static void main(String[] args) throws Exception
    {
        // The path to the documents directory.
        String dataDir = Utils.getDataDir(HandleTaskConstraints.class);
        GetConstraints(dataDir);
        setConstraintTypeStartNoEarlierThan(dataDir);
        setConstraintTypeFinishNoEarlierThan(dataDir);
        SetConstraintTypeMustStartOn(dataDir);
        setConstraintTypeAsLateAsPossible(dataDir);
        setConstraintTypeMustFinishOn(dataDir);
     }
    
    private static void GetConstraints(String dataDir) throws Exception {
    	//ExStart: GetConstraints
    	Project project = new Project(dataDir + "Project2.mpp");

    	// Create a ChildTasksCollector instance
    	ChildTasksCollector collector = new ChildTasksCollector();

    	// Collect all the tasks from RootTask using TaskUtils
    	TaskUtils.apply(project.getRootTask(), collector, 0);

    	// Parse through all the collected tasks
    	for (Task tsk1 : collector.getTasks())
    	{
    	    if (tsk1.get(Tsk.CONSTRAINT_DATE).toString() == "1/1/2000")
    	        System.out.println("NA");
    	    else
    	    	System.out.println(tsk1.get(Tsk.CONSTRAINT_DATE).toString());

    	    System.out.println(tsk1.get(Tsk.CONSTRAINT_TYPE).toString());
    	}
    	//ExEnd: GetConstraints
    }
    private static void setConstraintTypeStartNoEarlierThan(String dataDir) throws Exception {
    	//ExStart: setConstraintTypeStartNoEarlierThan
    	// Create project instance
    	Project project = new Project(dataDir + "ConstraintStartNoEarlierThan.mpp");
    	            
    	// Set constraint Start No Earlier Than on task with Id 1
    	Task summary = project.getRootTask().getChildren().getById(1);
    	summary.set(Tsk.CONSTRAINT_TYPE, ConstraintType.StartNoEarlierThan);
    	
    	java.util.Calendar cal = java.util.Calendar.getInstance();
    	cal.set(2013, 6, 3, 9, 0, 0);
    	summary.set(Tsk.CONSTRAINT_DATE, cal.getTime());

    	// Save project as pdf
    	SaveOptions o = new PdfSaveOptions();
    	o.setStartDate(project.get(Prj.START_DATE));
    	o.setTimescale(Timescale.ThirdsOfMonths);
    	project.save(dataDir + "project_StartNoEarlierThan_out.pdf", o);
    	//ExEnd: setConstraintTypeStartNoEarlierThan
    }
    
    private static void setConstraintTypeFinishNoEarlierThan(String dataDir) throws Exception {
    	//ExStart: setConstraintTypeFinishNoEarlierThan
    	// Create project instance
    	Project project = new Project(dataDir + "ConstraintStartNoEarlierThan.mpp");
    	            
    	// Set constraint Start No Earlier Than on task with Id 1
    	Task summary = project.getRootTask().getChildren().getById(1);
    	summary.set(Tsk.CONSTRAINT_TYPE, ConstraintType.FinishNoEarlierThan);
    	
    	java.util.Calendar cal = java.util.Calendar.getInstance();
    	cal.set(2013, 6, 1, 18, 0, 0);
    	summary.set(Tsk.CONSTRAINT_DATE, cal.getTime());

    	// Save project as pdf
    	SaveOptions o = new PdfSaveOptions();
    	o.setStartDate(project.get(Prj.START_DATE));
    	o.setTimescale(Timescale.ThirdsOfMonths);
    	project.save(dataDir + "project_StartNoEarlierThan_out.pdf", o);
    	//ExEnd: setConstraintTypeFinishNoEarlierThan
    }
    
    private static void SetConstraintTypeMustStartOn(String dataDir) throws Exception {
    	//ExStart: SetConstraintTypeMustStartOn
    	// Create project instance
    	Project project = new Project(dataDir + "ConstraintStartNoEarlierThan.mpp");
    	
    	// Set constraint Must Start On for task with Id 2
    	Task roof = project.getRootTask().getChildren().getById(2);
    	roof.set(Tsk.CONSTRAINT_TYPE, ConstraintType.MustFinishOn);

    	java.util.Calendar cal = java.util.Calendar.getInstance();
    	cal.set(2013, 6, 1, 18, 0, 0);
    	roof.set(Tsk.CONSTRAINT_DATE, cal.getTime());

    	// Save project as pdf
    	SaveOptions options = new PdfSaveOptions();
    	options.setStartDate(project.get(Prj.START_DATE));
    	options.setTimescale(Timescale.ThirdsOfMonths);
    	project.save(dataDir + "project_MustStartOn_out.pdf", options);
    	//ExEnd: SetConstraintTypeMustStartOn
    }
    
    private static void setConstraintTypeAsLateAsPossible(String dataDir) throws Exception {
    	//ExStart: setConstraintTypeAsLateAsPossible
    	// Create project instance
    	Project project = new Project(dataDir + "ConstraintStartNoEarlierThan.mpp");
    	
    	// Set constraint As Late As Possible for task with Id 11
    	Task wallBoard = project.getRootTask().getChildren().getById(11);
    	wallBoard.set(Tsk.CONSTRAINT_TYPE, ConstraintType.AsLateAsPossible);            
    	            
    	// Save project as pdf
    	SaveOptions options = new PdfSaveOptions();
    	options.setStartDate(project.get(Prj.START_DATE));
    	options.setTimescale(Timescale.ThirdsOfMonths);
    	project.save(dataDir + "project_AsLateAsPossible_out.pdf", options);
    	//ExEnd: setConstraintTypeAsLateAsPossible
    }
    
    private static void setConstraintTypeMustFinishOn(String dataDir) throws Exception {
    	//ExStart: setConstraintTypeMustFinishOn
    	// Create project instance
    	Project project = new Project(dataDir + "ConstraintStartNoEarlierThan.mpp");
    	
    	// Set constraint Must Finish On for task with Id 15
    	Task interiorFixtures = project.getRootTask().getChildren().getById(15);
    	interiorFixtures.set(Tsk.CONSTRAINT_TYPE, ConstraintType.MustFinishOn);
    	
    	java.util.Calendar cal = java.util.Calendar.getInstance();
    	cal.set(2013, 9, 21, 18, 0, 0);
    	interiorFixtures.set(Tsk.CONSTRAINT_DATE, cal.getTime());
    	            
    	// Save project as pdf
    	SaveOptions options = new PdfSaveOptions();
    	options.setStartDate(project.get(Prj.START_DATE));
    	options.setTimescale(Timescale.ThirdsOfMonths);
    	project.save(dataDir + "project_MustFinishOn_out.pdf", options);
    	//ExEnd: setConstraintTypeMustFinishOn
    }

}




