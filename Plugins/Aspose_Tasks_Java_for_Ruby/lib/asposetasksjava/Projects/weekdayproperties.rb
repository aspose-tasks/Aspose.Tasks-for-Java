module Asposetasksjava
  module WeekdayProperties
    def initialize()
        # Reading Weekday Properties
        get_weekday_properties()

        # Writing Weekday Properties 
        set_weekday_properties()
    end

    def get_weekday_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        prj = Rjb::import('com.aspose.tasks.Prj')

        # Display week days properties
        puts "Week Start Date : " + project.get(prj.WEEK_START_DAY).toString()
        puts "Days Per Month : " + project.get(prj.DAYS_PER_MONTH).toString()
        puts "Minutes Per Day : " + project.get(prj.MINUTES_PER_DAY).toString()
        puts "Minutes Per Week : " + project.get(prj.MINUTES_PER_WEEK).toString()
    end

    def set_weekday_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

        prj = Rjb::import('com.aspose.tasks.Prj')

        # Set week days properties
        project.set(prj.WEEK_START_DAY, Rjb::import('com.aspose.tasks.DayType').Monday)
        project.set(prj.DAYS_PER_MONTH, 24)
        project.set(prj.MINUTES_PER_DAY, 540)
        project.set(prj.MINUTES_PER_WEEK, 3240)

        project.save(data_dir + "weekday_properties.xml", Rjb::import('com.aspose.tasks.SaveFileFormat').XML)

        puts "Set weekday properties, please check the output file."
    end
  end
end
