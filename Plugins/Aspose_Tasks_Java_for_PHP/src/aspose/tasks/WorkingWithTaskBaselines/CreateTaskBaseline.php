<?php
namespace Aspose\Tasks\WorkingWithTaskBaselines;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\BaselineType as BaselineType;
class CreateTaskBaseline{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

    	# Set baseline for the entire project
        $baselineType=new BaselineType();
    	$project->setBaseline($baselineType->Baseline);

    	print "Set baseline for the project.".PHP_EOL;
    }

}
?>