module Asposetasksjava
  module CreateTaskLink
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

    	pred = project.getRootTask().getChildren().add("Task 1")
    	succ = project.getRootTask().getChildren().add("Task 2")
    	link = project.getTaskLinks().add(pred, succ)

    	puts "Created task link."
    end
  end
end
