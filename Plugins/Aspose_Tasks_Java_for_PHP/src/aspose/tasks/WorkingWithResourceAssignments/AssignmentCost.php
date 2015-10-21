<?php
namespace Aspose\Tasks\WorkingWithResourceAssignments;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Asn as Asn;
class AssignmentCost{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $resource_assignments = $project->getResourceAssignments()->toList();

        # Parse through all the collected resource assignments
        $asn=new Asn();
        $i = 0;
        while ($i < sizeof($resource_assignments)) {
          $ra = $resource_assignments -> get($i);
          print "COST: " . (string)$ra -> get($asn -> COST).PHP_EOL;// . to_string
          print "ACWP: " . (string)$ra -> get($asn -> ACWP).PHP_EOL;// . to_string
          print "BCWP: " . (string)$ra -> get($asn -> BCWP).PHP_EOL;// . to_string
          print "BCWS: " . (string)$ra -> get($asn -> BCWS).PHP_EOL;// . to_string
          print "--------------------------------------------------------".PHP_EOL;
          $i += 1;
        }

    }

}
?>