<?php
namespace Aspose\Tasks\WorkingWithResources;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;

class ReadTimephasedResourceData{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

		# Get the Resource by its ID
		$resource = $project->getResources()->getByUid(1);

		$prj = new Prj();

		# Print Timephased data of ResourceWork
		print "Timephased data of Resource Work".PHP_EOL;
		$result = $resource->getTimephasedData($project->get($prj->START_DATE), $project->get($prj->FINISH_DATE))->toList();

		$i = 0;
		while ($i < sizeof($result)) {
            $td = $result -> get($i);
		    print "Start: " . (string)$td -> getStart().PHP_EOL;// . toString()
		    print "Work: " . (string)$td -> getValue().PHP_EOL;
		    $i += 1;
		}

    }


}
?>