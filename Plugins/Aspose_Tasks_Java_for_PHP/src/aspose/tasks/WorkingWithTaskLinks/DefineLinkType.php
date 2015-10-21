<?php
namespace Aspose\Tasks\WorkingWithTaskLinks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\TaskLinkType as TaskLinkType;
class DefineLinkType{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project();

        $pred = $project->getRootTask()->getChildren()->add("Task 1");
    	$succ = $project->getRootTask()->getChildren()->add("Task 2");
    	$link = $project->getTaskLinks()->add($pred, $succ);
        $taskLinkType=new TaskLinkType();
        $link->setLinkType($taskLinkType->StartToStart);

		print "Defined task link type.".PHP_EOL;
    }

}
?>