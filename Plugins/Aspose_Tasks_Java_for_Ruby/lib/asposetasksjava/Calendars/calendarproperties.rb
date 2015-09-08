module Asposetasksjava
  module CalendarProperties
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        calendars = project.getCalendars().toList()

        i = 0
        while i < calendars.size()
          cal = calendars.get(i)
          if cal.getName() != nil
            puts "Base Calendar : "
            if cal.isBaseCalendar()
              puts "Self"
            else
              cal.getBaseCalendar().getName()
            end  
            puts "UID : " + cal.getUid().to_s
            puts "Name : " + cal.getName().to_s
          end
          i +=1
        end
    end
  end
end
