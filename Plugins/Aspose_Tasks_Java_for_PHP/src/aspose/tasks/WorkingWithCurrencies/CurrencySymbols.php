<?php
namespace Aspose\Tasks\WorkingWithCurrencies;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

class CurrencySymbols{

    public static function run($dataDir=null){

        # Getting Currency Symbol
        CurrencySymbols::get_currency_symbol($dataDir);

    	# Getting Currency Symbol
    	CurrencySymbols::set_currency_symbol($dataDir);
    }

    public static function get_currency_symbol($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $prj=new Prj();
        print "Currency Symbol: " . (string)$project->get($prj->CURRENCY_SYMBOL).PHP_EOL;//.to_string
    }

    public static function set_currency_symbol($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $prj=new Prj();
        $project->set($prj->CURRENCY_SYMBOL, "$$");

        $saveFileFormat=new SaveFileFormat();
        $project->save($dataDir . "ProjectCurrSymbols.mpp", $saveFileFormat->MPP);

        exit;
        print "Set currency symbol.".PHP_EOL;
    }

}
?>