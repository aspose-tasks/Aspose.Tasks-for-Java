<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\PdfSaveOptions as PdfSaveOptions;
use com\aspose\tasks\Timescale as Timescale;
use com\aspose\tasks\PresentationFormat as PresentationFormat;

class SaveProjectAsPdf{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $options = new PdfSaveOptions();

            # Set the LegendOnEachPage property to false to hide legends

            # Set the row height to fit cell content
        $timescale=new Timescale();
        $presentationFormat=new PresentationFormat();

        $options->setFitContent(true);
        $options->setTimescale($timescale->Months);
        $options->setPresentationFormat($presentationFormat->TaskUsage);
        $options->setLegendOnEachPage(false);
        $project->save($dataDir . "project.pdf", $options);

        print "Saved project as pdf, please check the output file.".PHP_EOL;

    }

}
?>