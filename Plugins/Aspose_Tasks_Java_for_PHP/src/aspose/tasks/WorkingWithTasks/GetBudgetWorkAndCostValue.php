<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Tsk as Tsk;
use com\aspose\tasks\Rsc as Rsc;
class GetBudgetWorkAndCostValue{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $project_summary = $project->getRootTask();

        $tsk = new Tsk();
        $rsc = new Rsc();

		print "Project Budget Work = " . (string)$project_summary->get($tsk->BUDGET_WORK).PHP_EOL;//.to_string
		print "Project Budget Cost = " . (string)$project_summary->get($tsk->BUDGET_COST).PHP_EOL;//.to_string

		# Get resource by Uid
		$resource = $project->getResources()->getByUid(1);

		# Display resource budget work
		print "Resource BudgetWork = " . (string)$resource->get($rsc->BUDGET_WORK).PHP_EOL;//.to_string

		# Get next resource by Uid
		$resource = $project->getResources()->getByUid(2);

		# Display resource budget cost
		print "Resource BudgetCost = " . (string)$resource->get($rsc->BUDGET_COST).PHP_EOL;//.to_string
    }
}

?>