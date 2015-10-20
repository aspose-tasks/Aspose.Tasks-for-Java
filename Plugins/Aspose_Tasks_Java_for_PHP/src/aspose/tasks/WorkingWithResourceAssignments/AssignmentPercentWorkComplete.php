<?php
namespace Aspose\Tasks\WorkingWithResourceAssignments;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Asn as Asn;
class AssignmentPercentWorkComplete{

    public  static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $resource_assignments = $project->getResourceAssignments()->toList();

        # Parse through all the collected resource assignments
        $i = 0;
        $asn=new Asn();
        while ($i < sizeof($resource_assignments)) {
          $ra = $resource_assignments -> get($i);
          print "Percentage of the Completed Work: " . (string)$ra -> get($asn -> PERCENT_WORK_COMPLETE).PHP_EOL;// . toString()
          print "--------------------------------------------------------".PHP_EOL;
          $i += 1;
        }
    }
}
?>