<?php
namespace Aspose\Tasks\WorkingWithCalendars;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

class CreateCalendar{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Define Calendar
    	$cal1 = $project->getCalendars()->add("no info");
    	$cal2 = $project->getCalendars()->add("no name");
    	$cal3 = $project->getCalendars()->add("cal3");

    	# Save the Project
        $saveFileFormat=new SaveFileFormat();
    	$project->save($dataDir . "CreateCalendar.xml", $saveFileFormat->XML);
    	print "Created calendar, please check the output file.".PHP_EOL;
    }

}
?>