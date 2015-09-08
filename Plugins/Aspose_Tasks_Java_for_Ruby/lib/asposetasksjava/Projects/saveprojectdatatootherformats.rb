module Asposetasksjava
  module SaveProjectDataToOtherFormats
    def initialize()
        # Saving a Project as CSV
        save_to_csv()

        # Saving a Projects as Text
        save_to_text()
    end

    def save_to_csv()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # Save the Project as CSV
        project.save(data_dir + "Project.csv", Rjb::import('com.aspose.tasks.SaveFileFormat').CSV)

        puts "Saved project data to CSV, please check the output file"
    end

    def save_to_text()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # Save the Project as Text
        project.save(data_dir + "Project.txt", Rjb::import('com.aspose.tasks.SaveFileFormat').TXT)

        puts "Saved project data to Text, please check the output file"
    end
  end
end
