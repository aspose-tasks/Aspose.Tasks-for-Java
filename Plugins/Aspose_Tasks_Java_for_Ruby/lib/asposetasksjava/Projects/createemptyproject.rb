module Asposetasksjava
  module CreateEmptyProject
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new

        project_stream =  Rjb::import('java.io.FileOutputStream').new(data_dir + "Project1.xml")
        project.save(project_stream, Rjb::import('com.aspose.tasks.SaveFileFormat').XML)
        project_stream.close()

        # Display Status
        puts "Created project Successfully."
    end
  end
end
