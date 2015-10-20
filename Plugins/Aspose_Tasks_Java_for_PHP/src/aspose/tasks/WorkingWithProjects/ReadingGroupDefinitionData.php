<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
class ReadingGroupDefinitionData{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        print "Task Groups Count: " . $project->getTaskGroups()->size().PHP_EOL;//.to_s;

        $task_group = $project->getTaskGroups()->toList()->get(0);
        print "Percent Complete:" .  (string)$task_group->getName().PHP_EOL;//.to_s
        print "Group Criteria count: " . (string)$task_group->getGroupCriteria()->size().PHP_EOL;//.to_s
    }

}
?>