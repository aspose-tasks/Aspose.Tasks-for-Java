module Asposetasksjava
  module ManagingDuration
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

        task = project.getRootTask().getChildren().add("Task")

        tsk = Rjb::import('com.aspose.tasks.Tsk')

		# task duration in days (default time unit)
		duration = task.get(tsk.DURATION)
		puts "Duration in Days: " + duration.toString()

		# convert to hours time unit
		duration = duration.convert(Rjb::import('com.aspose.tasks.TimeUnitType').Hour)
		puts "Duration in Hours: "+ duration.toString()

		# Decrease task duration
		task.set(tsk.DURATION, task.get(tsk.DURATION).subtract(0.5))
		puts "0.5 wks: " + task.get(tsk.DURATION).toString()
    end
  end
end
