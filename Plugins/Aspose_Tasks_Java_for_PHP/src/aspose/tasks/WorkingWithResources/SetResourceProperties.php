<?php
namespace Aspose\Tasks\WorkingWithResources;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Rsc as Rsc;

use java\math\BigDecimal as BigDecimal;

class SetResourceProperties{

    public static function run($dataDir=null){

        $project = new Project();

        # Resource properties are represented by static class Rsc
        $rsc = $project->getResources()->add("Rsc");

		# set resource properties
        $rscc=new Rsc();
        $bigDecimal=new BigDecimal();
		$rsc->set($rscc->STANDARD_RATE, $bigDecimal->valueOf(15));
		$rsc->set($rscc->OVERTIME_RATE, $bigDecimal->valueOf(20));

		print "Set resource properties".PHP_EOL;

    }

}
?>