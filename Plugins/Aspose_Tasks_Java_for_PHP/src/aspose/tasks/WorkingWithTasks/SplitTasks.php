<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;
use com\aspose\tasks\Tsk as Tsk;
use com\aspose\tasks\Asn as Asn;
use com\aspose\tasks\WorkContourType as WorkContourType;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

use java\util\Calendar as Calendar;
class SplitTasks{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project();

        $prj = new Prj();
        $tsk = new Tsk();

        # Get a standard calendar
		$calendar = $project->get($prj->CALENDAR);

		# Set project's calendar settings
        $cal=new Calendar();
		$cal = $cal->getInstance();
		$cal->set(2011, 3, 15, 8, 0, 0);
		$project->set($prj->START_DATE, $cal->getTime());
		$cal->set(2011, 3, 21, 17, 0, 0);
		$project->set($prj->FINISH_DATE, $cal->getTime());

		# root task
		$rootTask = $project->getRootTask();
		$rootTask->set($tsk->NAME, "Root");

		# Add a new task
		$taskToSplit = $rootTask->getChildren()->add("Task1");
		$taskToSplit->set($tsk->DURATION, $project->getDuration(3));

		# Create a new resource assignment
		$splitResourceAssignment = $project->getResourceAssignments()->add($taskToSplit, null);

		# Generate resource assignment timephased data
		$splitResourceAssignment->timephasedDataFromTaskDuration($calendar);

        # Split the task into 3 parts.
        # Provide start date and finish date arguments to SplitTask method
        # These dates will be used for split
        # Set project's calendar settings
        $cal=new Calendar();
        $cal = $cal->getInstance();
        $cal2=new Calendar();
		$cal2 = $cal2->getInstance();

		$cal->set(2011, 3, 16, 8, 0, 0);
		$cal2->set(2011, 3, 16, 17, 0, 0);
		$splitResourceAssignment->splitTask($cal->getTime(), $cal2->getTime(), $calendar);
		$cal->set(2011, 3, 18, 8, 0, 0);
		$cal2->set(2011, 3, 18, 17, 0, 0);
		$splitResourceAssignment->splitTask($cal->getTime(), $cal2->getTime(), $calendar);
        $asn=new Asn();
        $workContourType=new WorkContourType();
		$splitResourceAssignment->set($asn->WORK_CONTOUR, $workContourType->Contoured);

		# Save the Project
        $saveFileFormat=new SaveFileFormat();
		$project->save($dataDir . "SplitTasks.xml", $saveFileFormat->XML);
    }

}