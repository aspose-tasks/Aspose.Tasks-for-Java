<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\ChildTasksCollector as ChildTasksCollector;
use com\aspose\tasks\TaskUtils as TaskUtils;
use com\aspose\tasks\Tsk as Tsk;
class HandlingPriorities{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Create a ChildTasksCollector instance
		$collector = new ChildTasksCollector();

        # Collect all the tasks from RootTask using TaskUtils
        $taskUtils=new TaskUtils();
        $taskUtils->apply($project->getRootTask(), $collector, 0);

		$tasks = $collector->getTasks();

		$tsk = new Tsk();

		# Parse through all the collected tasks
		$i = 0;
		while ($i < sizeof($tasks)) {
            $task = $tasks -> get($i);
		    print "Priority: " . (string)$task -> get($tsk -> PRIORITY).PHP_EOL;// . toString()
			print "---------------------------------------------".PHP_EOL;
		    $i += 1;
		}

    }

}
?>