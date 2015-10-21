<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Tsk as Tsk;


class ChangeProgressOfTask{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project();

        print $project->getCalculationMode();

        $task = $project->getRootTask()->getChildren()->add("Task");

        $tsk = new Tsk();

        $task->set($tsk->DURATION, $project->getDuration(2));

        $task->set($tsk->PERCENT_COMPLETE, 50);

        print "Changed progress of task.".PHP_EOL;

    }

}
?>