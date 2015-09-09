module Asposetasksjava
  module SaveProjectDataToExcel
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # Save the Project as XLSX
        project.save(data_dir + "Project.XLSX", Rjb::import('com.aspose.tasks.SaveFileFormat').XLSX)

        puts "Saved project data to Excel, please check the output file"

    end
  end
end
