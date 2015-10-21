<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

class SaveProjectDataToExcel{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Save the Project as XLSX
        $saveFileFormat=new SaveFileFormat();
        $project->save($dataDir . "Project.XLSX", $saveFileFormat->XLSX);

        print "Saved project data to Excel, please check the output file".PHP_EOL;

    }
}
?>