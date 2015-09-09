module Asposetasksjava
  module ProjectSummary
    def initialize()
        # Reading Project Summary Information
        get_project_summary()
    end

    def get_project_summary()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'Sample.xml')

        prj = Rjb::import('com.aspose.tasks.Prj')

        puts "Author: " + project.get(prj.AUTHOR).to_s
        puts "Author Last Author: " + project.get(prj.LAST_AUTHOR).to_s
        puts "Revision: " + project.get(prj.REVISION).to_string
        puts "Keywords: " + project.get(prj.KEYWORDS).to_s
        puts "Comments: " + project.get(prj.COMMENTS).to_s

        puts "Creation Date: " + project.get(prj.CREATION_DATE).to_string
        puts "Last Printed: " + project.get(prj.LAST_PRINTED).to_string
    end
  end
end
