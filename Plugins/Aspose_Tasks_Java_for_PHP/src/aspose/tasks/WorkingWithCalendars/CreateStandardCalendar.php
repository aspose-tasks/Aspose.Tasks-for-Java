<?php
namespace Aspose\Tasks\WorkingWithCalendars;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Calendar as Calendar;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

class CreateStandardCalendar{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Define Calendar
    	$cal1 = $project->getCalendars()->add("My Cal");
        $calendar=new Calendar();
    	$calendar->makeStandardCalendar($cal1);

    	# Save the Project
        $saveFileFormat=new SaveFileFormat();
    	$project->save($dataDir . "CreateStandardCalendar.xml", $saveFileFormat->XML);

    	print "Created standard calendar, please check the output file.".PHP_EOL;

    }
}
?>