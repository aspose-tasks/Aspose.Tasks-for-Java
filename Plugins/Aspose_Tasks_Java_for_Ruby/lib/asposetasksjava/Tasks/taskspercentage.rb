module Asposetasksjava
  module TasksPercentage
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'project.mpp')

        # Create a ChildTasksCollector instance
		collector = Rjb::import('com.aspose.tasks.ChildTasksCollector').new

		# Collect all the tasks from RootTask using TaskUtils
		Rjb::import('com.aspose.tasks.TaskUtils').apply(project.getRootTask(), collector, 0)

		tsk = Rjb::import('com.aspose.tasks.Tsk')

		tasks = collector.getTasks()

		# Parse through all the collected tasks
		i = 0
		while i < tasks.size()
			task = tasks.get(i)
			puts task.get(tsk.PERCENT_COMPLETE).toString()
			puts task.get(tsk.PERCENT_WORK_COMPLETE).toString()
			puts task.get(tsk.PHYSICAL_PERCENT_COMPLETE).toString()
			i +=1
		end
    end
  end
end
