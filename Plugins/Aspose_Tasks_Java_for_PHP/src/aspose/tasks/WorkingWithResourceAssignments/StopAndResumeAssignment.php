<?php
namespace Aspose\Tasks\WorkingWithResourceAssignments;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Asn as Asn;
class StopAndResumeAssignment{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $resource_assignments = $project->getResourceAssignments()->toList();

        # Parse through all the collected resource assignments
        $i = 0;
        $asn=new Asn();
        while ($i < sizeof($resource_assignments)) {
          $ra = $resource_assignments -> get($i);
          if ((string)$ra -> get($asn -> STOP) == "1/1/2000") {
              print "NA".PHP_EOL;
              }
          else {
              print (string)$ra -> get($asn -> STOP);// . toString();
          }

          if ((string)$ra -> get($asn -> RESUME) == "1/1/2000"){
          print "NA".PHP_EOL;
          }
          else {
              print (string)$ra -> get($asn -> RESUME);// . toString()
          }
          $i += 1;
        }


    }
}
?>