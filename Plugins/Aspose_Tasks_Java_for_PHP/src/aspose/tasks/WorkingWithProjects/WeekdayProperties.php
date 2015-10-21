<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;
use com\aspose\tasks\DayType as DayType;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

class WeekdayProperties{

    public static function run($dataDir=null){

        # Reading Weekday Properties
        WeekdayProperties::get_weekday_properties($dataDir);

        # Writing Weekday Properties
        WeekdayProperties::set_weekday_properties($dataDir);
    }

    public static function get_weekday_properties($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $prj = new Prj();

        # Display week days properties
        print "Week Start Date : " . (string)$project->get($prj->WEEK_START_DAY).PHP_EOL;//.toString();
        print "Days Per Month : " . (string)$project->get($prj->DAYS_PER_MONTH).PHP_EOL;//.toString();
        print "Minutes Per Day : " . (string)$project->get($prj->MINUTES_PER_DAY).PHP_EOL;//.toString();
        print "Minutes Per Week : " . (string)$project->get($prj->MINUTES_PER_WEEK).PHP_EOL;//.toString();
    }

    public static function set_weekday_properties($dataDir=null){

        # Instantiate project object
        $project = new Project();

        $prj = new Prj();
        $dayType=new DayType();

        # Set week days properties
        $project->set($prj->WEEK_START_DAY, $dayType->Monday);
        $project->set($prj->DAYS_PER_MONTH, 24);
        $project->set($prj->MINUTES_PER_DAY, 540);
        $project->set($prj->MINUTES_PER_WEEK, 3240);

        $saveFileFormat=new SaveFileFormat();

        $project->save($dataDir . "weekday_properties.xml", $saveFileFormat->XML);

        print "Set weekday properties, please check the output file.".PHP_EOL;
    }

}
?>