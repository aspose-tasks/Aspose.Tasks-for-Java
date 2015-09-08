module Asposetasksjava
  module StopAndResumeTask
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # Create a ChildTasksCollector instance
		collector = Rjb::import('com.aspose.tasks.ChildTasksCollector').new

		# Collect all the tasks from RootTask using TaskUtils
		Rjb::import('com.aspose.tasks.TaskUtils').apply(project.getRootTask(), collector, 0)

		tasks = collector.getTasks()

		tsk = Rjb::import('com.aspose.tasks.Tsk')

		# Parse through all the collected tasks
		i = 0
		while i < tasks.size()
			task = tasks.get(i)
		    if task.get(tsk.STOP).toString() == "1/1/2015"
				puts "NA"
			else
				puts "Task Stop: " + task.get(tsk.STOP).toString()
			end

			if task.get(tsk.RESUME).toString() == "1/1/2015"
				puts "NA"
			else
				puts "Task Resume: " + task.get(tsk.RESUME).toString()
			end	  
		    puts "---------------------------------------------"
		    i +=1
		end
    end
  end
end
