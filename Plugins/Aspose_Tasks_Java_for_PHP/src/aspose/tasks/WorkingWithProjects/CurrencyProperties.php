<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;
use com\aspose\tasks\CurrencySymbolPositionType as CurrencySymbolPositionType;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

class CurrencyProperties{

    public static function run($dataDir=null){

        # Reading Currency Properties
        CurrencyProperties::get_currency_properties($dataDir);

        # Writing Currency Properties
        CurrencyProperties::set_currency_properties($dataDir);
    }

    public static function get_currency_properties($dataDir=null){
        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $prj = new Prj();

        # Display currency properties
        print "Currency Code : " . (string)$project->get($prj->CURRENCY_CODE).PHP_EOL;//.toString()
        print "<br>Currency Digits : " . (string)$project->get($prj->CURRENCY_DIGITS).PHP_EOL;//.toString()
        print "<br>Currency Symbol : " . (string)$project->get($prj->CURRENCY_SYMBOL).PHP_EOL;//.toString()
        print "Currency Symbol Position: ". (string)$project->get($prj->CURRENCY_SYMBOL_POSITION).PHP_EOL;//.toString()
    }

    public static function set_currency_properties($dataDir=null){

        # Instantiate project object
        $project = new Project();

        $prj = new Prj();

        # Set currency properties
        $currencySymbolPositionType=new CurrencySymbolPositionType();

        $project->set($prj->CURRENCY_CODE, "AUD");
        $project->set($prj->CURRENCY_DIGITS, 2);
        $project->set($prj->CURRENCY_SYMBOL, "$");
        $project->set($prj->CURRENCY_SYMBOL_POSITION, $currencySymbolPositionType->After);

        $saveFileFormat=new SaveFileFormat();
        $project->save($dataDir . "currency_properties.xml", $saveFileFormat->XML);
        print "Set currency properties, please check the output file.".PHP_EOL;
    }

}
?>