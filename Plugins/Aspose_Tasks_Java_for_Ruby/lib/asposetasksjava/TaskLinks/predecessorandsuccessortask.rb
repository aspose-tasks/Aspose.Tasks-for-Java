module Asposetasksjava
  module PredecessorAndSuccessorTask
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        tsk = Rjb::import('com.aspose.tasks.Tsk')

    	  allinks = project.getTaskLinks().toList()

        i = 0
        while i < allinks.size()
          tsklnk = allinks.get(i)
          puts "Predecessor " + tsklnk.getPredTask().get(tsk.NAME).to_string
          puts "Successor " + tsklnk.getSuccTask().get(tsk.NAME).to_string
          puts "------------------------------------------------------"
          i +=1
        end
    end
  end
end
