<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;
use com\aspose\tasks\Month as Month;
use com\aspose\tasks\NullableBool as NullableBool;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

class FiscalYearProperties{

    public static function run($dataDir=null){

        # Reading Fiscal Year Properties
        FiscalYearProperties::get_fiscal_year_properties($dataDir);

        # Writing Fiscal Year Properties
        FiscalYearProperties::set_fiscal_year_properties($dataDir);
    }

    public static function get_fiscal_year_properties($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $prj = new Prj();

        # Display fiscal year properties
        print "Fiscal Year Start Date : " . (string)$project->get($prj->FY_START_DATE).PHP_EOL;//.toString();
        print "Fiscal Year Numbering : " . (string)$project->get($prj->FISCAL_YEAR_START).PHP_EOL;//.toString()
    }

    public static function set_fiscal_year_properties($dataDir=null){

        # Instantiate project object
        $project = new Project();

        $prj = new Prj();

        # Set fiscal year properties
        $month=new Month();
        $project->set($prj->FY_START_DATE, $month->July);
        $project->set($prj->FISCAL_YEAR_START, new NullableBool(true));

        $saveFileFormat=new SaveFileFormat();

        $project->save($dataDir . "fiscal_year_properties.xml", $saveFileFormat->XML);
        print "Set fiscal year properties, please check the output file.".PHP_EOL;
    }
}
?>