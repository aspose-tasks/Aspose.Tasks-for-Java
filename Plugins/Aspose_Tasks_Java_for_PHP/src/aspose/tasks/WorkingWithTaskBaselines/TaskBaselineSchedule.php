<?php
namespace Aspose\Tasks\WorkingWithTaskBaselines;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\BaselineType as BaselineType;
class TaskBaselineSchedule{

    public static function run($dataDir=null){

        $onesec = 10000000;
        $onemin = 60 * $onesec;
        $onehour = 60 * $onemin;

        # Instantiate project object
        $project = new Project();

        # Creating TaskBaseline:
        $task = $project->getRootTask()->getChildren()->add("Task");
        $baselineType=new BaselineType();
        $project->setBaseline($baselineType->Baseline);

        $baseline = $task->getBaselines()->toList()->get(0);
        $duration = (double)(string)($baseline->getDuration());//.toDouble();
        $baseline_duration = $duration / $onehour;
        print $baseline_duration;
        print "Baseline Start: "  . (string)$baseline->getStart().PHP_EOL;//.to_string;
        print "Baseline Finish: " . (string)$baseline->getFinish().PHP_EOL;//.to_string;

    }

}
?>