module Asposetasksjava
  module ReadingGroupDefinitionData
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        puts "Task Groups Count: " + project.getTaskGroups().size().to_s

        task_group = project.getTaskGroups().toList().get(0)
        puts "Percent Complete:" +  task_group.getName().to_s
        puts "Group Criteria count: " + task_group.getGroupCriteria().size().to_s
    end
  end
end
