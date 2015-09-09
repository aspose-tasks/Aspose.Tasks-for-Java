module Asposetasksjava
  module ProjectVersion
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'Sample.xml')

        # Display project version property
        puts "Project Version : " + project.get(Rjb::import('com.aspose.tasks.Prj').SAVE_VERSION).to_string
        puts "Last Saved : " + project.get(Rjb::import('com.aspose.tasks.Prj').LAST_SAVED).to_string
    end
  end
end
