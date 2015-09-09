module Asposetasksjava
  module UpdateProjectFile
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # create a new task
        task = project.getRootTask().getChildren().add("Task1")
        
        # set start date
        cal = Rjb::import('java.util.Calendar').getInstance()

        cal.set(2015, 7, 1, 8, 0,0);
        task.set(Rjb::import('com.aspose.tasks.Tsk').START, cal.getTime())

        cal.set(2015, 7, 1, 17, 0, 0)
        task.set(Rjb::import('com.aspose.tasks.Tsk').FINISH , cal.getTime())

        # Save the project as MPP project file
        project.save(data_dir + "AfterLinking.mpp", Rjb::import('com.aspose.tasks.SaveFileFormat').MPP)

        puts "Project file updated, please check the output file."
    end
  end
end
