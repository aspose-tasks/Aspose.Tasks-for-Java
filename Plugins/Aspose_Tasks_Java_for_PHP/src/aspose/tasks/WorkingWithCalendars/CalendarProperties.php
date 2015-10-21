<?php
namespace Aspose\Tasks\WorkingWithCalendars;

use com\aspose\tasks\Project as Project;

class CalendarProperties{

    public static function run($dataDir=null)
    {

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $calendars = $project->getCalendars()->toList();

        $i = 0;
        while ($i < sizeof($calendars)) {
            $cal = $calendars->get($i);
            if ($cal->getName() != null) {
                print "Base Calendar : ";
                if ($cal -> isBaseCalendar()) {
                    print "Self";
                } else {
                    $cal->getBaseCalendar()->getName();
                }
                print "UID : " . (string)$cal->getUid();//.to_s
                print "Name : " . (string)$cal->getName();//.to_s
            }
            $i += 1;
        }
    }
}

?>