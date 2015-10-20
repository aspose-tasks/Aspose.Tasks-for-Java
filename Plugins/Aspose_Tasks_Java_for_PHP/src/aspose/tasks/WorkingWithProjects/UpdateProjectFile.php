<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Tsk as Tsk;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

use java\util\Calendar as Calendar;
class UpdateProjectFile{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');
        # create a new task
        $task = $project->getRootTask()->getChildren()->add("Task1");

        # set start date
        $cal=new Calendar();
        $cal = $cal->getInstance();

        $cal->set(2015, 7, 1, 8, 0,0);

        $tsk=new Tsk();
        $task->set($tsk->START, $cal->getTime());

        $cal->set(2015, 7, 1, 17, 0, 0);
        $task->set($tsk->FINISH , $cal->getTime());

        # Save the project as MPP project file
        $saveFileFormat=new SaveFileFormat();
        $project->save($dataDir . "AfterLinking.mpp", $saveFileFormat->MPP);
        print "Project file updated, please check the output file.".PHP_EOL;
    }

}
?>