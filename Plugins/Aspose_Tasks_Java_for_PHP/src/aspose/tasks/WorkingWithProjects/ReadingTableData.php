<?php
namespace Aspose\Tasks\WorkingWithProjects;

use com\aspose\tasks\Project as Project;
class ReadingTableData{

    public static function run($dataDir=null){
        # Instantiate project object
        $project = new Project($dataDir . 'test_tasks.mpp');

        $t1 = $project->getTables()->toList()->get(0);
        print "Table Fields Count" . (string)$t1->getTableFields()->size();//.to_s

        $f = $t1->getTableFields()->get(0);
        print "Field width: " . (string)$f->getWidth().PHP_EOL;//.to_s
        print "Field Title: " . (string)$f->getTitle().PHP_EOL;//.to_s
        print "Field Title Alignment: " . (string)$f->getAlignTitle().PHP_EOL;//.to_s
        print "Field Align Data: " . $f->getAlignData().PHP_EOL;//.to_s

        $f = $t1->getTableFields()->get(1);
        print "Field width: " . (string)$f->getWidth().PHP_EOL;//.to_s
        print "Field Title: " . (string)$f->getTitle().PHP_EOL;//.to_s
        print "Field Title Alignment: " . (string)$f->getAlignTitle().PHP_EOL;//.to_s
        print "Field Align Data: " . (string)$f->getAlignData().PHP_EOL;//.to_s
    }

}
?>