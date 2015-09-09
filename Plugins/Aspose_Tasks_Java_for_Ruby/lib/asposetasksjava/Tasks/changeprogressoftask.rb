module Asposetasksjava
  module ChangeProgressOfTask
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

        puts project.getCalculationMode()

        task = project.getRootTask().getChildren().add("Task")

        tsk = Rjb::import('com.aspose.tasks.Tsk')

        task.set(tsk.DURATION, project.getDuration(2))

        task.set(tsk.PERCENT_COMPLETE, 50)

        puts "Changed progress of task."
    end
  end
end
