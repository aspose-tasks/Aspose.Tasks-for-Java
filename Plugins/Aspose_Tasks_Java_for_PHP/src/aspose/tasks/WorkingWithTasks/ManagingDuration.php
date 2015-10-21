<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Tsk as Tsk;
use com\aspose\tasks\TimeUnitType as TimeUnitType;
class ManagingDuration{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project();

        $task = $project->getRootTask()->getChildren()->add("Task");

        $tsk = new Tsk();

		# task duration in days (default time unit)
		$duration = $task->get($tsk->DURATION);
		print "Duration in Days: " . $duration->toString();

		# convert to hours time unit
        $timeUnitType=new TimeUnitType();
		$duration = $duration->convert($timeUnitType->Hour);
		print "Duration in Hours: ". (string)$duration.PHP_EOL;//.toString();

		# Decrease task duration
		$task->set($tsk->DURATION, $task->get($tsk->DURATION)->subtract(0.5));
		print "0.5 wks: " . (string)$task->get($tsk->DURATION).PHP_EOL;//.toString();
    }

}
?>