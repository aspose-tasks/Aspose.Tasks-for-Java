<?php
namespace Aspose\Tasks\WorkingWithTaskLinks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Tsk as Tsk;
use com\aspose\tasks\Prj as Prj;
use com\aspose\tasks\TimeUnitType as TimeUnitType;
use com\aspose\tasks\TaskLinkType as TaskLinkType;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

class UpdateTaskLink{

    public static function run($dataDir=null){

        $one_sec = 10000000; # microsecond * 10
        $one_min = 60 * $one_sec;
        $one_hour = 60 * $one_min;

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $tsk = new Tsk();
        $prj = new Prj();

    	# Add tasks
        $task1 = $project->getRootTask()->getChildren()->add("1");
        $timeUnitType=new TimeUnitType();
        $task1->set($tsk->DURATION, $project->getDuration(8, $timeUnitType->Hour));
        $task1->set($tsk->START, $project->get($prj->START_DATE));
        $task1->set($tsk->FINISH, $project->get($prj->CALENDAR)->getTaskFinishDateFromDuration($task1,(double)(string)($task1->get($tsk->DURATION))));//.toDouble()

        $task2 = $project->getRootTask()->getChildren()->add("2");
        $task2->set($tsk->DURATION, $project->getDuration(8, $timeUnitType->Hour));
        $task2->set($tsk->START, $project->get($prj->START_DATE));
        $task2->set($tsk->FINISH, $project->get($prj->CALENDAR)->getTaskFinishDateFromDuration($task2, (double)(string)($task2->get($tsk->DURATION))));//.toDouble()

        $project->getRootTask()->getChildren()->add($task1);
        $project->getRootTask()->getChildren()->add($task2);

        # Add four TaskLinks with different TaskLinkTypes
        $taskLinkType=new TaskLinkType();
        $link1 = $project->getTaskLinks()->add($task1, $task2, $taskLinkType->StartToStart);


        # Save the Project
        $saveFileFormat=new SaveFileFormat();
        $project->save($dataDir . "TaskLinks.mpp", $saveFileFormat->MPP);

        print "Saved task links data.".PHP_EOL;
    }

}

?>