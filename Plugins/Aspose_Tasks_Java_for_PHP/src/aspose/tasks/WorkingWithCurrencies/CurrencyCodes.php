<?php
namespace Aspose\Tasks\WorkingWithCurrencies;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;

use java\io\FileOutputStream as FileOutputStream;
class CurrencyCodes{

    public static function run($dataDir=null){

        # Getting Currency Code
        CurrencyCodes::get_currency_code($dataDir);

    	# Getting Currency Code
    	CurrencyCodes::set_currency_code($dataDir);
    }

    public static function get_currency_code($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $prj=new Prj();
        print "Currency Code: " . (string)$project->get($prj->CURRENCY_CODE).PHP_EOL;//.to_string
    }

    public static function set_currency_code($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $prj=new Prj();
        $project->set($prj->CURRENCY_CODE, "USD");

        print "Set currency code.".PHP_EOL;

    }

}

?>