module Asposetasksjava
  module GetNumberOfPages
    def initialize()
        data_dir = File.dirname(File.dirname(File.dirname(File.dirname(__FILE__)))) + '/data/'
                
        # Instantiate project object
        project = Rjb::import('com.aspose.tasks.Project').new(data_dir + 'test_tasks.mpp')

        presentation_format = Rjb::import('com.aspose.tasks.PresentationFormat')
        timescale = Rjb::import('com.aspose.tasks.Timescale')

        # Get number of pages
        puts "Number of Pages = " + project.getPageCount(presentation_format.ResourceUsage, timescale.Days).to_s

        # Get number of pages (Months)
        puts "Number of Pages = " + project.getPageCount(presentation_format.ResourceUsage, timescale.Months).to_s

        # Get number of pages (ThirdsOfMonths)
        puts "Number of Pages = " + project.getPageCount(presentation_format.ResourceUsage, timescale.ThirdsOfMonths).to_s
    end
  end
end
