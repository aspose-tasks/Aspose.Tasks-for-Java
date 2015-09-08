module Asposetasksjava
  module CreateTaskBaseline
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')
		
    	# Set baseline for the entire project
    	project.setBaseline(Rjb::import('com.aspose.tasks.BaselineType').Baseline)

    	puts "Set baseline for the project."
    end
  end
end
