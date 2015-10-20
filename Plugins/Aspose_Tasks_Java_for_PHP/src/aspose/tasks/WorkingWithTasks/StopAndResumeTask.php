<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\ChildTasksCollector as ChildTasksCollector;
use com\aspose\tasks\TaskUtils as TaskUtils;
use com\aspose\tasks\Tsk as Tsk;
class StopAndResumeTask{
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
            $task = $tasks->get($i);
            if ((string)$task->get($tsk->STOP) == "1/1/2015") {
                print "NA" . PHP_EOL;
            } else {
                print "Task Stop: " . (string)$task->get($tsk->STOP) . PHP_EOL;// . toString()
            }

            if ((string)$task->get($tsk->RESUME) == "1/1/2015") {
                print "NA" . PHP_EOL;
            } else {
                print "Task Resume: " . (string)$task->get($tsk->RESUME);// . toString()
            }
            print "---------------------------------------------" . PHP_EOL;
            $i += 1;
        }
    }
}
?>