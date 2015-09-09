module Asposetasksjava
  module ParentAndChildTasks
    def initialize()
    	# Getting Parent and Child Tasks
    	get_parent_and_child_tasks()
    end
    
    def get_parent_and_child_tasks()	
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

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
			puts "Task Name = " + task.get(tsk.NAME).to_string
			i +=1
		end
    end
  end
end
