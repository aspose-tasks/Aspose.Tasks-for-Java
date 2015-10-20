<?php
namespace Aspose\Tasks\WorkingWithResources;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Rsc as Rsc;
class ResourceCost{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

		$resources = $project->getResources()->toList();

		$rsc = new Rsc();

		# Parse through all the collected tasks
		$i = 0;
		while ($i < sizeof($resources)) {
            $resource = $resources -> get($i);
		    if ($resource -> get($rsc -> NAME) != null) {
                print "Cost: " . (string)$resource -> get($rsc -> COST).PHP_EOL; //. to_string
			    print "ACWP: " . (string)$resource -> get($rsc -> ACWP).PHP_EOL;//. to_string
			    print "BCWS: " . (string)$resource -> get($rsc -> BCWS).PHP_EOL; //. to_string
			    print "BCWP: " . (string)$resource -> get($rsc -> BCWP).PHP_EOL;// . to_string
			    print "---------------------------------------------".PHP_EOL;
			}
		    $i += 1;
		}

    }

}
?>