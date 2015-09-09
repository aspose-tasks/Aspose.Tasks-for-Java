module Asposetasksjava
  module CreateStandardCalendar
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # Define Calendar
    	cal1 = project.getCalendars().add("My Cal")
    	Rjb::import('com.aspose.tasks.Calendar').makeStandardCalendar(cal1)

    	# Save the Project
    	project.save(data_dir + "CreateStandardCalendar.xml", Rjb::import('com.aspose.tasks.SaveFileFormat').XML)

    	puts "Created standard calendar, please check the output file."
    end
  end
end
