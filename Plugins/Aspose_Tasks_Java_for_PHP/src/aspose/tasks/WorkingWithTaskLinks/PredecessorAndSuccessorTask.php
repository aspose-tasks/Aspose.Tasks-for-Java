<?php
namespace Aspose\Tasks\WorkingWithTaskLinks;

use com\aspose\tasks\Project as Project;
use com\aspose\tasks\Tsk as Tsk;
class PredecessorAndSuccessorTask{

    public static function run($dataDir=null){

        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $tsk = new Tsk();

        $allinks = $project->getTaskLinks()->toList();
        $i = 0;
        while ($i < sizeof($allinks)) {

          $tsklnk = $allinks -> get($i);
          print "Predecessor " . (string)$tsklnk -> getPredTask() -> get($tsk-> NAME).PHP_EOL;// . to_string
          print "Successor " . (string)$tsklnk -> getSuccTask() -> get($tsk -> NAME).PHP_EOL;// . to_string
          print "------------------------------------------------------".PHP_EOL;
          $i += 1;
        }
    }

}
?>