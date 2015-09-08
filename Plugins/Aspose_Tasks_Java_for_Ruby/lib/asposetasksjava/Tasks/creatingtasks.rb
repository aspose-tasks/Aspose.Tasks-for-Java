module Asposetasksjava
  module CreatingTasks
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        task = project.getRootTask().getChildren().add("Summary1")
        subtask = task.getChildren().add("Subtask1")
    end
  end
end
