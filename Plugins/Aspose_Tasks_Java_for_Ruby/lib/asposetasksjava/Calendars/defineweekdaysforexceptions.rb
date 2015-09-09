module Asposetasksjava
  module DefineWeekdaysForExceptions
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        #Define Calendar
        cal = project.getCalendars().add("Calendar1")

        # Define week days exception for christmis
        except = Rjb::import('com.aspose.tasks.CalendarException').new
        except.setEnteredByOccurrences(false)

        cal_object = Rjb::import('java.util.Calendar').getInstance()
        cal_object.set(2009, 12, 24, 0, 0, 0)
        except.setFromDate(cal_object.getTime())
        cal_object.set(2009, 12, 31, 23, 59, 0)
        except.setToDate(cal_object.getTime())
        except.setType(Rjb::import('com.aspose.tasks.CalendarExceptionType').Daily)
        except.setDayWorking(false)
        cal.getExceptions().add(except)

        puts "Defined weekdays for exceptions."
    end
  end
end
