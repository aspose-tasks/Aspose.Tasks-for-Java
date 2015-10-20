<?php
namespace Aspose\Tasks\WorkingWithResources;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\ExtendedAttribute as ExtendedAttribute;

class ExtendedResourceAttributes{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

		$res = $project->getResources()->toList()->get(0);

		$ea = new ExtendedAttribute();
        $ea->setFieldId("11");
		$ea->setValue("MyValueEA");
		$ea->setValueGuid("MyValueGuidEA");
		$res->getExtendedAttributes()->add($ea);
		print "Set extended resource attributes.".PHP_EOL;
    }
}
?>