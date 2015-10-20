<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;

class VerifyProjectStructure{

    public static function run($dataDir=null)
    {
        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');
        if ($project ==true) { //-> check()
            print "Project is ok" . PHP_EOL;
        } else {
            print "Project is not ok" . PHP_EOL;
        }
    }
}
?>