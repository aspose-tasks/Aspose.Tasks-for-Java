<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Tsk as Tsk;
use com\aspose\tasks\TimeUnitType as TimeUnitType;
class CalculateTaskDuration{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $tsk = new Tsk();
        $time_unit_type = new TimeUnitType();

        # Get a task to calculate its duration in different formats
		$task = $project->getRootTask()->getChildren()->getById(1);

		# Get the duration in Minutes
		print (double)(string)($task->get($tsk->DURATION)->convert($time_unit_type->Minute)).PHP_EOL;//.toDouble();

		# Get the duration in Days
        print (double)(string)($task->get($tsk->DURATION)->convert($time_unit_type->Day)).PHP_EOL;//.toDouble());

		# Get the duration in Hours
        print (double)(string)($task->get($tsk->DURATION)->convert($time_unit_type->Hour)).PHP_EOL;//.toDouble();

		# Get the duration in Weeks
        print (double)(string)($task->get($tsk->DURATION)->convert($time_unit_type->Week)).PHP_EOL;//.toDouble();

		# Get the duration in Months
        print (double)(string)($task->get($tsk->DURATION)->convert($time_unit_type->Month)).PHP_EOL;//.toDouble();

    }
}
?>