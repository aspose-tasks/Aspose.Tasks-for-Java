module Asposetasksjava
  module CreateCalendar
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # Define Calendar
    	cal1 = project.getCalendars().add("no info")
    	cal2 = project.getCalendars().add("no name")
    	cal3 = project.getCalendars().add("cal3")

    	# Save the Project
    	project.save(data_dir + "CreateCalendar.xml", Rjb::import('com.aspose.tasks.SaveFileFormat').XML)

    	puts "Created calendar, please check the output file."
    end
  end
end
