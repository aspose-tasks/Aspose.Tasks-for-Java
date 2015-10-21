<?php
namespace Aspose\Tasks\WorkingWithCurrencies;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;
class CurrencyDigits{

    public static function run($dataDir=null){

        # Getting Currency Digits
        CurrencyDigits::get_currency_digits($dataDir);

    	# Getting Currency Digits
    	CurrencyDigits::set_currency_digits($dataDir);
    }

    public static function get_currency_digits($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $prj=new Prj();
        print "Currency Digits: " . (string)$project->get($prj->CURRENCY_DIGITS).PHP_EOL;//.to_string
    }

    public static function set_currency_digits($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $prj=new Prj();
        $project->set($prj->CURRENCY_DIGITS, 2);

        $saveFileFormat=new SaveFileFormat();
        $project->save($dataDir . "ProjectCurrDigits.mpp", $saveFileFormat->MPP);
        print "Set currency digits.".PHP_EOL;
    }

}
?>