<?php
namespace Aspose\Tasks\WorkingWithResourceAssignments;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Asn as Asn;
use com\aspose\tasks\Rsc as Rsc;

use java\math\BigDecimal as BigDecimal;

class ResourceAssignmentProperties{

    public static function run($dataDir=null){

        # Getting General Resource Assignment Properties
        ResourceAssignmentProperties::get_resource_assignments($dataDir);

      # Setting General Resource Assignment Properties
      ResourceAssignmentProperties::set_resource_assignments($dataDir);

    }

    public static function get_resource_assignments($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $resource_assignments = $project->getResourceAssignments()->toList();

        # Parse through all the collected resource assignments
        $i = 0;
        while ($i < sizeof($resource_assignments)){
        $ra = $resource_assignments->get($i);

        $asn=new Asn();
          print $ra->get($asn->UID).PHP_EOL;//.to_string
          print $ra->get($asn->START).PHP_EOL;//.to_string
          print $ra->get($asn->FINISH).PHP_EOL;//.to_string
          print "--------------------------------------------------------".PHP_EOL;
          $i +=1;
        }
    }

    public static function set_resource_assignments($dataDir=null){

        # Instantiate project object
        $project = new Project();

        $task = $project->getRootTask()->getChildren()->add("Task");
        $rsc = $project->getResources()->add("Rsc");

        $rscc=new Rsc();
        $bigDecimal=new BigDecimal();
        $rsc->set($rscc->STANDARD_RATE, $bigDecimal->valueOf(10));
        $rsc->set($rscc->OVERTIME_RATE, $bigDecimal->valueOf(15));
        $assn = $project->getResourceAssignments()->add($task, $rsc);

        print "Set resource assignment properties.".PHP_EOL;
    }

}
?>