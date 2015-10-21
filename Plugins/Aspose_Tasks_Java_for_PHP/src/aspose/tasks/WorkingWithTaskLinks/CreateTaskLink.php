<?php
namespace Aspose\Tasks\WorkingWithTaskLinks;

use com\aspose\tasks\Project as Project;
class CreateTaskLink{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project();

        $pred = $project->getRootTask()->getChildren()->add("Task 1");
    	$succ = $project->getRootTask()->getChildren()->add("Task 2");
    	$link = $project->getTaskLinks()->add($pred, $succ);

    	print "Created task link.".PHP_EOL;
    }

}
?>