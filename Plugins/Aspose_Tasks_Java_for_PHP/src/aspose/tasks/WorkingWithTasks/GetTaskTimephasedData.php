<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Prj as Prj;
use com\aspose\tasks\Tsk as Tsk;
use com\aspose\tasks\NullableBool as NullableBool;
use com\aspose\tasks\Rsc as Rsc;
use com\aspose\tasks\Asn as Asn;
use com\aspose\tasks\WorkContourType as WorkContourType;
use com\aspose\tasks\BaselineType as BaselineType;
use com\aspose\tasks\TimephasedDataType as TimephasedDataType;

use java\util\Calendar as Calendar;
use java\math\BigDecimal as BigDecimal;
use java\util\Date as Date;
class GetTaskTimephasedData{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $prj = new Prj();
        $tsk = new Tsk();

        $cal=new Calendar();
        $cal = $cal->getInstance();

		$cal->set(2013,7,17,8,0,0);
		$project->set($prj->START_DATE, $cal->getTime());
		$project->set($prj->NEW_TASKS_ARE_MANUAL, new NullableBool(false));

		$task = $project->getRootTask()->getChildren()->add("Task");
		$rsc = $project->getResources()->add("Rsc");

        $rscc=new Rsc();
        $bigDecimal=new BigDecimal();

		$rsc->set($rscc->STANDARD_RATE, $bigDecimal->valueOf(10));
		$rsc->set($rscc->OVERTIME_RATE, $bigDecimal->valueOf(15));
		# 6 days duration
		$task->set($tsk->DURATION, $project->getDuration(6));

		$assn = $project->getResourceAssignments()->add($task, $rsc);
		$d = new Date(0);
        $asnn=new Asn();

        $assn->set($asnn->STOP, new Date(0));
		$assn->set($asnn->RESUME, new Date(0));

		# backloaded contour increases task duration from 6 to 10 days
        $workContourType=new WorkContourType();

		$assn->set($asnn->WORK_CONTOUR, $workContourType->BackLoaded);

        $baselineType=new BaselineType();
		$project->setBaseline($baselineType->Baseline);

		$task->set($tsk->PERCENT_COMPLETE, 50);

        $timephasedDataType=new TimephasedDataType();

		$td = $assn->getTimephasedData($assn->get($asnn->START),
                $assn->get($asnn->FINISH),
                $timephasedDataType->AssignmentRemainingWork)->toList();

		print "Size: " . (string)$td->size().PHP_EOL;//.to_s
		print "Value: " . (string)$td->get(0)->getValue().PHP_EOL;//.to_s
    }

}
?>