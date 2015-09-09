module Asposetasksjava
  module RenderTaskSheetView
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # Define the SaveOptions with required TimeScale settings as Days
    	options = Rjb::import('com.aspose.tasks.PdfSaveOptions').new
    	# Set the Presentation format to ResourceUsage
    	options.setPresentationFormat(Rjb::import('com.aspose.tasks.PresentationFormat').TaskSheet)
    	# Save the Project
    	project.save(data_dir + "taskSheet.pdf", options)

    	puts "Created task sheet view file."
    end
  end
end
