module Asposetasksjava
  module SetAttributesForNewTasks
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        prj = Rjb::import('com.aspose.tasks.Prj')

        # Set new task property
        project.set(prj.NEW_TASK_START_DATE, Rjb::import('com.aspose.tasks.TaskStartDateType').CurrentDate)

        project.save(data_dir + "set_attributes_for_new_tasks.xml", Rjb::import('com.aspose.tasks.SaveFileFormat').XML)

        puts "Set attributes for new tasks, please check the output file."
    end
  end
end
