module Asposetasksjava
  module CreateResourceAssignment
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        task = project.getRootTask().getChildren().add("Task")

    	rsc = project.getResources().add("Rsc")

    	assn = project.getResourceAssignments().add(task, rsc)

    	puts "Created resource assignment."
    end
  end
end
