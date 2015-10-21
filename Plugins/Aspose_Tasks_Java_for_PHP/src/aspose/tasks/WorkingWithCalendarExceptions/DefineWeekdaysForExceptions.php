<?php
namespace Aspose\Tasks\WorkingWithCalendarExceptions;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\CalendarException as CalendarException;
use com\aspose\tasks\CalendarExceptionType as CalendarExceptionType;

use java\util\Calendar as Calendar;
class DefineWeekdaysForExceptions{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        #Define Calendar
        $cal = $project->getCalendars()->add("Calendar1");

        # Define week days exception for christmis
        $except = new CalendarException();
        $except->setEnteredByOccurrences(false);

        $calendar=new Calendar();
        $calendarExceptionType=new CalendarExceptionType();
        $cal_object = $calendar->getInstance();
        $cal_object->set(2009, 12, 24, 0, 0, 0);
        $except->setFromDate($cal_object->getTime());
        $cal_object->set(2009, 12, 31, 23, 59, 0);
        $except->setToDate($cal_object->getTime());
        $except->setType($calendarExceptionType->Daily);
        $except->setDayWorking(false);
        $cal->getExceptions()->add($except);

        print "Defined weekdays for exceptions.".PHP_EOL;

    }

}