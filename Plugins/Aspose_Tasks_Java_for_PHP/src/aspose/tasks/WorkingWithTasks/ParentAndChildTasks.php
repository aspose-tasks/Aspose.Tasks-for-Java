<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\ChildTasksCollector as ChildTasksCollector;
use com\aspose\tasks\TaskUtils as TaskUtils;
use com\aspose\tasks\Tsk as Tsk;
class ParentAndChildTasks{

    public static function run($dataDir=null){

        # Getting Parent and Child Tasks
        ParentAndChildTasks::get_parent_and_child_tasks($dataDir);
    }

    public static function get_parent_and_child_tasks($dataDir=null)
    {

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Create a ChildTasksCollector instance
        $collector = new ChildTasksCollector();

        # Collect all the tasks from RootTask using TaskUtils
        $taskUtils = new TaskUtils();
        $taskUtils->apply($project->getRootTask(), $collector, 0);

        $tsk = new Tsk();

        $tasks = $collector->getTasks();

        # Parse through all the collected tasks
        $i = 0;
        while ($i < sizeof($tasks)){
            $task = $tasks->get($i);
        print "Task Name = " . (string)$task->get($tsk->NAME);//.to_string
        $i+= 1;
        }

    }

}