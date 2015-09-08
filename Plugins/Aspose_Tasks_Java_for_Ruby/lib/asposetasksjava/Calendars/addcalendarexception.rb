module Asposetasksjava
  module AddCalendarException
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        cal = project.getCalendars().toList().get(0)

        # Add an exception
        calExc = Rjb::import('com.aspose.tasks.CalendarException').new

        calObject = Rjb::import('java.util.Calendar').getInstance()
        calObject.set(2009, 1, 1, 0, 0, 0)
        calExc.setFromDate(calObject.getTime())

        calObject.set(2009, 1, 3, 0, 0, 0)
        calExc.setToDate(calObject.getTime())

        cal.getExceptions().add(calExc)

        puts "Added calendar excpetion."
    end
  end
end
