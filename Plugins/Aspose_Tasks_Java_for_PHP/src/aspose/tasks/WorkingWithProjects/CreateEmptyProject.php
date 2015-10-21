<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\SaveFileFormat as SaveFileFormat;

use java\io\FileOutputStream as FileOutputStream;

class CreateEmptyProject
{
    public static function run($dataDir=null)
    {
        # Instantiate project object
        $project = new Project();

        $project_stream =  new FileOutputStream($dataDir . "Project1.xml");
        $saveFileFormat=new SaveFileFormat();
        $project->save($project_stream, $saveFileFormat->XML);
        $project_stream->close();

        # Display Status
        print "Created project Successfully.".PHP_EOL;

    }
}
?>