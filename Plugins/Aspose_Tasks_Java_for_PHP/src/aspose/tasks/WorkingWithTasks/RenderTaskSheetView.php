<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\PdfSaveOptions as PdfSaveOptions;
use com\aspose\tasks\PresentationFormat as PresentationFormat;

class RenderTaskSheetView{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Define the SaveOptions with required TimeScale settings as Days
    	$options = new PdfSaveOptions();

        # Set the Presentation format to ResourceUsage
        $presentationFormat=new PresentationFormat();
        $options->setPresentationFormat($presentationFormat->TaskSheet);
    	# Save the Project
    	$project->save($dataDir . "taskSheet.pdf", $options);
    	print "Created task sheet view file.".PHP_EOL;
    }
}
?>