module Asposetasksjava
  module VerifyProjectStructure
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        if project.check()
            puts "Project is ok"
        else
            puts "Project is not ok"
        end
    end
  end
end
