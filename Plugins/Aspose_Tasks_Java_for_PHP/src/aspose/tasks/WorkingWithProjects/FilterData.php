<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;

class FilterData{

    public static function run($dataDir=null){
        # Reading Filter Definition Data
        FilterData::get_filter_definition_data($dataDir);
    }

    public static function get_filter_definition_data($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $task_filters = $project->getTaskFilters()->toList();

        print "Task Filters Count: " . (string)$task_filters->size().PHP_EOL;//.to_s
        print "All Tasks: " . (string)$task_filters->get(0)->getName().PHP_EOL;//.to_s
        print "Task Item: " . (string)$task_filters->get(0)->getFilterType().PHP_EOL;//.to_s;
        print "Task Filters Show In Menu: " . (string)$task_filters->get(0)->getShowInMenu().PHP_EOL;//.to_s
        print "Task filter ShowRelatedSummaryRows: "  . (string)$task_filters->get(0)->getShowRelatedSummaryRows().PHP_EOL;//.to_s

        $rsc_filters = $project->getResourceFilters()->toList();

        print "Project.ResourceFilters count: " .  (string)$rsc_filters->size().PHP_EOL;//.to_s
        print "Resource Filter Item Type: Item.ResourceType: "  . (string)$rsc_filters->get(0)->getFilterType().PHP_EOL;//.to_s
        print "Resource filter ShowInMenu"  . (string)$rsc_filters->get(0)->getShowInMenu().PHP_EOL;//.to_s
        print "Resource filter ShowRelatedSummaryRows: " . (string)$rsc_filters->get(0)->getShowRelatedSummaryRows().PHP_EOL;//.to_s
    }

}
?>