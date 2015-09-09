module Asposetasksjava
  module CriticalAndEffortDrivenTasks
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # Create a ChildTasksCollector instance
		collector = Rjb::import('com.aspose.tasks.ChildTasksCollector').new

		# Collect all the tasks from RootTask using TaskUtils
		Rjb::import('com.aspose.tasks.TaskUtils').apply(project.getRootTask(), collector, 0)

		tsk = Rjb::import('com.aspose.tasks.Tsk')

		# Parse through all the collected tasks
        tasks = collector.getTasks()
        i = 0
        while i < tasks.size()
        	task = tasks.get(i)
	        puts str_ed = task.get(tsk.IS_EFFORT_DRIVEN) != nil ? "EffortDriven" : "Non-EffortDriven"
	 	    puts str_crit = task.get(tsk.IS_CRITICAL) != nil ? "Critical" : "Non-Critical"
            i +=1
		end
    end
  end
end
