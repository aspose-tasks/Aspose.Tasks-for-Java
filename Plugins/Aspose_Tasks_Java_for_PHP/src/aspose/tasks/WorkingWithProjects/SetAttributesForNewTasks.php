<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;
use com\aspose\tasks\TaskStartDateType as TaskStartDateType;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

class SetAttributesForNewTasks{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $prj = new Prj();

        # Set new task property

        $taskStartDateType=new TaskStartDateType();

        $project->set($prj->NEW_TASK_START_DATE, $taskStartDateType->CurrentDate);

        $saveFileFormat=new SaveFileFormat();
        $project->save($dataDir . "set_attributes_for_new_tasks.xml", $saveFileFormat->XML);
        print "Set attributes for new tasks, please check the output file.".PHP_EOL;
    }
}
?>