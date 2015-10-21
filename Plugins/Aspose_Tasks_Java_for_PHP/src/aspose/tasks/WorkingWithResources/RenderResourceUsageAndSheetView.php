<?php
namespace Aspose\Tasks\WorkingWithResources;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\PdfSaveOptions as PdfSaveOptions;
use com\aspose\tasks\Timescale as Timescale;
use com\aspose\tasks\PresentationFormat as PresentationFormat;

class RenderResourceUsageAndSheetView{

    public static function run($dataDir=null){

        # Rendering Resource Usage
        RenderResourceUsageAndSheetView::render_resource_usage($dataDir);

        # Rendering Resource Sheet View
        RenderResourceUsageAndSheetView::render_resource_sheetview($dataDir);

    }

    public static function render_resource_usage($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

		# Define the SaveOptions with required TimeScale settings as Days
		$options = new PdfSaveOptions();
        $timescale=new Timescale();
        $options->setTimescale($timescale->Days);
		# Set the Presentation format to ResourceUsage
        $presentationFormat=new PresentationFormat();
		$options->setPresentationFormat($presentationFormat->ResourceUsage);
		# Save the Project
		$project->save($dataDir . "result_days.pdf", $options);

		# Set the Tiemscale settings to ThirdsOfMonths
		$options->setTimescale($timescale->ThirdsOfMonths);
		# Save the Project
		$project->save($dataDir . "result_thirdsOfMonths.pdf", $options);

		# Set the Timescale settings to Months
		$options->setTimescale($timescale->Months);
		# Save the project
		$project->save($dataDir . "result_months.pdf", $options);

		print "Created resource usage files.".PHP_EOL;

    }

    public static function render_resource_sheetview($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

		# Define the SaveOptions with required TimeScale settings as Days
		$options = new PdfSaveOptions();

        # Set the Presentation format to ResourceSheet
        $presentationFormat=new PresentationFormat();
        $options->setPresentationFormat($presentationFormat->ResourceSheet);
        $project->save($dataDir . "result.pdf", $options);
		print "Created resource sheet view file.".PHP_EOL;
    }


}
?>