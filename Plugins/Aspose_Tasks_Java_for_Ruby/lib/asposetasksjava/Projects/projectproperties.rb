module Asposetasksjava
  module ProjectProperties
    def initialize()
        # Read the general project properties
        get_general_project_properties()

        # Reading Default Properties 
        get_default_project_properties()
    end

    def get_general_project_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'Sample.xml')

        prj = Rjb::import('com.aspose.tasks.Prj')

        if project.get(prj.SCHEDULE_FROM_START).getValue()
            puts "Project Start Date : " + project.get(prj.START_DATE).to_string
        else
            puts "Project Finish Date : " + project.get(prj.FINISH_DATE).to_string
        end

        strSchdl = project.get(prj.SCHEDULE_FROM_START).getValue() ? "Project Start Date" : "Project Finish Date"

        puts "Project Schedule From : " + strSchdl.to_s
        puts "Current Date : " + project.get(prj.CURRENT_DATE).to_string
        puts "Status Date : " + project.get(prj.STATUS_DATE).to_string
        puts "Calendar : " + project.get(prj.CALENDAR).getName().to_s
    end

    def get_default_project_properties()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'Sample.xml')

        prj = Rjb::import('com.aspose.tasks.Prj')

        # Display default properties
        puts "Project Version : " + project.get(prj.SAVE_VERSION).to_string
        puts "New Task Default Start: "+ project.get(prj.DEFAULT_START_TIME).to_string
        puts "New Task Default Type: "+ project.get(prj.DEFAULT_TASK_TYPE).to_string
        puts "Resouce Default Standard Rate: "+ project.get(prj.DEFAULT_STANDARD_RATE).to_string
        puts "Resource Default Overtime Rate: "+ project.get(prj.DEFAULT_OVERTIME_RATE).to_string
        puts "Default Task EV Method: "+ project.get(prj.DEFAULT_TASK_EV_METHOD).to_string
        puts "Default Cost Accrual: "+ project.get(prj.DEFAULT_FIXED_COST_ACCRUAL).to_string
    end
  end
end
