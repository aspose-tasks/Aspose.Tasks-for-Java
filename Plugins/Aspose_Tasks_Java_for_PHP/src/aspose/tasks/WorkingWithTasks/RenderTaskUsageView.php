<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\PdfSaveOptions as PdfSaveOptions;
use com\aspose\tasks\Timescale as Timescale;
use com\aspose\tasks\PresentationFormat as PresentationFormat;

class RenderTaskUsageView{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        # Define the SaveOptions with required TimeScale settings as Days
		$options = new PdfSaveOptions();
        $timescale=new Timescale();
        $options->setTimescale($timescale->Days);

		# Set the Presentation format to ResourceUsage
        $presentationFormat=new PresentationFormat();
		$options->setPresentationFormat($presentationFormat->TaskUsage);
		# Save the Project
		$project->save($dataDir . "task_days.pdf", $options);

		# Set the Tiemscale settings to ThirdsOfMonths
		$options->setTimescale($timescale->ThirdsOfMonths);
		# Save the Project
		$project->save($dataDir . "task_thirdsOfMonths.pdf", $options);

		# Set the Timescale settings to Months
		$options->setTimescale($timescale->Months);
		# Save the project
		$project->save($dataDir . "task_months.pdf", $options);

		print "Created task usage view files.".PHP_EOL;
    }

}

?>