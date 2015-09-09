module Asposetasksjava
  module GetCalendarExceptions
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        calendars = project.getCalendars().toList()

        i = 0
        while i < calendars.size()
          cal = calendars.get(i)
          calexc = cal.getExceptions().getCount()
          if calexc > 0
            puts "From: " + calexc.getFromDate().toString()
            puts "To: " + calexc.getToDate().toString()
          end
          i +=1
        end
    end
  end
end
