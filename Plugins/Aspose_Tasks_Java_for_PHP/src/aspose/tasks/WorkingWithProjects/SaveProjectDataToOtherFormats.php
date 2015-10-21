<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

class SaveProjectDataToOtherFormats{

    public static function run($dataDir=null){

        # Saving a Project as CSV
        SaveProjectDataToOtherFormats::save_to_csv($dataDir);

        # Saving a Projects as Text
        SaveProjectDataToOtherFormats::save_to_text();
    }

    public static function save_to_csv($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Save the Project as CSV
        $saveFileFormat=new SaveFileFormat();
        $project->save($dataDir . "Project.csv", $saveFileFormat->CSV);
        print "Saved project data to CSV, please check the output file".PHP_EOL;
    }

    public static function save_to_text($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Save the Project as Text
        $saveFileFormat=new SaveFileFormat();
        $project->save($dataDir . "Project.txt", $saveFileFormat->TXT);
        print "Saved project data to Text, please check the output file".PHP_EOL;
    }

}
?>