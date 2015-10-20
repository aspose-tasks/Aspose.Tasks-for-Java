<?php
namespace Aspose\Tasks\WorkingWithCalendarExceptions;

use com\aspose\tasks\Project as Project;
class GetCalendarExceptions{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');
        $calendars = $project->getCalendars()->toList();

        $i=0;
        while ($i<sizeof($calendars)) {
            $cal = $calendars->get($i);
            $calexc = $cal->getExceptions()->getCount();
          if (sizeof($calexc)>0){
            print "From: " .(string)$calexc->getFromDate().PHP_EOL;// -> toString();
            print "To: " .(string)$calexc->getToDate().PHP_EOL;// -> toString();
          }
          $i += 1;
        }
    }
}
?>