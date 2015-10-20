<?php
namespace Aspose\Tasks\WorkingWithResourceAssignments;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Asn as Asn;
class AssignmentOvertimeAndRemainingCosts{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $resource_assignments = $project->getResourceAssignments()->toList();

        # Parse through all the collected resource assignments
        $asn=new Asn();
        $i = 0;
        while ($i < sizeof($resource_assignments)) {
          $ra = $resource_assignments -> get($i);
          print "Overtime Cost: " . $ra -> get($asn -> OVERTIME_COST).PHP_EOL;// . toString()
          print "Overtime Work: " . $ra -> get($asn -> OVERTIME_WORK).PHP_EOL;// . toString()
          print "Remaining Cost: " . $ra -> get($asn -> REMAINING_COST).PHP_EOL;// . toString()
          print "Remaining Overtime Cost: " . $ra -> get($asn -> REMAINING_OVERTIME_COST).PHP_EOL;// . toString()
          print "Remaining Overtime Work: " . $ra -> get($asn -> REMAINING_OVERTIME_WORK).PHP_EOL;// . toString()
          print "--------------------------------------------------------".PHP_EOL;
          $i += 1;
        }


    }

}
?>