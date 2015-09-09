module Asposetasksjava
  module RenderTaskUsageView
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        # Define the SaveOptions with required TimeScale settings as Days
		options = Rjb::import('com.aspose.tasks.PdfSaveOptions').new
		options.setTimescale(Rjb::import('com.aspose.tasks.Timescale').Days)
		# Set the Presentation format to ResourceUsage
		options.setPresentationFormat(Rjb::import('com.aspose.tasks.PresentationFormat').TaskUsage)
		# Save the Project
		project.save(data_dir + "task_days.pdf", options)

		# Set the Tiemscale settings to ThirdsOfMonths
		options.setTimescale(Rjb::import('com.aspose.tasks.Timescale').ThirdsOfMonths)
		# Save the Project
		project.save(data_dir + "task_thirdsOfMonths.pdf", options)

		# Set the Timescale settings to Months
		options.setTimescale(Rjb::import('com.aspose.tasks.Timescale').Months)
		# Save the project
		project.save(data_dir + "task_months.pdf", options)

		puts "Created task usage view files."
    end
  end
end
