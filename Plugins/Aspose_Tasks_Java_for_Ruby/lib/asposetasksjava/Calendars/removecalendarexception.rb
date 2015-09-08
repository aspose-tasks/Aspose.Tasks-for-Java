module Asposetasksjava
  module RemoveCalendarException
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # Remove an exception
        cal = project.getCalendars().toList().get(0)
        if cal.getExceptions().getCount() > 1
            exc = cal.getExceptions().toList().get(0)
            cal.getExceptions().remove(exc)
            puts "Removed calendar exception."
        end
    end
  end
end
