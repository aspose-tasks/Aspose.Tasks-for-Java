module Asposetasksjava
  module CalculateTaskDuration
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        tsk = Rjb::import('com.aspose.tasks.Tsk')
        time_unit_type = Rjb::import('com.aspose.tasks.TimeUnitType')

        # Get a task to calculate its duration in different formats
		task = project.getRootTask().getChildren().getById(1)

		# Get the duration in Minutes
		puts task.get(tsk.DURATION).convert(time_unit_type.Minute).toDouble()

		# Get the duration in Days
		puts task.get(tsk.DURATION).convert(time_unit_type.Day).toDouble()
		
		# Get the duration in Hours
		puts task.get(tsk.DURATION).convert(time_unit_type.Hour).toDouble()
		
		# Get the duration in Weeks
		puts task.get(tsk.DURATION).convert(time_unit_type.Week).toDouble()
		
		# Get the duration in Months
		puts task.get(tsk.DURATION).convert(time_unit_type.Month).toDouble()
    end
  end
end
