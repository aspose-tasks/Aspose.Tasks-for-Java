module Asposetasksjava
  module TasksProperties
    def initialize()
        # Getting General Properties
        get_general_properties()

        # Getting Actual Properties
        get_actual_properties()

        # Getting Outline Properties
        get_outline_properties()
    end

    def get_general_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # Create a ChildTasksCollector instance
		collector = Rjb::import('com.aspose.tasks.ChildTasksCollector').new

		# Collect all the tasks from RootTask using TaskUtils
		Rjb::import('com.aspose.tasks.TaskUtils').apply(project.getRootTask(), collector, 0)

		tasks = collector.getTasks()
		#puts tasks.size()
		#abort()

		tsk = Rjb::import('com.aspose.tasks.Tsk')

		# Parse through all the collected tasks
		#tasks.each do |task|
		i = 0
		while i < tasks.size()
			task = tasks.get(i)
		    puts "Task Id:" + task.get(tsk.ID).to_string
		    puts "Task Uid: " + task.get(tsk.UID).to_string
		    puts "Task Name: " + task.get(tsk.NAME).to_string
		    puts "Task Start: " + task.get(tsk.START).to_string
		    puts "Task Finish: "+  task.get(tsk.FINISH).to_string
		    puts "---------------------------------------------"
		    i +=1
		end
    end

    def get_actual_properties()
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
		    puts "Task Name : " + task.get(tsk.NAME).to_string
			puts "Actual Start: " + task.get(tsk.ACTUAL_START).toString()
			puts "Actual Finish: " + task.get(tsk.ACTUAL_FINISH).toString()
			puts "Actual Duration: " + task.get(tsk.ACTUAL_DURATION).toString()
			puts "Actual Cost: " + task.get(tsk.ACTUAL_COST).toString()
			puts "---------------------------------------------"
		    i +=1
		end
    end

    def get_outline_properties()
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
		    puts "Outline Level: " + task.get(tsk.OUTLINE_LEVEL).to_string
			puts "Outline Number: " + task.get(tsk.OUTLINE_NUMBER).to_string
			puts "---------------------------------------------"
		    i +=1
		end
    end
  end
end
