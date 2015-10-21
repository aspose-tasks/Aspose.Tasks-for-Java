<?php
namespace Aspose\Tasks\WorkingWithTasks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Tsk as Tsk;
use java\math\BigDecimal as BigDecimal;

class ManagingTaskCosts{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project();

        $task = $project->getRootTask()->getChildren()->add("Task");

        $tsk = new Tsk();

        $bigDecimal=new BigDecimal();
    	$task->set($tsk->COST, $bigDecimal->valueOf(800));

    	print "Task Remaining Cost: " . (string)$task->get($tsk->REMAINING_COST).PHP_EOL;//.to_string
        print "Task Fixed Cost: " . (string)$task->get($tsk->FIXED_COST).PHP_EOL;//.to_string
        print "Task Cost Variance: " . (string)$task->get($tsk->COST_VARIANCE).PHP_EOL;//.to_string
        print "Project Cost: " . (string)$project->getRootTask()->get($tsk->COST).PHP_EOL;//.to_string
        print "Project Fixed Cost: " . (string)$project->getRootTask()->get($tsk->FIXED_COST).PHP_EOL;//.to_string
        print "Project Remaining Cost: " . (string)$project->getRootTask()->get($tsk->REMAINING_COST).PHP_EOL;//.to_string
        print "Project Variance Cost: " . (string)$project->getRootTask()->get($tsk->COST_VARIANCE).PHP_EOL;//.to_string
    }

}