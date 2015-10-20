<?php
namespace Aspose\Tasks\WorkingWithResourceAssignments;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Asn as Asn;
class AssignmentBudget{

    public static function run($dataDir=null)
    {

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $resource_assignments = $project->getResourceAssignments()->toList();

        # Parse through all the collected resource assignments
        $asn=new Asn();
        $i = 0;
        while ($i < sizeof($resource_assignments)){
            $ra = $resource_assignments->get($i);
          print "Buget Cost: " . (string)$ra -> get($asn -> BUDGET_COST).PHP_EOL;// . toString()
          print "Buget Work: " . (string)$ra -> get($asn -> BUDGET_WORK).PHP_EOL;// . toString()
          print "--------------------------------------------------------" . PHP_EOL;
          $i += 1;
        }
    }
}
?>