module Asposetasksjava
  module RenderResourceUsageAndSheetView
    def initialize()
        # Rendering Resource Usage
        render_resource_usage()

        # Rendering Resource Sheet View
        render_resource_sheetview()
    end

    def render_resource_usage()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

		# Define the SaveOptions with required TimeScale settings as Days
		options = Rjb::import('com.aspose.tasks.PdfSaveOptions').new
		options.setTimescale(Rjb::import('com.aspose.tasks.Timescale').Days)
		# Set the Presentation format to ResourceUsage
		options.setPresentationFormat(Rjb::import('com.aspose.tasks.PresentationFormat').ResourceUsage)
		# Save the Project
		project.save(data_dir + "result_days.pdf", options)

		# Set the Tiemscale settings to ThirdsOfMonths
		options.setTimescale(Rjb::import('com.aspose.tasks.Timescale').ThirdsOfMonths)
		# Save the Project
		project.save(data_dir + "result_thirdsOfMonths.pdf", options)

		# Set the Timescale settings to Months
		options.setTimescale(Rjb::import('com.aspose.tasks.Timescale').Months)
		# Save the project
		project.save(data_dir + "result_months.pdf", options)

		puts "Created resource usage files."
    end

    def render_resource_sheetview()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

		# Define the SaveOptions with required TimeScale settings as Days
		options = Rjb::import('com.aspose.tasks.PdfSaveOptions').new
		
		# Set the Presentation format to ResourceSheet
		options.setPresentationFormat(Rjb::import('com.aspose.tasks.PresentationFormat').ResourceSheet)
        project.save(data_dir + "result.pdf", options)

		puts "Created resource sheet view file."
    end
  end
end
