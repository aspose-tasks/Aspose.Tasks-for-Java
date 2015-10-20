<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\ChildTasksCollector as ChildTasksCollector;
use com\aspose\tasks\TaskUtils as TaskUtils;
use com\aspose\tasks\Tsk as Tsk;
class TasksProperties{

    public static function run($dataDir=null){

        # Getting General Properties
        TasksProperties::get_general_properties($dataDir);

        # Getting Actual Properties
        TasksProperties::get_actual_properties($dataDir);

        # Getting Outline Properties
        TasksProperties::get_outline_properties($dataDir);
    }

    public static function get_general_properties($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Create a ChildTasksCollector instance
		$collector = new ChildTasksCollector();

        # Collect all the tasks from RootTask using TaskUtils
        $taskUtils=new TaskUtils();
        $taskUtils->apply($project->getRootTask(), $collector, 0);
		$tasks = $collector->getTasks();
		#puts tasks.size()
		#abort()

        $tsk = new Tsk();

		# Parse through all the collected tasks
		#tasks.each do |task|
		$i = 0;
		while ($i < sizeof($tasks)) {
            $task = $tasks -> get($i);
		    print "Task Id:" . $task -> get($tsk -> ID).PHP_EOL;// . to_string
		    print "Task Uid: " . $task -> get($tsk -> UID).PHP_EOL;// . to_string
		    print "Task Name: " . $task -> get($tsk -> NAME).PHP_EOL;// . to_string
		    print "Task Start: " . $task -> get($tsk -> START).PHP_EOL;// . to_string
		    print "Task Finish: " . $task -> get($tsk -> FINISH).PHP_EOL;// . to_string
		    print "---------------------------------------------".PHP_EOL;
		    $i += 1;
		}
    }

    public static function get_actual_properties($dataDir=null){

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
		    print "Task Name : " . (string)$task -> get($tsk -> NAME).PHP_EOL;// . to_string
			print "Actual Start: " . (string)$task -> get($tsk -> ACTUAL_START).PHP_EOL;// . toString()
			print "Actual Finish: " . (string)$task -> get($tsk -> ACTUAL_FINISH).PHP_EOL;// . toString()
			print "Actual Duration: " . (string)$task -> get($tsk -> ACTUAL_DURATION).PHP_EOL;// . toString()
			print "Actual Cost: " . (string)$task->get($tsk -> ACTUAL_COST).PHP_EOL;// . toString()
			print "---------------------------------------------".PHP_EOL;
		    $i += 1;
		}

    }

    public static function get_outline_properties($dataDir=null){

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
		while ($i<sizeof($tasks)) {
            $task=$tasks->get($i);
		    print "Outline Level: " . (string)$task->get($tsk -> OUTLINE_LEVEL).PHP_EOL;// . to_string;
			print "Outline Number: " . (string)$task->get($tsk -> OUTLINE_NUMBER).PHP_EOL;// . to_string;
			print "---------------------------------------------".PHP_EOL;
		    $i += 1;
		}

    }

}
?>