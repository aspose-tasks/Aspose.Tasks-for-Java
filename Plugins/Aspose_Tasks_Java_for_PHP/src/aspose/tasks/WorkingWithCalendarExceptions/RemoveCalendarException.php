<?php
namespace Aspose\Tasks\WorkingWithCalendarExceptions;

use com\aspose\tasks\Project as Project;

class RemoveCalendarException{
    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Remove an exception
        $cal = $project->getCalendars()->toList()->get(0);
        if((int)(string)($cal->getExceptions()->getCount()) > 1) {
            $exc = $cal -> getExceptions() -> toList() -> get(0);
            $cal -> getExceptions() -> remove($exc);
            print "Removed calendar exception.".PHP_EOL;
        }

    }

}
