<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\PresentationFormat as PresentationFormat;
use com\aspose\tasks\Timescale as Timescale;

class GetNumberOfPages{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $presentation_format = new PresentationFormat();
        $timescale = new Timescale();

        # Get number of pages
        print "Number of Pages = " . (string)$project->getPageCount($presentation_format->ResourceUsage, $timescale->Days).PHP_EOL;//.to_s

        # Get number of pages (Months)
        print "Number of Pages = " . (string)$project->getPageCount($presentation_format->ResourceUsage, $timescale->Months).PHP_EOL;//.to_s

        # Get number of pages (ThirdsOfMonths)
        print "Number of Pages = " . (string)$project->getPageCount($presentation_format->ResourceUsage, $timescale->ThirdsOfMonths).PHP_EOL;//.to_s

    }
}
?>