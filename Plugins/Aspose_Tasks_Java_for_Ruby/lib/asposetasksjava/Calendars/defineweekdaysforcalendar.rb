module Asposetasksjava
  module DefineWeekdaysForCalendar
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

        # Define Calendar
        cal = project.getCalendars().add("Calendar1")

        weekday = Rjb::import('com.aspose.tasks.WeekDay')
        daytype = Rjb::import('com.aspose.tasks.DayType')

        # Add working days monday through thursday with default timings
        cal.getWeekDays().add(weekday.createDefaultWorkingDay(daytype.Monday))
        cal.getWeekDays().add(weekday.createDefaultWorkingDay(daytype.Tuesday))
        cal.getWeekDays().add(weekday.createDefaultWorkingDay(daytype.Wednesday))
        cal.getWeekDays().add(weekday.createDefaultWorkingDay(daytype.Thursday))
        cal.getWeekDays().add(Rjb::import('com.aspose.tasks.WeekDay').new(daytype.Saturday))
        cal.getWeekDays().add(Rjb::import('com.aspose.tasks.WeekDay').new(daytype.Sunday))

        # Set friday as short working day
        myWeekDay = Rjb::import('com.aspose.tasks.WeekDay').new(daytype.Friday)

        # Sets working time. Only time part of DateTime is important
        wt1 = Rjb::import('com.aspose.tasks.WorkingTime').new
        calTime = Rjb::import('java.util.Calendar').getInstance()

        calTime.set(1,1,1,9,0,0)
        date = calTime.getTime()
        wt1.setFromTime(date)

        calTime.set(1,1,1,12,0,0)
        date = calTime.getTime()
        wt1.setToTime(date)

        wt2 = Rjb::import('com.aspose.tasks.WorkingTime').new

        calTime.set(1,1,1,13,0,0)
        date = calTime.getTime()
        wt2.setFromTime(date)

        calTime.set(1,1,1,16,0,0)
        date = calTime.getTime()
        wt2.setToTime(date)

        myWeekDay.getWorkingTimes().add(wt1)
        myWeekDay.getWorkingTimes().add(wt2)
        myWeekDay.setDayWorking(true)
        cal.getWeekDays().add(myWeekDay)

        # Save the Project
        project.save(data_dir + "CalendarWeekdays.xml", Rjb::import('com.aspose.tasks.SaveFileFormat').XML)

        puts "Defined weekdays for calendar, please check the output file."
    end
  end
end
