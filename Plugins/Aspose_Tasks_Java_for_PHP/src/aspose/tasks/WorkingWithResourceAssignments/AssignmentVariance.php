<?php
namespace Aspose\Tasks\WorkingWithResourceAssignments;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Asn as Asn;
class AssignmentVariance{

    public static function run($dataDir=null)
    {

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $resource_assignments = $project->getResourceAssignments()->toList();

        # Parse through all the collected resource assignments
        $i = 0;
        $asn=new Asn();
        while ($i < sizeof($resource_assignments)){
            $ra = $resource_assignments->get($i);
          print "Work Variance: " . (string)$ra -> get($asn -> WORK_VARIANCE).PHP_EOL;// . toString()
          print "Cost Variance: " . (string)$ra -> get($asn -> COST_VARIANCE).PHP_EOL;// . toString()
          print "Start Variance: " . (string)$ra -> get($asn -> START_VARIANCE).PHP_EOL;// . toString()
          print "Finish Variance: " . (string)$ra -> get($asn -> FINISH_VARIANCE).PHP_EOL;// . toString()
          print "--------------------------------------------------------".PHP_EOL;
          $i += 1;
        }

    }
}
?>