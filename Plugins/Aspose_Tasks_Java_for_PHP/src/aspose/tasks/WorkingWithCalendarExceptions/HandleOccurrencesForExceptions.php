<?php
namespace Aspose\Tasks\WorkingWithCalendarExceptions;

use com\aspose\tasks\CalendarException as CalendarException;
use com\aspose\tasks\CalendarExceptionType as CalendarExceptionType;

class HandleOccurrencesForExceptions{

    public static function run($dataDir=null){

        $except = new CalendarException();
        $except->setEnteredByOccurrences(true);
        $except->setOccurrences(5);

        $calendarExceptionType=new CalendarExceptionType();
        $except->setType($calendarExceptionType->YearlyByDay);

        print "Set Occurences for exeptions".PHP_EOL;
    }
}
?>