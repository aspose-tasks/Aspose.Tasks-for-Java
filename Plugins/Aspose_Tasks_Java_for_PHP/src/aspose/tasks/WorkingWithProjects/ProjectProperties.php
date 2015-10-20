<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;

class ProjectProperties{

    public static function run($dataDir=null){

        # Read the general project properties
        ProjectProperties::get_general_project_properties($dataDir);

        # Reading Default Properties
        ProjectProperties::get_default_project_properties($dataDir);
    }

    public static function get_general_project_properties($dataDir=null)
    {

        # Instantiate project object
        $project = new Project($dataDir . 'Sample.xml');

        $prj = new Prj();

        if ($project -> get($prj->SCHEDULE_FROM_START) -> getValue()) {
            print "Project Start Date : " . (string)$project->get($prj->START_DATE).PHP_EOL;//->to_string
            }
        else{
            print "Project Finish Date : " . (string)$project -> get($prj -> FINISH_DATE).PHP_EOL;// . to_string
        }

        $strSchdl = $project->get($prj->SCHEDULE_FROM_START)->getValue() ? "Project Start Date" : "Project Finish Date";

        print "Project Schedule From : " . (string)$strSchdl.PHP_EOL;
        print "Current Date : " . (string)$project->get($prj->CURRENT_DATE).PHP_EOL;
        print "Status Date : " . (string)$project->get($prj->STATUS_DATE).PHP_EOL;
        print "Calendar : " . (string)$project->get($prj->CALENDAR).PHP_EOL.PHP_EOL;//->getName();//.to_s;
    }

    public static function get_default_project_properties($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'Sample.xml');

        $prj = new Prj();

        # Display default properties
        print "Project Version : " . (string)$project->get($prj->SAVE_VERSION).PHP_EOL;//.to_string
        print "New Task Default Start: ". (string)$project->get($prj->DEFAULT_START_TIME).PHP_EOL;//.to_string
        print "New Task Default Type: ". (string)$project->get($prj->DEFAULT_TASK_TYPE).PHP_EOL;//.to_string
        print "Resouce Default Standard Rate: ". (string)$project->get($prj->DEFAULT_STANDARD_RATE).PHP_EOL;//.to_string
        print "Resource Default Overtime Rate: ". (string)$project->get($prj->DEFAULT_OVERTIME_RATE).PHP_EOL;//.to_string
        print "Default Task EV Method: ". (string)$project->get($prj->DEFAULT_TASK_EV_METHOD).PHP_EOL;//.to_string
        print "Default Cost Accrual: ". (string)$project->get($prj->DEFAULT_FIXED_COST_ACCRUAL).PHP_EOL;//.to_string
    }

}
?>