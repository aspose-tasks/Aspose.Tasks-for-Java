<?php
namespace Aspose\Tasks\WorkingWithResourceAssignments;

use com\aspose\tasks\Project as Project;
class CreateResourceAssignment{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $task = $project->getRootTask()->getChildren()->add("Task");

    	$rsc = $project->getResources()->add("Rsc");

    	$assn = $project->getResourceAssignments()->add($task, $rsc);

    	print "Created resource assignment.".PHP_EOL;

    }

}
?>