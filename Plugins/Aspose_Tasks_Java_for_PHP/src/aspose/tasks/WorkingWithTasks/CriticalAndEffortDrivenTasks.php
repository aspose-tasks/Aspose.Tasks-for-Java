<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\ChildTasksCollector as ChildTasksCollector;
use com\aspose\tasks\TaskUtils as TaskUtils;
use com\aspose\tasks\Tsk as Tsk;
class CriticalAndEffortDrivenTasks{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Create a ChildTasksCollector instance
		$collector = new ChildTasksCollector();

            # Collect all the tasks from RootTask using TaskUtils
        $taskUtils=new TaskUtils();
        $taskUtils->apply($project->getRootTask(), $collector, 0);

		$tsk = new Tsk();

		# Parse through all the collected tasks
        $tasks = $collector->getTasks();
        $i = 0;
        while ($i < sizeof($tasks)) {
            $task = $tasks -> get($i);
	        print $str_ed = $task -> get($tsk -> IS_EFFORT_DRIVEN) != null ? "EffortDriven" : "Non-EffortDriven".PHP_EOL;
	 	    print $str_crit = $task -> get($tsk -> IS_CRITICAL) != null ? "Critical" : "Non-Critical".PHP_EOL;
            $i += 1;
		}

    }

}