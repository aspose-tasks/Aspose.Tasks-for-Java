<?php
namespace Aspose\Tasks\WorkingWithCalendarExceptions;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\CalendarException as CalendarException;

use java\util\Calendar as Calendar;
class AddCalendarException{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $cal = $project->getCalendars()->toList()->get(0);

        # Add an exception
        $calExc = new CalendarException();
        $calendar=new Calendar();
        $calObject = $calendar->getInstance();
        $calObject->set(2009, 1, 1, 0, 0, 0);
        $calExc->setFromDate($calObject->getTime());
        $calObject->set(2009, 1, 3, 0, 0, 0);
        $calExc->setToDate($calObject->getTime());
        $cal->getExceptions()->add($calExc);
        print "Added calendar excpetion.".PHP_EOL;
    }
}
?>