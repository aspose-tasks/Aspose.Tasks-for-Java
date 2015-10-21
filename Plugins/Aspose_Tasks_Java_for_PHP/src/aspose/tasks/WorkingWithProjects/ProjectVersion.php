<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;

class ProjectVersion{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'Sample.xml');

        # Display project version property
        $prj=new Prj();
        print "Project Version : " . (string)$project->get($prj->SAVE_VERSION).PHP_EOL; //->to_string
        print "Last Saved : " . (string)$project->get($prj->LAST_SAVED).PHP_EOL;
    }

}
?>